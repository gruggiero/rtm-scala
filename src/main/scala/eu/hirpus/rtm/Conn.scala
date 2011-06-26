package eu.hirpus.rtm

import dispatch._
import scala.collection._
import java.security.MessageDigest

object Conn {

	val params = mutable.Map[String, String]()
	params += ("method" -> "rtm.auth.getFrob")
	params += ("api_key" -> "67a282bc0cb82f652d5191090e982dd2")
	params += ("format" -> "json")

	def encode(params: Map[String,String]) = {
			params.s
	}
  // val url = "http://api.rememberthemilk.com/services/rest"

  val url = "http://api.rememberthemilk.com/services/rest?method=rtm.auth.getFrob&api_key=67a282bc0cb82f652d5191090e982dd2"

  def md5(s: String) = {
    MessageDigest.getInstance("MD5").digest(s.getBytes).map("%02X" format _).mkString
  }
  def main(args:Array[String]) = {

    println (md5("Hello"))
			println("test")
  }

}
