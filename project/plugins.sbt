// Compat bodge: https://stackoverflow.com/a/74338012/285374
ThisBuild / libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.9.3")

addSbtPlugin("io.github.irundaia" % "sbt-sassify" % "1.5.2")

