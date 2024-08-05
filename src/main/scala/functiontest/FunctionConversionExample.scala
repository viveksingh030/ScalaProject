package functiontest

object FunctionConversionExample {
  def double(x: Int): Int = x * 2

  def main(args: Array[String]): Unit = {
    // Using `_` syntax
    val myDouble1: Int => Int = double
    println(myDouble1(5)) // Output: 10

    // Using function conversion syntax
    val myDouble2: Int => Int = double
    println(myDouble2(5)) // Output: 10

    // Using lambda syntax
    val myDouble3: Int => Int = (x: Int) => double(x)
    println(myDouble3(5)) // Output: 10
  }
}
