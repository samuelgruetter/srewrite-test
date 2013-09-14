name := "treePrintTester"

version := "0.2.0"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
        //compilerPlugin("test.org" %% "printplugin" % "1.0")
        compilerPlugin("org.scala-lang.plugins" %% "printplugin" % "1.0")
        //"org.scala-lang" %% "scala-pretty-printer" % "0.2.0")
      )

scalacOptions += "-P:printplugin:oversrc"
