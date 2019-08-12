
val arg = if (args.length > 0) args(0) else "world!"
println("Hello " + arg)

args.foreach(println)
for(arg <- args)
  println(arg)

