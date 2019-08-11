package lectures.part1basics

/**
  * Created by randy.argonillo on 6/16/18.
  */
object Expressions extends App {
  var aValue: Int = 1
  val weirdValue: Unit = aValue = 3
  println(weirdValue)

  println(if(true) 5 else 7)

  val blockResult = {
    val a = 5
    val b = 10

    if(a < 5) "Yes" else "No"
  }

  println(blockResult)
  
}
