package com.tree.printer

trait VarianceTest[A, -B, +C] {
  def testMethod[E] = "dd"
}

trait ParentVarTest[A, -B, +C] extends VarianceTest[A,B,C]

class VarTest[A, -B, +C, D, +E, -F] {
  def test[A, B, C, D]: B = ().asInstanceOf[B]
}
