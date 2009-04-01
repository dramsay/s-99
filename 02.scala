// P02 (*) Find the last but one element of a list.


// These solutions throw java.util.NoSuchElementException given an empty list
// def penultimate(l: List[Any]) = l takeRight 2 head
//
// or 
//
// def penultimate(l: List[Any]) = l reverse (1)

// This solution handles empty lists
def penultimate(l: List[Any]) = {
  if (l.length >= 2) l reverse (1)
  else None
}

println("Non-empty list...")
println(penultimate(List(1, 1, 2, 3, 5, 8)))
println("Empty list...")
println(penultimate(Nil))
