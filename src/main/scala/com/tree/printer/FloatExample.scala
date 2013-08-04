package com.tree.printer

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 8/4/13
 * Time: 8:47 PM
 * To change this template use File | Settings | File Templates.
 */
class FloatTestParent{
  val a: Float = 2
}

class FloatTestChild extends FloatTestParent{
  override val a = 3F
  val c = 5F
  val d = c
}
