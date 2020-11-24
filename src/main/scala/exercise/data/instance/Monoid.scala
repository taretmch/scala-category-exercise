package category.data.instance

import category.data.Monoid

/** Instances of monoid */
object MonoidInstances {

  /** Int monoid */
  implicit def IntMonoid: Monoid[Int] = ???

  /** String monoid */
  implicit def StringMonoid: Monoid[String] = ???

  /** Option monoid */
  implicit def OptionMonoid[A]: Monoid[Option[A]] = ???
}
