package VaragsDemo

object VaragsDemo {
  def main(args: Array[String]): Unit = {
    println(sum(1, 2, 3, 4, 5, 6))
  }

  def sum(arr: Int*): Int = {
    arr.sum
  }
}
