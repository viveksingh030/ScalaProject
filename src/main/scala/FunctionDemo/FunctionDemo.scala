package FunctionDemo

import java.util.Date

object FunctionDemo {
  def main(args: Array[String]): Unit = {
    println(Math.add(3, 5))
    println(Math.compute(4, 6, 8, _ + _))
    println(Math.compute(40, 60, 80, Math.add(_, _)))
    println(defaultParameterFunc());
    println(defaultParameterFunc(60));
    println(defaultParameterFunc(80, 20));
    println(Math.+(50, 60))

    //partially applies function
    val date = new Date
    val newLog = log(date, _);
    newLog("Logging First log")
    newLog("Logging Second log")
  }

  def log(date: Date, message: String) = {
    println(date.toString + " " + message)
  }

  def defaultParameterFunc(x: Int = 5, y: Int = 5): Int = {
    x + y
  }

  object Math {

    def square(x: Int) = x * x

    def +(x: Int, y: Int): Int = x + y

    def add(x: Int, y: Int): Int = {
      return x + y;
    }

    def subtract(x: Int, y: Int): Int = x - y

    def multiply(x: Int, y: Int) = x * y

    def division(x: Int, y: Int): Int = {
      x / y
    }

    def compute(x: Int, y: Int, z: Int, f: (Int, Int) => Int): Int = f(f(x, y), z)
  }
}
