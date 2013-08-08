package test.colon

class ColonDefExample{
    def t0[A,B](as: List[A]) = {
      println("hello")
      as./:(Map.empty[B, List[A]]){ (nels, a) => println(""); (nels)}
    }
    def t[A,B](as: List[A]) = {
      println("hello")
      ((Map.empty[B, List[A]]) /: as){ (nels, a) => println(""); (nels)}
    }
    def t2[A,B](as: List[A]) =
      ((Map.empty[B, List[A]]) /: as)((nels, a) => (nels))
}
