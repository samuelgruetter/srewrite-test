
import language.implicitConversions

trait ImplicitsTest {

  implicit def intToStr(i: Int) = String.valueOf(i)

  def foo(a: Int): String = "fwejkl"

  class Foo{}
  class Bar{}
  class B{}

  implicit val x = new Bar
  implicit val y=new Foo
  implicit val z   = new B

  object tt {
    implicit val x2: Bar = new Bar
  }

  val x2 = new Bar

  implicit object obj extends Bar {

  }

}
