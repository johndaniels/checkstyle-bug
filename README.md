This is a demonstration for Issue [#6210](https://github.com/checkstyle/checkstyle/issues/6210) in the codestyle project

To reproduce:

`./gradlew check`

Expected:

No errors.

Actual:

Indicates that close paren should randomly be aligned with nothing at 6 columns.

```[ant:checkstyle] [WARN] /Users/207573/indentation/src/main/java/indentation/Indentation.java:15: 'method call rparen' has incorrect indentation level 8, expected level should be 6. [Indentation]```
