package com.abhi

import org.scalatest._

/**
  * Created by ASrivastava on 8/22/17.
  */
class CalcTest extends FlatSpec {
   "A Calc" should " be able to add " in {
      val c = new Calc()
      val result = c.sum()
      assert(result == 50)
   }
}
