package FunctionCarrying

//Function currying is the technique where we split a function with multiple
// argument to accept lesser argument
object FunctionCarryingDemo {
  def main(args: Array[String]): Unit = {
    println(add(50, 60))
    val add60 = add2(60);
    println(add60(40))
    println(add3(90)(10))
    val add80 = add3(80) _
    println(add80(20))
  }

  def add(x: Int, y: Int): Int = x + y

  def add2(x: Int) = (y: Int) => x + y

  def add3(x: Int)(y: Int): Int = x + y
}
