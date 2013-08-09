package caseclasses.problem

class BBB

trait CCC extends AnyRef {
  def ggg: String = "yyy"
  abstract override def toString() = "kkk"

}

class A extends AnyRef{val f = 1}

class B {
  def apply(i: Int) = ""
}

class IfTestClass {
  def test = {
    (if (true) new B()
    else new B())(3)
  }
  def typeTest: Option[Any with AnyRef] = null
}

case class XYZ(a: Int, val b: Int, var z: Int)
class XYZ2(a: Int, val b: Int, var z: Int)
