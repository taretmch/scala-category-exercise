import Dependencies._

ThisBuild / scalaVersion     := "2.13.3"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.github.taretmch"
ThisBuild / organizationName := "taretmch"

lazy val root = (project in file("."))
  .settings(
    name := "scala-category-exercise",
    libraryDependencies ++= Seq(
      scalaTest % Test
    )
  )
