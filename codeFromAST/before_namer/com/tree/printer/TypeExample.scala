package com.tree.printer {
  import scala.Array;
  import scala.collection.mutable;
  class TypeExample extends scala.AnyRef {
    def <init>() = {
      super.<init>();
      ()
    };
    def withinTransaction[A >: _root_.scala.Nothing <: _root_.scala.Any](f: _root_.scala.Function0[A]) = $qmark$qmark$qmark;
    val exValue: List[_$1] forSome { 
      <synthetic> type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
    } = $qmark$qmark$qmark;
    def exParam(r: Array[_$2] forSome { 
      <synthetic> type _$2 >: _root_.scala.Nothing <: _root_.scala.Any
    }) = $qmark$qmark$qmark
  };
  abstract trait TraitExample[T >: _root_.scala.Nothing <: _root_.scala.Any] extends scala.AnyRef {
    def $init$() = {
      ()
    };
    def testT[T >: _root_.scala.Nothing <: _root_.scala.Any](a: T): List[T] = $qmark$qmark$qmark
  };
  abstract trait TraitWithSelfExample extends scala.AnyRef { self: TraitExample[_$3] forSome { 
    <synthetic> type _$3 >: _root_.scala.Nothing <: _root_.scala.Any
  } => 
    <empty>
  }
}