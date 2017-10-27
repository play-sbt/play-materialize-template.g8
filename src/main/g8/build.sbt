name := """$name$"""
organization := "$organization$"

version := "$version$"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "$scala_version$"

libraryDependencies += guice

libraryDependencies ++= Seq(
	"org.webjars" %% "webjars-play" % "2.6.1",
	"org.webjars" % "jquery" % "3.2.1",
	"org.webjars" % "materializecss" % "0.100.2",
	"org.webjars.npm" % "webfontloader" % "1.6.24"
)

