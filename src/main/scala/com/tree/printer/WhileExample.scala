package com.tree.printer

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 8/4/13
 * Time: 8:49 PM
 * To change this template use File | Settings | File Templates.
 */
class WhileExample {
  def testing(b: => Boolean) = {
    val a = 5;
    while (a < 100) {
      println("Hello")
      //println("Hello2")
    }
  }
}
