package fpinscala.datastructures

import org.scalatest.WordSpec

import scala.fpinscala.datastructures.List

class ListTest extends WordSpec {

  ".printHello" when {
    "will return Hello" in {
      assertResult("Hello List") {
        List.printHello
      }
    }
  }

  "should drop n items from list" in {
    assertResult(List(3,4,5)) {
      List.drop(List(1,2,3,4,5), 2)
    }
  }

  "should drop items from list until condition " in {
    assertResult(List(3,4,5)) {
      List.dropWhile(List(1,2,3,4,5))( _ < 3)
    }
  }

  "init should drop last item from list " in {
    assertResult(List(1,2,3,4)) {
      List.init[Int](List(1,2,3,4,5))
    }
  }

  "product should return product of list " in {
    assertResult(24) {
      List.product(List(1,2,3,4)){(x:Double,y:Double)=>x*y}
    }
  }

  "product should return 0 for list containing 0" in {
    assertResult(0) {
      List.product(List(1,0,3,4)){(x:Double,y:Double)=>x*y}
    }
  }

  "length should return length for list " in {
    assertResult(4) {
      List.length(List(1,2,3,4))
      List.length3(List(1,2,3,4))
    }
  }
  "reverse should return reverse of list " in {
    assertResult(List(4,3,2,1)) {
      List.reverse(List(1,2,3,4))
    }
  }


}