
package com.tree.printer {
  class YYY {
    val a = "sss"
    (a match {
      case _: String => true
      case _ => false
    }).toString

    (a match {
      case _ => "Hello"
    }) match {
      case _ => "Hello2"
    }

    def test(y: Object=>Boolean) = "sss"
    test{case _: String => true; case _ => false}

    def test2(a: String) = "test2"
    test2{println("Hello"); "ggg"}
  }
}
