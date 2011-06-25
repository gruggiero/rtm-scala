package eu.hirpus.rtm

import dispatch._

object Conn {

import java.security.MessageDigest

	val url = "http://api.rememberthemilk.com/services/rest"

//?method=rtm.auth.getFrob&api_key=7f05f918a68abc9185faa2fd6baf09b6

	def md5(s: String) = {
    MessageDigest.getInstance("MD5").digest(s.getBytes).map("%02X" format _).mkString
	}
  def main(args:Array[String]) = {
		println (md5("Hello"))
	}

}
