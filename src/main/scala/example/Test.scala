package example

import com.github.andyglow.xml.diff._

object Test {
  val xml = <element>{1.to(1000).map(i => <i>{i}</i>)}</element>

  def main(args: Array[String]): Unit =
    println(xml =#= xml)
}
