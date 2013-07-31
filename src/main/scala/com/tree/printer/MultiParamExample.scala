package com.tree.printer

class AP

class BP(val x: Int)

class CP(val v: Int, f: Double)

class DP(override val y: Int, f: Double)(x: Int)(t: Double) extends BBB

class EP(x: Int)(z: Int)(implicit q: String, var u: Int) extends DP(x, 5.0)(z)(7.0) with AAA

class FP(implicit x: Int, z: Double) {
  def test(implicit v: Double, q: Int) = "ff"
}

trait AAA

class BBB extends CCC(5)

class CCC(val y: Int)
