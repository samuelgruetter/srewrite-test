package stmtest

class ScalaStmTest{
   val a = List(1,2,3)
   a map {implicit x => x}
   val b = (x: Int, y: Int) => (z: Int) => 3

   class A(implicit x: Int) {
     def this(x: String) = this()(5)
   }

   val isFuncTree = true
   val ts: List[Any] = List(1,2,3)
   val printParanthesis = !isFuncTree || {
        ts match {
          case List(vd: String) => true
          case _ => false
        }
      }
   class BBB{
     val tryTest = (try {4} catch {
       case x: Throwable => throw x
     }).toString

     val tryTest2 = (try {5} catch {
       case x: Throwable => throw x
     }) match {
       case _ => true
     }

     val tryTest3 = (try {new TestApply} catch {
       case x: Throwable => throw x
     })()

     (if (true) new TestApply else new TestApply) match {
        case _ => true
     }
    
     class TestApply{
       def apply() = "gg"
     }
   }

}
