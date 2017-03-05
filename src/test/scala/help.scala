import org.scalacheck._
import org.scalacheck.Prop.forAll

package object sorting {
  implicit class IsOrderable[T <% Ordered[T]](a: Seq[T]) {
    def isOrdered: Boolean = {
      if (a.isEmpty) true
      else (a zip a.tail).foldLeft(true) { (acc, cur) =>
        val (h, t) = cur
        (h <= t) && acc
      }
    }
  }
}
