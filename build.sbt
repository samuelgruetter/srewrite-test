
name := "srewrite-test"

version := "0.1.0"

scalaVersion := "2.10.2"

scalacOptions ++= Seq("-deprecation", "-feature")

libraryDependencies ++= Seq(
  // needs to be in your local cache
  compilerPlugin("org.scala-lang.plugins" %% "srewriteplugin" % "0.1.0")
)

// scalacOptions += "-P:srewriteplugin:dir-name:myAST"

