package object test {
  implicit class IsOrderable[T <% Ordered[T]](a: Seq[T]) {
    def isOrdered: Boolean = {
      if (a.isEmpty) true
      else (a zip a.tail).foldLeft(true) { (acc, cur) =>
        val (h, t) = cur
        if (h <= t) acc && true
        else false
      }
    }
  }
}
