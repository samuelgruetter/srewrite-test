package com.lazyval.issue

class TestLazy {
  val a = ""
  lazy val b = ""
  implicit lazy val c = ""
  lazy implicit val d = ""
  def test = {
    lazy val e = ""
    implicit val t = ""
    lazy implicit val h = ""
    case class InsideTesting
  }
}
