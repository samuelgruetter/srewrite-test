package com.tree.printer

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 7/13/13
 * Time: 1:38 AM
 * To change this template use File | Settings | File Templates.
 */

//to test issues:
//after Parser:
//in XML literal: in XML content, please use '}}' to express '}'
//I encountered a '}' where I didn't expect one, maybe this tag isn't closed <init>
//Expected start of definition

//after Typer:
//in XML literal: in XML content, please use '}}' to express '}'
//I encountered a '}' where I didn't expect one, maybe this tag isn't closed <synthetic> - ???
//I encountered a '}' where I didn't expect one, maybe this tag isn't closed <init>
//I encountered a '}' where I didn't expect one, maybe this tag isn't closed \<accessor\>
//identifier expected but $XMLSTART$< found
//expected start of definition
//'}' expected but eof found
//']' expected but '.' found

class ClassExample(message: String, some: Object) {
  private [printer] var testAccessor = ???
  def getCause: Int = ???
}

class ChildClassExample(message: String, some: Object) extends ClassExample(message, some) {
  override def getCause: Int = ???
}

class ImplicitClassExample(implicit val testField: String)

class TestObj {
  implicit val extObjectVal = ObjectExample.objectVal

  //try to get synthetic
  object ObjectExample {
    def apply(message: String) = ???
    def testDef(message: String) = ???
    val objectVal = "Hello";
  }
}
