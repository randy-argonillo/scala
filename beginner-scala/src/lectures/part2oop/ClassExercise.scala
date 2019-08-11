package lectures.part2oop

object ClassExercise extends App {
  val writer = new Writer("John", "Doe", 1985)
  println(writer.fullName)

  val novel = new Novel("The coming of age", 2010, writer)
  println(novel.authorAge)
  println(novel.isWrittenBy(writer))

  val copiedNovel = novel.copy(2012)
  println(copiedNovel.authorAge)

  val counter = new Counter()
  counter.increase.increase.increase.print()
  counter.increase(5).print()
}

class Writer(firstName: String, lastName: String, val birthYear: Int) {
  def fullName: String = s"${this.firstName} ${this.lastName}"
}

class Novel(title: String, yearRelease: Int, author: Writer) {
  def authorAge: Int = yearRelease - this.author.birthYear
  def isWrittenBy(author: Writer): Boolean = author == this.author
  def copy(yearRelease: Int): Novel = new Novel(this.title, yearRelease, this.author)
}

class Counter(initial: Int = 0) {
  def count: Int = initial
  def print(): Unit = println(this.count)

  def increase: Counter = {
    println("Incrementing")
    new Counter(this.count + 1)
  }
  def increase(nTimes: Int): Counter = {
    if (nTimes <= 0) this
    else increase.increase(nTimes - 1)
  }

  def decrease: Counter = {
    println("Decrementing")
    new Counter(this.count - 1)
  }

  def decrease(nTimes: Int): Counter = {
    if (nTimes <= 0) this
    else decrease.decrease(nTimes - 1)
  }

}




