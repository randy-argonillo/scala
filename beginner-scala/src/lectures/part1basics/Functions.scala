package lectures.part1basics

object Functions extends App{
  def concat(a: String, b: Int): String = {
    a + " " + b
  }

  println(concat("hello", 3))

  def parameterLess(): Int = 42

  println(parameterLess)

  def factorial(n: Int): BigInt = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }

  def isPrime(n: Int): Boolean = (n % 2) != 0

  println(isPrime(37 * 17))

}
