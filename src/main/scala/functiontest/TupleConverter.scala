package functiontest

object TupleConverter {
  // Function to convert a 3-sized tuple to a 6-sized tuple with each original element followed by its String representation
  private def convertTuple[T1, T2, T3](tuple: (T1, T2, T3)): (T1, String, T2, String, T3, String) = {
    val (a, b, c) = tuple
    (a, a.toString, b, b.toString, c, c.toString)
  }

  def main(args: Array[String]): Unit = {
    // Explicitly specifying types for the result
    val input: (Boolean, Double, String) = (true, 22.25, "yes")
    val result: (Boolean, String, Double, String, String, String) = convertTuple(input)

    println(s"Input tuple: $input")
    println(s"Converted tuple: $result")
  }
}
