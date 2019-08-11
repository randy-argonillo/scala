package lectures.part2oop

object MethodNotation extends App{
  class Person(name: String, favoriteMovie: String, age: Int = 18) {
    def likes(movie: String): Boolean = favoriteMovie == movie
    def hangOutWith(name: String): String = s"${this.name} hangout with $name" // sample of infix notation
    def +(nickname: String) : Person = new Person(s"$name ($nickname)", favoriteMovie) // sample of infix notation
    def unary_! : String = "Hey yo!" // unary operators (prefix notation) can be +, -, !, ~
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    def isAlive : Boolean = true // sample of postfix notation
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie" // apply is a special function in scala
    def apply(nTimes: Int): String = s"$name watch $favoriteMovie $nTimes times"
    def print(): Unit = println(s"Name: $name, Favorite Move: $favoriteMovie, Age: $age")
    def learns(subject: String): String = s"$name learns $subject"
    def learnsScala: String = learns("Scala")
  }

  val randy = new Person("Randy", "Inception")
  println(randy likes "Inception")
  println(randy hangOutWith "Mary")
  println(!randy)
  println(randy isAlive)
  println(randy()) // same as john.apply()
  randy + "The Great" print()
  +randy print()
  println(randy learnsScala)
  println(randy(2))
}
