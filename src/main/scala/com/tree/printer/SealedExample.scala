/*
package scalaz{
  import Free._;

object Free extends FreeInstances with FreeFunctions {

  /** Return from the computation with the given value. */
  case class Return[S[_], A](a: A) extends Free[S, A]

  /** Suspend the computation with the given suspension. */
  case class Suspend[S[_], A](a: S[Free[S, A]]) extends Free[S, A]

   /** Call a subroutine and continue with the given function. */
  case class Gosub[S[_], A, B](a: () => Free[S, A],
                                     f: A => Free[S, B]) extends Free[S, B]

   /** A computation that can be stepped through, suspended, and paused */
   type Trampoline[A] = Free[Function0, A]

   /** A computation that produces values of type `A`, eventually resulting in a value of type `B`. */
   type Source[A, B] = Free[({type f[x] = (A, x)})#f, B]

   /** A computation that accepts values of type `A`, eventually resulting in a value of type `B`.
     * Note the similarity to an [[scalaz.iteratee.Iteratee]].
     */
  type Sink[A, B] = Free[({type f[x] = (=> A) => x})#f, B]
}

/** A free operational monad for some functor `S`. Binding is done using the heap instead of the stack,
  * allowing tail-call elimination. */
sealed abstract class Free[S[_], A] {
  final def map[B](f: A => B): Free[S, B] =
    flatMap(a => Return(f(a)))

  /** Alias for `flatMap` */
  final def >>=[B](f: A => Free[S, B]): Free[S, B] = this flatMap f

  /** Binds the given continuation to the result of this computation.
    * All left-associated binds are reassociated to the right. */
  final def flatMap[B](f: A => Free[S, B]): Free[S, B] = this match {
    case Gosub(a, g) => Gosub(a, (x: Any) => Gosub(() => g(x), f))
    case a           => Gosub(() => a, f)
  }
}

object Trampoline extends TrampolineInstances {

  def done[A](a: A): Trampoline[A] =
    Free.Return[Function0,A](a)

  def delay[A](a: => A): Trampoline[A] =
    suspend(done(a))

  def suspend[A](a: => Trampoline[A]): Trampoline[A] =
    Free.Suspend[Function0, A](() => a)
}

sealed abstract class TrampolineInstances {
  implicit val trampolineMonad: List[Trampoline[String]] = null
}

object Sink extends SinkInstances

sealed trait SinkInstances {
  implicit def sinkMonad[S] = List(1,2,3)
}

object Source extends SourceInstances

sealed trait SourceInstances {
  implicit def sourceMonad[S] = List(1,2,3)
}

// Trampoline, Sink, and Source are type aliases. We need to add their type class instances
// to Free to be part of the implicit scope.
sealed abstract class FreeInstances extends TrampolineInstances with SinkInstances with SourceInstances {
  implicit def freeMonad[S[_]] = List(1,2,3)
}

trait FreeFunctions {
  /** Collapse a trampoline to a single step. */
}
}
*/
