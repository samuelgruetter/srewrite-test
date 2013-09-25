import sbt._
import Keys._
import com.typesafe.sbt.SbtSite.site
import com.typesafe.sbt.SbtSite.SiteKeys._
import com.typesafe.sbt.site.JekyllSupport.Jekyll
import com.typesafe.sbt.SbtGhPages.ghpages
import com.typesafe.sbt.SbtGit.git

object TreePrinterBuild extends Build {
  val printPlugin = Project(
    id = "treePrintTester", 
    base = file("."),
    settings = Defaults.defaultSettings ++ Seq(
      name := "treePrintTester",
      version := "0.2.0",
      scalaVersion := "2.10.2",
      libraryDependencies ++= Seq(
        compilerPlugin("org.scala-lang.plugins" %% "printplugin" % "0.2.0")
      ),
      //compilerPlugin("org.scala-lang.plugins" %% "printplugin" % "0.2.0") //classifier "assembly")
      //scalacOptions += "-P:printplugin:oversrc"
      scalacOptions += "-P:printplugin:dir-name:myAST",
      scalacOptions += "-P:printplugin:base-dir:/home/vova"
  )) settings (websiteSettings: _*)

  lazy val websiteSettings: Seq[Setting[_]] = (
    site.settings ++
    ghpages.settings ++
    //site.includeScaladoc() ++
    //site.jekyllSupport() ++
    Seq(
      git.remoteRepo := "git@github.com:VladimirNik/sprinter.git"
      //includeFilter in Jekyll := ("*.html" | "*.png" | "*.js" | "*.css" | "CNAME")
      // the migration guide goes to scaladoc
      //excludeFilter in Jekyll := ("actors-migration-guide.html")
    )
  )
}
