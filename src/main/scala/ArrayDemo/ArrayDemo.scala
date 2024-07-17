package ArrayDemo
import scala.reflect.ClassTag

object ArrayDemo {
  def main(args: Array[String]): Unit = {
    var myArray: Array[Int] = new Array[Int](10)
    for (i <- 0 to 9) {
      myArray(i) = i + 1
    }
    var sum: Int = 0
    myArray.foreach(e => sum = sum + e)
    println(sum)

    val vec: Vector[Int] = Vector(1, 2, 34, 4, 5, 3, 43, 2, 14, 30)
    evenElement(vec).foreach(e => println(e))
  }

  private def evenElement[T: ClassTag](x: Vector[T]): Array[T] = {
    val myArray: Array[T] = new Array[T]((x.size) / 2)
    var j: Int = 0
    var i = 1
    while (i < x.size) {
      myArray(j) = x(i)
      i += 2
      j += 1
    }
    myArray;
  }
}
