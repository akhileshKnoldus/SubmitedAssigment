package com.knoldus.akhilesh

import org.scalatest.FunSuite

class FrequencyOfCharacterSpec extends  FunSuite {

  val frequencyOfCharacter = new FrequencyOfCharacter

  test("Count Charcter of String") {
    val actualResult = frequencyOfCharacter.countCharcter("i i i am indian")
    val expectedResult = Map('i' -> 5, 'a' -> 2, 'm' -> 1, 'n' -> 2, 'd' -> 1)
    assert(actualResult === expectedResult)
  }
}