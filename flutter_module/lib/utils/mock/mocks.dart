import 'package:flutter/material.dart';
import 'package:flutter_module/model/main_model.dart';

class Mocks {
  static final snippet = Snippet(
    uuid: '',
    title: 'New snippet',
    owner: Owner(id: 0, login: 'Snippet owner'),
    timeAgo: '2 days ago',
    voteResult: 32,
    userReaction: UserReaction.like,
    isLiked: true,
    isDisliked: false,
    isPrivate: true,
    language: SnippetLanguage(
      raw: 'Python',
      type: SnippetLanguageType.python,
    ),
    code: SnippetCode(
      raw: '''
      #!/usr/bin/env python
"""Test file for Python syntax highlighting in editors / IDEs.
Meant to cover a wide range of different types of statements and expressions.
Not necessarily sensical or comprehensive (assume that if one exception is
highlighted that all are, for instance).
Extraneous trailing whitespace can't be tested because of svn pre-commit hook
checks for such things.
"""
# Comment
# OPTIONAL: XXX catch your attention
# TODO(me): next big thing
# FIXME: this does not work

# Statements
from __future__ import with_statement  # Import
from sys import path as thing

print(thing)

assert True  # keyword


def foo():  # function definition
    return []


class Bar(object):  # Class definition
    def __enter__(self):
        pass

    def __exit__(self, *args):
        pass

foo()  # UNCOLOURED: function call
while False:  # 'while'
    continue
for x in foo():  # 'for'
    break
with Bar() as stuff:
    pass
if False:
    pass  # 'if'
elif False:
    pass
else:
    pass

# Constants
'single-quote', u'unicode'  # Strings of all kinds; prefixes not highlighted
"double-quote"
"""triple double-quote"""
r'raw'
ur'unicode raw'
'escape\n'
'\04'  # octal
'\xFF'  # hex
'\u1111'  # unicode character
1  # Integral
1L
1.0  # Float
.1
1+2j  # Complex

# Expressions
1 and 2 or 3  # Boolean operators
2 < 3  # UNCOLOURED: comparison operators
spam = 42  # UNCOLOURED: assignment
2 + 3  # UNCOLOURED: number operators
[]  # UNCOLOURED: list
{}  # UNCOLOURED: dict
(1,)  # UNCOLOURED: tuple
all  # Built-in functions
GeneratorExit  # Exceptions
      ''',
      tokens: [
        SyntaxToken(
          start: 0,
          end: 5,
          color: Colors.amber.value,
        )
      ],
    ),
  );
}
