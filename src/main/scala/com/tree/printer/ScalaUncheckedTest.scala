package scalauncheckedtest

class ScalaUncheckedTest {
   def f(x: Int, b: Int) = 3: Any
   def someMethod() = {
      val x$1 = ((try {
          f(3, 4)
        } catch {
          case (x @ ((_): Throwable)) => {
            throw x
          }
        }): @scala.unchecked) match {
          case scala.Tuple3((a @ _), (b @ _), (z @ _)) => scala.Tuple3(a, b, z)
        };
   }
}
