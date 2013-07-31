name := "treePrintTester"

version := "0.1.0"

scalaVersion := "2.10.2"

scalacOptions += "-Xplugin:/home/vova/scala-projects/GSoC/compilerPlugins/printPlugin/target/scala-2.10/printplugin_2.10-1.0.jar"

scalacOptions += "-P:printplugin:dir-name:printAST"

//scalacOptions += "-verbose"

//scalacOptions += "-print"
