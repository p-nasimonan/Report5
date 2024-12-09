# プログラミング2、レポート課題5: 「例外に慣れよう」
## ステップ1: コードの準備。
以下のコードを実行する
```java
String str = null;
System.out.println(str.length());
```
例外が発生する: `java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null`
### java.lang.NullPointerExceptionの発生する原因
- nullオブジェクトのインスタンス・メソッドの呼出し。
- nullオブジェクトのフィールドに対するアクセスまたは変更。
- nullの長さを配列であるかのように取得。
- nullのスロットを配列であるかのようにアクセスまたは修正。
- nullをThrowable値であるかのようにスロー。

---
## ステップ2: 例外処理を記述せよ。

## ステップ3: APIリファレンスを参照してみよう。
