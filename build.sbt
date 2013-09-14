name := "treePrintTester"

version := "0.2.0"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
        compilerPlugin("test.org" %% "printplugin" % "1.0")
        //compilerPlugin("org.scala-lang.plugins" %% "printplugin" % "1.0"),
        //"org.scala-lang" %% "scala-pretty-printer" % "0.2.0"
      )

//libraryDependencies += compilerPlugin("org.scala-lang" %% "printplugin" % "2.10")

scalacOptions += "-P:printplugin:oversrc"

//libraryDependencies += "org.scala-lang" %% "scala-pretty-printer" % "2.10"
