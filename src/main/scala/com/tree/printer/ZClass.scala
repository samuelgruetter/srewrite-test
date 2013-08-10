package classz

object A

class A

class B extends AnyRef

object B

abstract class C

object C extends AnyRef

trait DW

trait D extends A

class E extends A

case class F extends A

object F

class Test{
  type testing = Product1[Any] with AnyRef
  //test AnyRef in types
  val customTypeFactory: Option[AnyRef => Product1[Any] with AnyRef] = null
}
