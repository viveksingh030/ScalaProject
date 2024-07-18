package ArrayDemo

import scala.reflect.ClassTag

object ArrayDemo {
  def main(args: Array[String]): Unit = {
    var myArray: Array[Int] = new Array[Int](5)
    for (i <- 1 to 5) myArray(i - 1) = i
    for (i <- myArray) {
      println(i)
    }
    var sum = 0
    myArray.foreach(value => sum += value)
    println(sum)

    var myArray2: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7)

    print(Array.fill(5)(10))

    myArray.concat(myArray2).foreach(value => printf(s"%d ", value))
    sum = 0
    myArray2.foreach(value => sum += value)
    println(sum)
    var vec: Vector[Int] = Vector(1, 2, 3, 4, 5, 6, 7, 8)
    print(evenElements(vec))
  }

  def print(array: Array[Int]): Unit = {
    array.foreach(value => printf(s"%d ", value))
  }

  def print(array: Vector[Int]): Unit = {
    array.foreach(value => printf(s"%d ", value))
  }

  def evenElements[T: ClassTag](xs: Vector[T]): Array[T] = {
    var res: Array[T] = new Array[T](xs.size / 2)
    var i: Int = 0
    var j: Int = 1
    while (j < xs.size) {
      res(i) = xs(j)
      i += 1
      j += 2
    }
    return res
  }
}
