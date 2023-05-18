name := "HelloSpark"
organization := "guru.learningjournal"
version := "0.15"
scalaVersion := "2.12.10"
//scalaVersion := "2.11.8"
autoScalaLibrary := false
//val sparkVersion = "3.2.1.7.2.15.0-147"
val sparkVersion = "3.0.0-preview2"
//val sparkVersion = "2.3.1"

//resolvers ++= Seq(
//  "Cloudera Repo" at "https://repository.cloudera.com/artifactory/cloudera-repos/"
//)

val sparkDependencies = Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)

val testDependencies = Seq(
  "org.scalatest" %% "scalatest" % "3.0.8" % Test
)

libraryDependencies ++= sparkDependencies ++ testDependencies

