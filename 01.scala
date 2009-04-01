// P01 (*) Find the last element of a list 


// This solution throws java.util.NoSuchElementException given an empty list
// def last(l: List[Any]) = l.last

// This solution handles an empty list
def last(l: List[Any]) = {
  l.length match {
    case 0 => None
    case _ => l.last
  }
}

println("Non-empty list...")
println(last(List(1, 1, 2, 3, 5, 8)))
println("Empty list...")
println(last(Nil))
