package lectures.part1basics

object CBNvsCBV extends App{
  def callByValue(n: Long): Unit = {
    println("call by value" + n)
    println("call by value" + n)
  }

  def callByName(n: => Long): Unit = {
    println("call by name" + n)
    println("call by name" + n)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFunc(a: Int, b: => Int) = println(a)

  printFunc(34, infinite())
}
