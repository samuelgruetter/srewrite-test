package com.tree.printer

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 7/13/13
 * Time: 3:29 AM
 * To change this template use File | Settings | File Templates.
 */
class PatternMatchExample {
   val (strVal1, strVal2) = ("STRVAL1", "STRVAL2")

  val test: Any = null
  test match {
    case Test1(_) => false
    case Test2(_ :: list) => true
    case _ => true
  }
}

case class Test1(val strParam: String)

case class Test2(val listParam: List[Int])


