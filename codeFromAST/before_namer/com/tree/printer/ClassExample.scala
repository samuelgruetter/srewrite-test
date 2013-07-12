package com.tree.printer {
  class ClassExample extends scala.AnyRef {
    <paramaccessor> private[this] val message: String = _;
    <paramaccessor> private[this] val some: Object = _;
    def <init>(message: String, some: Object) = {
      super.<init>();
      ()
    };
    private[printer] var testAccessor = $qmark$qmark$qmark;
    def getCause: Int = $qmark$qmark$qmark
  };
  class ChildClassExample extends ClassExample {
    <paramaccessor> private[this] val message: String = _;
    <paramaccessor> private[this] val some: Object = _;
    def <init>(message: String, some: Object) = {
      super.<init>(message, some);
      ()
    };
    override def getCause: Int = $qmark$qmark$qmark
  };
  class ImplicitClassExample extends scala.AnyRef {
    implicit <paramaccessor> val testField: String = _;
    def <init>()(implicit testField: String) = {
      super.<init>();
      ()
    }
  };
  class TestObj extends scala.AnyRef {
    def <init>() = {
      super.<init>();
      ()
    };
    implicit val extObjectVal = ObjectExample.objectVal;
    object ObjectExample extends scala.AnyRef {
      def <init>() = {
        super.<init>();
        ()
      };
      def apply(message: String) = $qmark$qmark$qmark;
      def testDef(message: String) = $qmark$qmark$qmark;
      val objectVal = "Hello"
    }
  }
}