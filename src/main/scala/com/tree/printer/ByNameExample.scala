package byname.example
class ByNameTest{
  def test(x: => Int) = "dfdf"
  val a0: (Int, => Double) => String = null
  val a: Function0[String] = null
  val b: Function1[Int, String] = null
  val c: Function2[Array[Function1[Float, Double]], Int, Double] = null
  val d: (() => String) = null
  val e: (Unit) => String = null
  val f: (Int, Double) => String = null

  val b1: Function1[Int, String] = null
  val b2: scala.Function1[Int, String] = null
  val b3: _root_.scala.Function1[Int, String] = null
}
