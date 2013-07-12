package com.tree.printer {
  import scala.Array;
  import scala.collection.mutable;
  class TypeExample extends scala.AnyRef {
    def <init>(): com.tree.printer.TypeExample = {
      TypeExample.super.<init>();
      ()
    };
    def withinTransaction[A >: Nothing <: Any](f: () => A): Nothing = scala.this.Predef.???;
    private[this] val exValue: List[_] = scala.this.Predef.???;
    <stable> <accessor> def exValue: List[_] = TypeExample.this.exValue;
    def exParam(r: Array[_]): Nothing = scala.this.Predef.???
  };
  abstract trait TraitExample[T >: Nothing <: Any] extends scala.AnyRef {
    def /*TraitExample*/$init$(): Unit = {
      ()
    };
    def testT[T >: Nothing <: Any](a: T): List[T] = scala.this.Predef.???
  };
  abstract trait TraitWithSelfExample extends scala.AnyRef { self: com.tree.printer.TraitWithSelfExample with com.tree.printer.TraitExample[_] => 
    <empty>
  }
}