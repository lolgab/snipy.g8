import snipy._
import snipy.dynamic._

object Main {
  def main(args: Array[String]): Unit = PyZone { implicit z =>
    val math = module("math")
    val result = math.log(2.0)
    println(result)
  }
}
