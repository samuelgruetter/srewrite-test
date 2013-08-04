package com.tree.printer

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 7/13/13
 * Time: 3:29 AM
 * To change this template use File | Settings | File Templates.
 */
class PatternMatchExample private (protected var a: Int) {
  private val (strVal1, strVal2) = ("STRVAL1", "STRVAL2")

  protected val test: Any = null
  test match {
    case Test1(_) => false
    case Test2(_ :: list) => true
    case _ => true
  }
}

case class Test1(val strParam: String)

case class Test2(private val listParam: List[Int])

class TestPM {
	private def testing {
		val List(x, y) = List(1,2)
	}
}

class AmTest extends { private val a = 5 }

class DefTest {
  {
    val a = 5
  }
  protected def test1(x: Int) = {
    def test2(y: Double) = {
      "ddd"
    }
  }
}

class ABC(val x: Double) {
  println {
    {val (strVal3, strVal4) = ("STRVAL3", "STRVAL4");"Hello"}
  }
}

class DEF {
  val a = List(1,2,3)
  a match {
    case d: List[_] => true
    case _ => false
  }
  a match {
    case d @ List(x, y) => true
    case _:Object => true
    case _ => false  
  }
 }
