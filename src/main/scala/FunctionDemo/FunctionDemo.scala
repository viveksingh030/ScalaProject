package FunctionDemo

import java.util.Date
import scala.annotation.targetName

object FunctionDemo {
  def main(args: Array[String]): Unit = {
    println(Math.compute(4, 6, 8, _ + _))
    println(defaultParameterFunc());
    println(defaultParameterFunc(60));
    println(defaultParameterFunc(80, 20));

    //partially applies function
    val date = new Date
    val newLog = log(date, _);
    newLog("Logging First log")
    newLog("Logging Second log")
    println(Math.+(4)(6))
    println(Math.sumByVarags(1,2,3,4,5))

    val sumWith10: (Int) => Int = Math.+(10)
    println(sumWith10(20))

    greeting("Hello")

    greeting2(name="Vivek")
  }

  private def log(date: Date, message: String) = {
    println(date.toString + " " + message)
  }

  private def defaultParameterFunc(x: Int = 5, y: Int = 5): Int = {
    x + y
  }

  private  def greeting(greet:String,name:String="Vivek"): Unit = {
    println(f"${greet} ${name}")
  }

  private def greeting2(greet: String="hello", name: String): Unit = {
    println(f"${greet} ${name}")
  }

  object Math {

    def square(x: Int): Int = x * x

    @targetName("add")
    def +(x: Int)(y: Int): Int = x + y

    def subtract(x: Int, y: Int): Int = x - y

    def multiply(x: Int, y: Int): Int = x * y

    def division(x: Int, y: Int): Int = {
      x / y
    }

    def compute(x: Int, y: Int, z: Int, f: (Int, Int) => Int): Int = f(f(x, y), z)

    def sumByVarags(arr:Int*):Int=arr.sum
  }
}
