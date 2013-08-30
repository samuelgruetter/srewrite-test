package testingConstr

class A1()()()

class A2 (x: Int)()

class A3 ()(x: Int)

class A4 ()(d: Double)()()(s: String)()

class B1 ()(x: Int) extends A3 ()(3)

class B2 ()(x: Int)() extends A3 ()(3)

class B3 ()(x: Int)() extends A3 ()(3) {
   def this(y: String) = {
      this()(3)()
   }
}

class C

class C2 {
   def this(y: String)() = {
      this()
   }
}

class C3 ()(x: Int)() extends A3 ()(3) {
   def this(y: String) = {
      this()(3)()
   }
} 
