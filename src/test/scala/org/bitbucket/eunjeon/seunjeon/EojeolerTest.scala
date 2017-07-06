package org.bitbucket.eunjeon.seunjeon

import org.scalatest.FunSuite


class EojeolerTest extends FunSuite {

  test("Eojeol build") {
    //val analyzed = Analyzer.parse("아버지가방에들어가신다.")
    val analyzed = Analyzer.parse("유영호군과김고은양이결혼했습니다. 축하해주세요.")
    analyzed.foreach(println)
    val eojeols = Eojeoler.build(analyzed)
    eojeols.foreach(println)
    println(eojeols.map(_.surface).mkString(" "))
  }

}
