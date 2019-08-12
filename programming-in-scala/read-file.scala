import scala.io.Source

def echoFileContent(fileName: String): Unit = {
  val lines = Source.fromFile(fileName).getLines().toList()
  
  val longestLinesLength = lines.reduceLeft(
    (a, b) => if (a.length >= b.length) a else b
  ).length.toString().length

  
  lines.foreach(line => {
    val padding = " " * (longestLinesLength - line.length.toString().length)
    println(padding + line.length + " | " + line)
  })
}

if (args.length > 0)
  echoFileContent(args(0))