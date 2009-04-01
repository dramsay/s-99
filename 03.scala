//P03 (*) Find the Kth element of a list.
 
// This throws java.util.NoSuchElementException if i is greater than l.length - 1
//def nth(i: Int, l: List[Any]) = l(i)

def nth(i: Int, l: List[Any]) = {
  if (l.length > 0 && i < l.length) l(i)
  else None
}

println("Non-empty list, index in bounds...")
println(nth(2, List(1, 1, 2, 3, 5, 8)))
println("Non-empty list, index out of bounds...")
println(nth(10, List(1, 1, 2, 3, 5, 8)))
println("Empty list...")
println(nth(2, Nil))
