package com.tree.printer

class FuncValueTest {
  def testFunc(a: Int) = "test"
  def testFunc2(b: Int)(c: Int, d: Int) = "ll"
  val a = testFunc _
  val b = testFunc2(5) _

  def add(x:Int)(y:Int) = x + y
  val addUncurried = Function.uncurried(add _)

  def add2(x:Int, y:Int, z:Int) = x + y + z
 
  val addFive = add2(5, _:Int, _:Int)

  def testParam(x: => Int) = "dd"
}
