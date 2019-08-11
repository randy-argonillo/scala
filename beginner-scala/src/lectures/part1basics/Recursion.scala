package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {
  def factorial(n: Int): BigInt = {
    def helper(num: Int, accumulator: BigInt): BigInt = {
      if (num <= 1) accumulator
      else helper(num - 1, num * accumulator)
    }

    helper(n, 1)
  }


  def concatNTimes(n: Int, word: String): String = {
    @tailrec
    def helper(num: Int, accumulator: String): String = {
      if (num <= 1) accumulator
      else helper(num - 1, word + ", " + accumulator)
    }

    helper(n, word)
  }

  println(concatNTimes(20000, "hello"))

}
