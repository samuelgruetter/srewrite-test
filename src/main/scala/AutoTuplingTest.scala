
// auto tupling
object AutoTuplingTest {
  
  def f(u: Unit): Int = 1
  
  def foo(t: (Int, Int)): Int = t._1 + t._2
  
  def fooo(t: (Int, Int, Int)): Int = ???
  
  def go(): Unit = {
    foo(3, 4)
  }
  
  val a = fooo(10, 20, 30)
  
  def test1(): Unit = {
    f()
  }
  
  def test2(): Unit = {
    foo(
        /* now look how nicely I wrote this: */ 42,
        /* and another number here: */          43
    )
  }
  
  def test2b: Unit = {
    println(foo(34, 35))
  }
  
  val b = f()
  
  def test3(): Unit = {
    def test(): Unit = {
      foo(12, 13) // value discarding at end of method
    }
    val a = fooo(4, 5, 6)
    foo(12, 13) // value discarding not at end of method
    println("hi")
  }
  
  def test4(x: Int, y: Int, func: ((Int, Int)) => Int): Int = {
    val inc = (i: Int) => i+1
    (func andThen inc)  /*/**/*/ (   /*/**/*/
      x + x*y,
      y + y*x
    /*no space before ')'*/)+1 // no space after '('
  }
  
  def test5() {
    println(test4(30, 50, foo(_)))
  }

  val p: (Int, Int) = (88, 99)
  val l: List[(Int, Int)] = p :: Nil
  def f: Traversable[(Int, String)] = ???
  
  def f1[T1, T2](l1: List[T1], l2: List[T2]) = ???
  
  def v1 = f1(1 :: 2 :: Nil, 3 :: 4 :: Nil)
  
  object Zipping {
    
    import scala.runtime.ZippedTraversable2._
    
    def test1: Traversable[(Int, String)] = zippedTraversable2ToTraversable[Int, String]((List(1, 2), List("a", "b")).zipped)
    
    def test2: scala.runtime.Tuple2Zipped[Int, List[Int], String, List[String]] =
      tuple2ToZippedOps(List(1, 2), List("a", "b")).zipped
    
    def test2a: scala.runtime.Tuple2Zipped[Int, List[Int], String, List[String]] =
      tuple2ToZippedOps[List[Int], List[String]](List(1, 2), List("a", "b")).zipped
    
    def test3: scala.runtime.Tuple2Zipped[Int, List[Int], String, List[String]] =
      (List(10, 20), List("AAAAA", "BBBBBB")).zipped

  }
}

