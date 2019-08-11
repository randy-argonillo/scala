package lectures.part2oop

object OOBasics extends App {
  val person = new Person("John", 24)
  println(s"Age: ${person.age}")

  println(person.greet())
  println(person.greet("Jane"))
}

class Person(name: String, val age: Int) {
  // 'age' is a field as it define with 'val'

  // Within curly braces is the body of the class.
  // The body may contain variable declaration and method definition.
  // Any variable declared within the body will become a field.
  // Any side-effects like printing inside the class body will be executed during instantiation

  def greet(name: String): String = s"${this.name} says: hi $name"
  def greet(): String = s"Hi, my name is ${this.name}"
}