package com.tree.printer

import scala.Array
import scala.collection.mutable

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 7/13/13
 * Time: 1:43 AM
 * To change this template use File | Settings | File Templates.
 */

//to test issues:
//after Parser:
//in XML literal: X expected (instead of Y)

class TypeExample {
  //problem with parameterized type
  def withinTransaction[A](f: () => A) = {
    println("test implementation")
  }

  //existential types
  val exValue: List[_] = List(1,2,3)

  def exParam(r: Array[_]) = {
    println("test implementation")
  }
}
