package imp

trait Tuples{
   //trait SomeTrait

   implicit def implDef(t: String): Any = new { val value = t } with Serializable 


def a(x: Int) = {
class A extends Serializable { val a = x }
}

}

final class A

class B(x: Int)

trait C

class Test extends {val t = "gg"}

class Test2(x: Int) extends {val t = "gg"} with B(5)

class Test3 extends {val t = "ll"; val z = "rr"; type z = String}

class Test4 extends {val t = "ll"; protected val z = "rr"; type z = String} with Serializable

final class FinalTest{
   final class Test1
   def testingFinal{
      final class Test2 
   }

}
