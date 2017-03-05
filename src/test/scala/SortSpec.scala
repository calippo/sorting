package sorting

import org.scalacheck._
import org.scalacheck.Prop.forAll

object SortSpec extends Properties("sort") {
  import insertion._
  import selection._
  import bubble._

  property("insertion sorted output is sorted") = forAll { (a: List[Double]) => insertionSort(a).isOrdered }
  property("insertion sorted output contains original elements") = forAll { (a: List[Double]) => insertionSort(a).toSet == a.toSet }

  property("selection sorted on list of double is sorted") = forAll { (a: List[Double]) => selectionSort(a).isOrdered }
  property("selection sorted output contains original elements") = forAll { (a: List[Double]) => selectionSort(a).toSet == a.toSet }


  property("bubble sorted on list of double is sorted") = forAll { (a: List[Double]) => bubbleSort(a).isOrdered }
  property("bubble sorted output contains original elements") = forAll { (a: List[Double]) => bubbleSort(a).toSet == a.toSet }

}
