
ThisBuild / scalaVersion := "2.13.14"
ThisBuild / version := "1.0-SNAPSHOT"
ThisBuild / scalacOptions ++= Seq(
  "-feature",
  "-Werror"
)

lazy val subproj = (project in file("subproj"))
  .enablePlugins(PlayScala)
  .settings(
    name := """sbt-sass-issue-subproj""",
    libraryDependencies ++= Seq(
      guice,
      "com.h2database" % "h2" % "2.2.224",
    )
  )


lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  //.enablePlugins(PlayNettyServer).disablePlugins(PlayAkkaHttpServer) // uncomment to use the Netty backend
  .settings(
    name := """sbt-sass-issue""",
    libraryDependencies ++= Seq(
      "org.scalatestplus.play" %% "scalatestplus-play" % "6.0.1" % Test,
    ),
    // Needed for ssl-config to create self signed certificated under Java 17
    Test / javaOptions ++= List ("--add-exports=java.base/sun.security.x509=ALL-UNNAMED")
  )
  .dependsOn(subproj)
  .aggregate(subproj)
