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
try-catch構文を用いて例外処理する
```java
try{
    String str = null;
    System.out.println(str.length());
}catch(NullPointerException e){
    System.out.println("NullPointerExceptionが発生しました。");
    System.out.println(e.getMessage());
```

## ステップ3: APIリファレンスを参照してみよう。
1.  String型の変数strに、文字列"壱百満"を代入
2.  Integer.parseInt(String s)メソッドを用いて、int型変数valueに代入するコードを記述
3.  parseInt()メソッド実行時に例外が発生することを確認

レポート報告事項
APIリファレンスで調べて解説する
-  Integer.parseInt() メソッドの定義

| 修飾子と型 | メソッドと説明 |
| -------- | ---------- |
| static int | parseInt(String s) <br> 文字列の引数を符号付き10進数の整数型として構文解析します。 |
| static int | parseInt(String s, int radix)  <br> 2番目の引数に指定された基数をもとにして、文字列の引数を符号付き整数として構文解析します。|

-  NumberFormatExceptionクラスのスーパークラスを探して解説する
