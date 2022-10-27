import 'package:flutter/material.dart';
import 'package:flutter_module/presentation/styles/color_styles.dart';
import 'package:flutter_module/presentation/styles/dimens.dart';
import 'package:flutter_module/presentation/styles/padding_styles.dart';

class SurfaceStyles {
  static snippetCard({required Widget child, GestureTapCallback? onTap}) {
    return Card(
      color: ColorStyles.surfacePrimary(),
      shape: RoundedRectangleBorder(
        borderRadius: BorderRadius.circular(Dimens.m),
      ),
      child: InkWell(
        borderRadius: BorderRadius.circular(Dimens.m),
        onTap: onTap,
        child: child,
      ),
    );
  }

  static rateBox(Widget child) {
    return DecoratedBox(
      decoration: BoxDecoration(
        color: ColorStyles.codeBackground(),
        borderRadius: BorderRadius.circular(Dimens.l),
      ),
      child: PaddingStyles.regular(
        Center(child: child),
      ),
    );
  }
}
