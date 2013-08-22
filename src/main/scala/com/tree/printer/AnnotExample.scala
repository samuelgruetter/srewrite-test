package com.tree.printer

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 7/13/13
 * Time: 2:31 AM
 * To change this template use File | Settings | File Templates.
 */
class AnnotExample {
  @deprecated
  def testDeprecated = ()

  @transient
  def testTransient = ()

  @deprecated("firstArg", "secondArg")
  def overTest = "dff"
}

@scala.annotation.implicitNotFound(msg = "The method requires an implicit org.squeryl.KeyedEntityDef in scope")
trait KeyedEntityDef[-A,K] extends OptionalKeyedEntityDef[A,K]{
  def getId(a: A): K
}

trait OptionalKeyedEntityDef[-A,K] {
  def keyedEntityDef: Option[KeyedEntityDef[A,K]]
  def someTest4 = "fff"
}
