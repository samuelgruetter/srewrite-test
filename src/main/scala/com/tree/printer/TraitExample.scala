package com.tree.printer

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 7/31/13
 * Time: 2:10 PM
 * To change this template use File | Settings | File Templates.
 */
class TestClass1

class TestClass2(val a: String)

trait A

trait B extends TestClass1

trait C extends TestClass2

trait D extends B with A

trait ETest[A, -B, +C] {
  def testMethod[E] = "dd"
}

trait ETest2[A, -B, +C] extends ETest[A,B,C] {
  def newTestMethod[E] = "ll"
  override def testMethod[E] = "rr"
}

