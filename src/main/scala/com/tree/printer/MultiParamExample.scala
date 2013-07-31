package com.tree.printer {
  class AP extends scala.AnyRef;
  class BP (val x: Int) extends scala.AnyRef;
  class CP (val v: Int, f: Double) extends scala.AnyRef;
  class DP (override val y: Int, f: Double) (x: Int) (t: Double) extends BBB;
  class EP (x: Int) (z: Int) (implicit q: String, var u: Int) extends DP(x, 5.0)(z)(7.0) with AAA;
  class FP (implicit x: Int, z: Double) extends scala.AnyRef {
    def test(implicit v: Double, q: Int) = "ff"
    def this(x: Int) = this()(1, 2.0)
  };
  abstract trait AAA extends scala.AnyRef;
  class BBB extends CCC(5);
  class CCC (val y: Int) extends scala.AnyRef
}
