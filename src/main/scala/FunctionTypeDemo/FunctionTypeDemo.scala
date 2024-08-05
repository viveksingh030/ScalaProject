package FunctionTypeDemo

import java.lang.Math.max

object FunctionTypeDemo {
  def main(args: Array[String]): Unit = {
    println(compute(90, 10, max))

    // Syntax: Assigning a Function with the Wildcard Operator
    //
    // val <identifier> = <function name> _
    val myDouble = double
    println("myDouble2=" + myDouble(54))
    val myDouble2: (Int) => Int = double
    println(myDouble2(87))
  }

  // functionType can be added as ([<type>, ...]) => <type>

  def compute(x: Int, y: Int, f: (Int, Int) => Int): Int = {
    f(x, y)
  }

  def double(x: Int): Int = {
    2 * x
  }

}
