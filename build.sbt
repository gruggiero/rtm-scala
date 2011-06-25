name := "rtm-scala"

version := "0.0.1-SNAPSHOT"

organization := "eu.hirpus.rtm"

scalaVersion := "2.9.0-1"

scalacOptions ++= Seq("-optimize", "-unchecked", "-deprecation", "-Xcheckinit", "-encoding", "utf8")

libraryDependencies ++= Seq(
										  "net.liftweb" %% "lift-json" % "2.4-M1",
											"net.databinder" %% "dispatch-http" % "0.8.3"
)