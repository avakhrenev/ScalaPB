resolvers ++= Seq(
  "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"
  )

libraryDependencies ++= Seq(
  "com.github.os72" % "protoc-jar" % "3.0.0-a3",
  "com.google.protobuf" % "protobuf-java" % "3.0.0-alpha-3",
  "com.trueaccord.lenses" %% "lenses" % "0.4",
  "org.scalacheck" %% "scalacheck" % "1.12.1" % "test",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

libraryDependencies <+= (scalaVersion) { v => "org.scala-lang" % "scala-compiler" % v }

fork in Test := false
