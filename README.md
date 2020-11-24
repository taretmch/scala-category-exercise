# Scala で始める圏論入門 演習編

本ブランチは、『Scala で始める圏論入門』の演習用プロジェクトです。

自由にクローンして、コードを実装してみてください。

## 演習問題

`src/main/scala/exercise/` ディレクトリに、以下のような未実装のインスタンスがあります。

```scala
package category.data.instance

import category.data.Semigroup

/** Instances of semigroup */
object SemigroupInstances {

  /** Int with sum instance */
  implicit val IntSemigroup: Semigroup[Int] = ???

  /** String with sum instance */
  implicit val StringSemigroup: Semigroup[String] = ???

  implicit def OptionSemigroup[A: Semigroup]: Semigroup[Option[A]] = ???
}
```

`???` と未定義になっている部分を実装して、テストを成功させてください！

```sh
sbt:scala-category-training> testOnly category.data.SemigroupSpec
[info] Compiling 4 Scala sources to /Users/tomoki.mizogami/src/scala-category-training/target/scala-2.13/classes ...
[info] Compiling 4 Scala sources to /Users/tomoki.mizogami/src/scala-category-training/target/scala-2.13/test-classes ...
[info] SemigroupSpec:
[info] IntSemigroup
[info] - should 結合律を満たす
[info] StringSemigroup
[info] - should 結合律を満たす
[info] OptionSemigroup
[info] - should 結合律を満たす
[info] Run completed in 180 milliseconds.
[info] Total number of tests run: 3
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 3, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
[success] Total time: 1 s, completed 2020/11/20 19:26:24
```

## ディレクトリ構成

- src/main/scala/
  - exercise/: 演習問題があります。
  - category/: 各型クラスの定義や便利な文法、暗黙の値などがあります。
- src/test/scala/
  - テストコードがあります。
