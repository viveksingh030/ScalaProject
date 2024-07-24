package NestedFunctionDemo

object NestedFunctionDemo {
  def main(arg: Array[String]): Unit = {
    println(max(53, 12, 41))
  }

  def max(a: Int, b: Int, c: Int): Int = {
    def max(a: Int, b: Int): Int = {
      if (a > b) return a
      else return b
    }
    return max(a, max(b, c))
  }
}
