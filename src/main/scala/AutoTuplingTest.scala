
// auto tupling 
object AutoTuplingTest {
  
  def f(u: Unit): Int = 1
  
  def foo(t: (Int, Int)): Int = t._1 + t._2
  
  def fooo(t: (Int, Int, Int)): Int = ???
  
  def go(): Unit = {
    foo(3, 4)
  }
  
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
  
  def test3(): Unit = {
    val a = fooo(4, 5, 6)
  }

}
