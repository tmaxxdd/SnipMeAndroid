import 'package:flutter/material.dart';
import 'package:flutter_module/model/main_model.dart';
import 'package:flutter_module/utils/extensions/collection_extensions.dart';
import 'package:test/test.dart';

void main() {
  const style = TextStyle(color: Colors.black);

  group('toSpans', () {
    test('Returns list with single span for null or empty collection', () async {
      // null
      List<SyntaxToken?>? nullList = null;
      expect((await nullList.toSpans("", style)).length, 1);
      // empty
      List<SyntaxToken?>? emptyList = List.empty();
      expect((await emptyList.toSpans("", style)).length, 1);
    });

    test('Returns spans for whole phrase', () async {
      const code = "class Abcd { }";
      List<SyntaxToken?>? tokens = [SyntaxToken(start: 0, end: 4, color: 0)];

      final result = await tokens.toSpans(code, style);

      expect(result.length, 2);
    });

    test('Returns base span for non syntax phrases', () async {
      const code = "class Abcd { }";
      List<SyntaxToken?>? tokens = [SyntaxToken(start: 0, end: 4, color: 0)];

      final result = await tokens.toSpans(code, style);

      expect(result.length, 2);
      expect(result.last.style!.color!.value, style.color!.value);
    });

    test('Returns syntax spans for syntax phrases', () async {
      const code = "class Abcd { }";
      List<SyntaxToken?>? tokens = [
        null,
        SyntaxToken(start: 0, end: 4, color: Colors.red.value)
      ];

      final result = await tokens.toSpans(code, style);

      expect(result.length, 2);
      expect(result.first.style!.color!.value, Colors.red.value);
    });

    test('Larger syntax span overlaps smaller', () async {
      const code = "Code = 'class Abcd { }'";

      List<SyntaxToken?>? tokens = [
        SyntaxToken(start: 8, end: 13, color: Colors.red.value),
        SyntaxToken(start: 7, end: 23, color: Colors.green.value),
      ];

      final result = await tokens.toSpans(code, style);

      print(result);

      expect(result.length, 2);
      expect(result[1].style!.color!.value, Colors.green.value);
    });
  });
}
