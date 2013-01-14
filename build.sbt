name := "scannerTest"
 
version := "0.1"

scalaVersion := "2.10.0"


resolvers ++= Seq(
  "Sonatype OSS Release repo" at "http://oss.sonatype.org/content/repositories/releases/",
  "Sonatype OSS groups repo" at "http://oss.sonatype.org/content/groups/public/",
  "Sonatype OSS Snapshot repo" at "http://oss.sonatype.org/content/repositories/snapshots/",
  "Java.net Maven2 Repository" at "http://download.java.net/maven/2/",
  "Typesafe Repos" at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(                                                                                                         
  "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
  "org.scalamock" %% "scalamock-scalatest-support" % "3.0" % "test"
) 
