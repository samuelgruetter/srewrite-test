package com.tree.printer

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 7/13/13
 * Time: 2:31 AM
 * To change this template use File | Settings | File Templates.
 */

//to test issues:
//after Parser:
//identifier expected but 'new' found

class AnnotExample {
  @deprecated
  def testDeprecated = ???

  @transient
  def testTransient = ???
}
