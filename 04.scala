// P04 (*) Find the number of elements of a list

def length(l: List[Any]) = {
  l.length
}

println("Non-empty list...")
println(length(List(1, 1, 2, 3, 5, 8)))
println("Empty list...")
println(length(Nil))
