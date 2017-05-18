name := """otten"""
organization := "vanOtt.org"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.11"

libraryDependencies += filters
libraryDependencies += evolutions

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.18",
  "org.webjars"               %% "webjars-play"       % "2.3.0",
  "org.webjars"               % "bootstrap"           % "3.0.0" exclude("org.webjars", "jquery"),
  "org.webjars"               % "jquery"              % "1.8.3"
)
