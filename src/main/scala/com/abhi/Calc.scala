package com.abhi

import com.typesafe.config.ConfigFactory

/**
  * Created by ASrivastava on 8/22/17.
  */
class Calc {
   val config = ConfigFactory.load()
   val a = config.getInt("a")
   val b = config.getInt("b")

   def sum() : Int = a + b
}
