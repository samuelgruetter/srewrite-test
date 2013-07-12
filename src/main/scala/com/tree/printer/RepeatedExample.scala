package com.tree.printer

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 7/13/13
 * Time: 2:27 AM
 * To change this template use File | Settings | File Templates.
 */

//to test issues:
//after Parser:
//in XML literal: in XML content, please use '}}' to express '}'
//I encountered a '}' where I didn't expect one, maybe this tag isn't closed \<repeated\>

class RepeatedExample {
  def repeatedTest(strs: String*) = {
    println("test implementation")
  }
}
