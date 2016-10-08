organization  := "io.buildo"

version       := "0.1-SNAPSHOT"

scalaVersion  := "2.11.8"

scalacOptions := Seq()

fork := true

resolvers ++= Seq(
  "buildo" at "https://github.com/buildo/mvn/raw/master/releases",
  "spray repo" at "http://repo.spray.io/",
  "Mandubian repository snapshots" at "https://github.com/mandubian/mandubian-mvn/raw/master/snapshots/",
  "Mandubian repository releases" at "https://github.com/mandubian/mandubian-mvn/raw/master/releases/",
  "Sonatype Nexus Releases" at "https://oss.sonatype.org/content/repositories/releases",
  "Sonatype Nexus Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
  "Typesafe" at "http://repo.typesafe.com/typesafe/releases",
  "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/",
  "buildo mvn" at "https://raw.github.com/buildo/mvn/master/releases",
  DefaultMavenRepository
)

libraryDependencies ++= {
  val akkaV = "2.3.2"
  val sprayV = "1.3.1"
  Seq(
    "org.scalacheck" %% "scalacheck" % "1.13.0" % "test"
  )
}
