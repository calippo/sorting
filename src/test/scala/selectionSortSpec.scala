package sorting

import org.scalacheck._
import org.scalacheck.Prop.forAll

object SelectionSortSpec extends Properties("selection sort") {
  import selection._
  property("selection sorted list int") = forAll { (a: List[Int]) => selectionSort(a).isOrdered }
  property("selection sorted list double") = forAll { (a: List[Double]) => selectionSort(a).isOrdered }
  property("selection sorted seq int") = forAll { (a: Seq[Int]) => selectionSort(a).isOrdered }
  property("selection sorted seq double") = forAll { (a: Seq[Double]) => selectionSort(a).isOrdered }
}
