package com.tree.printer

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 7/13/13
 * Time: 3:29 AM
 * To change this template use File | Settings | File Templates.
 */

//to test issues:
//after Typer:
//'=>' expected but '(' found

class PatternMatchExample {
  val unique: Option[String] = ???
  val indexed: Option[Int] = ???

  (unique, indexed) match {
    case (None, None) => 2
    case (Some(_), None) => 2
    case (None, Some(_)) => 3
    case (Some(_), Some(_)) => 4
  }

}
