import sbt._

name := "north-code-dojo-3"

version := "1.0"

libraryDependencies ++= Seq("junit" % "junit" % "4.11" % "test")

libraryDependencies += "com.novocode" % "junit-interface" % "0.8" % "test->default"
