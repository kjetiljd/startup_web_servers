name := "startup_web_server"

version := "1.0"

scalaVersion := "2.9.1"

organization := "org.startupwebserver"

libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "1.6.1" % "test",
  "org.scalatra" %% "scalatra" % "2.0.3",
	"org.eclipse.jetty.aggregate" % "jetty-webapp" % "7.6.0.v20120127")
