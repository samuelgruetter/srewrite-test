package com.tree.printer

trait VarianceTest[A, -B, +C] {
  def testMethod[E] = "dd"
}

trait ParentVarTest[A, -B, +C] extends VarianceTest[A,B,C]

