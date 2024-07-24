package ByNameParameterDemo

object ByNameParameterDemo {
  def main(args: Array[String]): Unit = {
    var j = 0
    def byNameMethod(x: => Int): Int = {
      println("Evaluating x")
      j -= 1
      println(j)
      x + x
    }

    def normalMethod(x: Int): Int = {
      println("Evaluating x")
      x + x
    }

    def a() = {
      println("Calculating a")
      j += 1;
      println(j)
      j
    }

    println("By-name parameter:")
    println(byNameMethod(a()))

    println("\nNormal parameter:")
    println(normalMethod(a()))
  }

}
