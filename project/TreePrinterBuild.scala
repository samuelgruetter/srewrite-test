import sbt._
import Keys._

object TreePrinterBuild extends Build {
  val printPlugin = Project(
    id = "treePrintTester", 
    base = file("."),
    settings = Defaults.defaultSettings ++ Seq(
      name := "treePrintTester",
      version := "0.2.0",
      scalaVersion := "2.10.2",
      libraryDependencies ++= Seq(
        compilerPlugin("org.scala-lang.plugins" %% "printplugin" % "0.2.0" classifier "assembly")
      ),

      scalacOptions += "-P:printplugin:oversrc"
    )
  )
}
