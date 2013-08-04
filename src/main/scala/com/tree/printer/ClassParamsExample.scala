package com.tree.printer

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 8/4/13
 * Time: 8:48 PM
 * To change this template use File | Settings | File Templates.
 */
class A1(val i: Int)
class A2

class B1 extends A1(5)

class B2 extends A2

class TestConstrParam(val a: Int)(val b: Double, c: Int)(val d: String)

class TestConstrChild(override val a: Int, b: Double, c: Int, d: String) extends TestConstrParam(a)(b, c)(d)

trait TestSelf {
  self: B2 =>
}

class TestBlockExample(val a: Int) {
  {
    val b: String = "dd"
  }
}