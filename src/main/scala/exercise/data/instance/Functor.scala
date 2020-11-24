package category.data.instance

import category.data.Functor
import category.universal.example.List

/** Instances of functor */
object FunctorInstances {

  /** Option functor */
  implicit val OptionFunctor: Functor[Option] = ???

  /** List functor */
  implicit val ListFunctor: Functor[List] = ???
}
