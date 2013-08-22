package any.ref.problem

class Test1 {}

class Test2 extends scala.AnyRef

object Test2

trait TestTrait

object Test3 extends scala.AnyRef with TestTrait

object Test4 extends TestTrait
