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
