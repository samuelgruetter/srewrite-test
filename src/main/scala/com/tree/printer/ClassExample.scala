package com.tree.printer

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 7/13/13
 * Time: 1:38 AM
 * To change this template use File | Settings | File Templates.
 */

class ClassExample(message: String, some: Object) {
  def getCause: Int = 0
}

class ChildClassExample(message: String, some: Object) extends ClassExample(message, some) {
  override def getCause: Int = 1
}

object ObjectExample {
  def testDef(message: String) = message
}

private case class PrivateCaseExample(val a_ :Int) {
  val b_ :String = "ddd"
  def c_ :Int = 5
}
