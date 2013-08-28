class A{
   def test = 
      (if (true) "ddd" else "ddd") toString
}

case object TestObject

trait Testing{
abstract class MyAbstract
case object MyFirst extends MyAbstract
case object MySecond extends MyAbstract

val x: MyAbstract = MyFirst

x match {
   case aOrB @ (MyFirst | MySecond) => true
   case _ => false
}
}
