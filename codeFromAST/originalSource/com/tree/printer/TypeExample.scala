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
//';' expected but 'forSome' found

//after Typer:
//in XML literal: X expected instead of Y
//in XML literal: name cannot end in Z
//in XML literal: whitespace expected
//in XML literal: ' or " delimited attribute value or '{' scala-expr '}' expected
//in XML literal: name expected, but char ':' cannot start a name
//in XML literal: '>' expected instead of ':'
//in XML literal: '=' expected instead of ']'

class TypeExample {
  //problem with parameterized type
  def withinTransaction[A](f: () => A) = ???

  //existential types
  val exValue: List[_] = ???

  def exParam(r: Array[_]) = ???
}

trait TraitExample[T] {
  def testT[T](a: T): List[T] = ???
}

trait TraitWithSelfExample {
  self: TraitExample[_] =>
}
