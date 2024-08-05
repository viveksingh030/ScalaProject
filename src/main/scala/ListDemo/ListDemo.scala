package ListDemo

object ListDemo {
  def main(args: Array[String]): Unit = {
    var list: List[Int] = List(1, 2, 3, 4, 5, 6)
    println("sum=" + list.reduceLeft((a, b) => a + b))
    println("sum=" + list.reduceRight((a, b) => a + b))
    println("sum=" + list.foldLeft(0)((a, b) => a + b))
    printIntegerList(list)
    println()
    print(list.head)
    println()
    printIntegerList(list.tail)
    print("reverse of list is=>")
    printIntegerList(list.reverse)

    printIntegerList(-1 :: list)

    println(list.exists(value => value % 2 == 0))

    // List of Strings
    val fruit: List[String] = List("apples", "oranges", "pears")

    // List of Integers
    val nums: List[Int] = List(1, 2, 3, 4)

    // Empty List.
    val empty: List[Nothing] = List()

    var list2: List[Int] = 1 :: List(2, 3)
    printIntegerList(list2)

  }

  def printIntegerList(list: List[Int]) = {
    list.foreach(value => printf("%d ", value))
    println()
  }
}
