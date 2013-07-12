package com.tree.printer {
  class PatternMatchExample extends scala.AnyRef {
    def <init>(): com.tree.printer.PatternMatchExample = {
      PatternMatchExample.super.<init>();
      ()
    };
    private[this] val unique: Option[String] = scala.this.Predef.???;
    <stable> <accessor> def unique: Option[String] = PatternMatchExample.this.unique;
    private[this] val indexed: Option[Int] = scala.this.Predef.???;
    <stable> <accessor> def indexed: Option[Int] = PatternMatchExample.this.indexed;
    scala.Tuple2.apply[Option[String], Option[Int]](PatternMatchExample.this.unique, PatternMatchExample.this.indexed) match {
      case (_1: Option[String], _2: Option[Int])(Option[String], Option[Int])(scala.None, scala.None) => 2
      case (_1: Option[String], _2: Option[Int])(Option[String], Option[Int])((x: String)Some[String](_), scala.None) => 2
      case (_1: Option[String], _2: Option[Int])(Option[String], Option[Int])(scala.None, (x: Int)Some[Int](_)) => 3
      case (_1: Option[String], _2: Option[Int])(Option[String], Option[Int])((x: String)Some[String](_), (x: Int)Some[Int](_)) => 4
    }
  }
}