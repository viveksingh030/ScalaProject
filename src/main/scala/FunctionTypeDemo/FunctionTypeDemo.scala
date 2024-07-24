package FunctionTypeDemo

import java.lang.Math.max

object FunctionTypeDemo {
  def main(args: Array[String]): Unit = {
    println(compute(90, 10, max))
  }

  //functionType can be added as ([<type>, ...]) => <type>

  def compute(x: Int, y: Int, f: (Int, Int) => Int): Int = {
    f(x, y)
  }

}
