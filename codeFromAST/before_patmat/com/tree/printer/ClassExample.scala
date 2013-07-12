package com.tree.printer {
  class ClassExample extends scala.AnyRef {
    <paramaccessor> private[this] val message: String = _;
    <paramaccessor> private[this] val some: Object = _;
    def <init>(message: String, some: Object): com.tree.printer.ClassExample = {
      ClassExample.super.<init>();
      ()
    };
    private[this] var testAccessor: Nothing = scala.this.Predef.???;
    <accessor> private[printer] def testAccessor: Nothing = ClassExample.this.testAccessor;
    <accessor> private[printer] def testAccessor_=(x$1: Nothing): Unit = ClassExample.this.testAccessor = x$1;
    def getCause: Int = scala.this.Predef.???
  };
  class ChildClassExample extends ClassExample {
    <paramaccessor> private[this] val message: String = _;
    <paramaccessor> private[this] val some: Object = _;
    def <init>(message: String, some: Object): com.tree.printer.ChildClassExample = {
      ChildClassExample.super.<init>(message, some);
      ()
    };
    override def getCause: Int = scala.this.Predef.???
  };
  class ImplicitClassExample extends scala.AnyRef {
    <paramaccessor> private[this] val testField: String = _;
    implicit <stable> <accessor> <paramaccessor> def testField: String = ImplicitClassExample.this.testField;
    def <init>()(implicit testField: String): com.tree.printer.ImplicitClassExample = {
      ImplicitClassExample.super.<init>();
      ()
    }
  };
  class TestObj extends scala.AnyRef {
    def <init>(): com.tree.printer.TestObj = {
      TestObj.super.<init>();
      ()
    };
    private[this] val extObjectVal: String = TestObj.this.ObjectExample.objectVal;
    implicit <stable> <accessor> def extObjectVal: String = TestObj.this.extObjectVal;
    object ObjectExample extends scala.AnyRef {
      def <init>(): TestObj.this.ObjectExample.type = {
        ObjectExample.super.<init>();
        ()
      };
      def apply(message: String): Nothing = scala.this.Predef.???;
      def testDef(message: String): Nothing = scala.this.Predef.???;
      private[this] val objectVal: String = "Hello";
      <stable> <accessor> def objectVal: String = ObjectExample.this.objectVal
    }
  }
}