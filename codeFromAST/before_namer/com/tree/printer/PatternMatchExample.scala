package com.tree.printer {
  class PatternMatchExample extends scala.AnyRef {
    def <init>() = {
      super.<init>();
      ()
    };
    val unique: Option[String] = $qmark$qmark$qmark;
    val indexed: Option[Int] = $qmark$qmark$qmark;
    scala.Tuple2(unique, indexed) match {
      case scala.Tuple2(None, None) => 2
      case scala.Tuple2(Some(_), None) => 2
      case scala.Tuple2(None, Some(_)) => 3
      case scala.Tuple2(Some(_), Some(_)) => 4
    }
  }
}