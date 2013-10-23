package aa.bb.cc.dd

import aa._
//import aa.{bb => xxx}

import aa.bb
import bb.cc
import cc.dd
import dd.ee.ff
import ff.FF
import bb._
import G._

//import aa.bb.cc.dd.ee.ff.gg.ff

//import collection.mutable
//import scala.collection
//import mutable._

//import aa.bb.bbobj

object G{
 type GG = String
 class GGG
}

class Test{
  /*
  val a: FF = null
  val b: BB = null
  //val c: xxx.BB = null
  val d: bb.BB = null
  val e: aa.bb.BB = null
  val f: aa.bb.cc.dd.ee.ff.FF = null
  val g: cc.dd.ee.ff.FF = null
  val h: ff.FF = null
  val i: bbobj.type = null
  val j: bb.bbobj.type = null
  val k: bb.bbobj.nn = null
  val l: bb.bbobj.NN = null
  */
  import aa.bb.cc.dd.G._
  import G._
  import bb._
  import ff._
  import ee.ff._
  import G.GGG
  import bb.bbobj
  //import bbobj._
  import G.GG
  val n: GG = null
  val m: G.GGG = null
  val o: bbobj.NN = null
  val p: bbobj.nn = null
  
  import bb.bbobj
  val r: bbobj.type = null
  
  import bbobj.NN
  import bb.bbobj.nn
  //val s: bbobj.NN = null
  //val t: bbobj.nn = null 

  val u: NN = null
  val t: nn = null

  //val a: mutable.Map[Int, Int] = null
  //var b: collection.mutable.Map[Int, Int] = null
  //val c: Map[Int, Int] = null
  //val c: List[Any] = null
  //val d = List(1, "ee")
  //def testMethod = 9
  //def testMethod2: Int = 10
}
