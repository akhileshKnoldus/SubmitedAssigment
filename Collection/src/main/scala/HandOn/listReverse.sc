/*Reverse a Lists*/

def reverse[A](l: List[A]): List[A] = {
  l match {
    case h :: t => reverse(t) ::: List(h)
    case Nil => Nil
  }
}

reverse(List(1, 2, 2, 5))




