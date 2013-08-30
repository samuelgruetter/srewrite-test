class Parantheses2Test{
  (if (true) 5
  else 4).toString.toString.toString
  ({ val a = 7
     a } match {
     case _:Int => true
     case _ => false
  }).toString

  {final class InA(x: Int){
     protected[this] val o = 5
     def this() = this(4)
   }
   val ina = new InA
   ina
  }.toString.toString.toString

  class B {
     (x: Int) => 5;
     ((x: Int) => 5) toString;
     {(x: Int) => 5} toString;
     ((x: Int) => 5).toString.toString;
     {(x: Int) => 5}.toString.toString;
    //((x: Int) => 4) toString
    //((x: Int) => 3) toString
  }
}
