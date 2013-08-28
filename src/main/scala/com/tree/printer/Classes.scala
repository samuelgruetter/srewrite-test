class A1
class A2 extends AnyRef with B1

trait B1
trait B2 extends Product with Serializable
trait B3 extends B1 with Product with Serializable
trait B4 extends A1 with Product with Serializable

object d1
object d2 extends Product with Serializable {
  def canEqual(that: Any): Boolean = false
  def productArity: Int = 4
  def productElement(n: Int): Any = 4
} 
object d3 extends B1 with Product with Serializable {
  def canEqual(that: Any): Boolean = false
  def productArity: Int = 4
  def productElement(n: Int): Any = 4
}
object d4 extends A1 with Product with Serializable {
  def canEqual(that: Any): Boolean = false
  def productArity: Int = 4
  def productElement(n: Int): Any = 4
}

case class C1
case class C2 extends Product with Serializable
case class C3 extends B1 with Product with Serializable
case class C4 extends A1 with Product with Serializable
case class C40 extends A1 with scala.Product with scala.Serializable
case class C5 extends scala.Product with scala.Serializable with B1
case class C50 extends scala.Product with scala.Serializable
case class C6 extends B2 with B1
case class C7 extends B1

class V0
class V1 extends B1  
//class V2 extends AnyRef with B1
