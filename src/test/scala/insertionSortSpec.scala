package test

import org.scalacheck._
import org.scalacheck.Prop.forAll

object InsertionSortSpec extends Properties("insertion sort") {
  import sorting._
  property("insertion sorted list int") = forAll { (a: List[Int]) => insertionSort(a).isOrdered }
  property("insertion sorted list double") = forAll { (a: List[Double]) => insertionSort(a).isOrdered }
  property("insertion sorted seq int") = forAll { (a: Seq[Int]) => insertionSort(a).isOrdered }
  property("insertion sorted seq double") = forAll { (a: Seq[Double]) => insertionSort(a).isOrdered }
}
