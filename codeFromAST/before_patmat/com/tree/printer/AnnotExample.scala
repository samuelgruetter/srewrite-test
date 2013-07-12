package com.tree.printer {
  class AnnotExample extends scala.AnyRef {
    def <init>(): com.tree.printer.AnnotExample = {
      AnnotExample.super.<init>();
      ()
    };
    @deprecated(scala.this.deprecated.<init>$default$1, scala.this.deprecated.<init>$default$2) def testDeprecated: Nothing = scala.this.Predef.???;
    @transient def testTransient: Nothing = scala.this.Predef.???
  }
}