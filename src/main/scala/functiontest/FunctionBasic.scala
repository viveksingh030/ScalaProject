package functiontest

import functiontest.FunctionBasic.Point

import scala.annotation.tailrec

object FunctionBasic {
  def main(args: Array[String]): Unit = {
    println(area(6))
    println(area(6.7))
    printBy5(5)
    println(power(2,-2))
    println(diffTwoD(Point(1,2),Point(3,4)));
  }

 private def area(radius:Double):Double=Math.PI*radius*radius

  private def area(radius:String):Double={
    val radiusDouble=radius.toDouble
    Math.PI*radiusDouble*radiusDouble;
  }

  @annotation.tailrec
  private def printBy5(value:Int):Unit={
    if(value<=50) {
      println(value)
      printBy5(value + 5)
    }
  }

  def formatMilliseconds(milliseconds: Long): String = {
    val seconds = milliseconds / 1000
    val minutes = seconds / 60
    val hours = minutes / 60
    val days = hours / 24

    val remainingSeconds = seconds % 60
    val remainingMinutes = minutes % 60
    val remainingHours = hours % 24

    f"$days day(s), $remainingHours hour(s), $remainingMinutes minute(s), $remainingSeconds second(s)"
  }

  private def power(base:Double,exponent:Int):Double={
    if(exponent==0){
      return 1.0;
    }
    val temp=power(base,exponent/2)
    if (exponent % 2 == 0) {
      temp * temp;
    }else{
      if(exponent<0){
        temp*temp/base
      }else{
        base*temp*temp
      }
    }
  }

  class Point(val x:Int,val y:Int){
    override def toString = s"Point($x, $y)"
  }

  private def diffTwoD(t1:Point,t2:Point):Point={
   Point(t1.x-t2.x,t1.y-t2.y)
  }
}
