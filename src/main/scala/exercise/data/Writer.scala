package category.data

/** Writer monad */
case class Writer[L, A](run: (L, A)) {

  def flatMap[B](m2: A => Writer[L, B]): Writer[L, B] = ???
}

/** Companion Object */
object Writer {

  /** Identity */
  def pure[L, A](a: A): Writer[L, A] = ???

  /** Morphism */
  implicit class WriterOps[L, A, B](m1: A => Writer[L, B]) {
    def >=>[C](m2: B => Writer[L, C]): A => Writer[L, C] = ???
  }
}
