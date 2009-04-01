// P02 (*) Find the last but one element of a list.


// This solution throws java.util.NoSuchElementException given an empty list
// def penultimate(l: List[Any]) = l takeRight 2 head

// This solution handles empty lists
def penultimate(l: List[Any]) = {
  if (l.length >= 2) l takeRight 2 head
  else None
}

println("Non-empty list...")
println(penultimate(List(1, 1, 2, 3, 5, 8)))
println("Empty list...")
println(penultimate(Nil))
