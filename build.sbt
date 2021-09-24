lazy val root = project.in(file("."))
  .settings(
    name := "xml-diff-stack-safety",
    organization := "com.example",
    scalaVersion := "2.13.6",
    version      := "0.1.0-SNAPSHOT",
    libraryDependencies += "com.github.andyglow" %% "scala-xml-diff" % "3.0.0",
    run / fork := true,
    run / javaOptions += "-Xss256K"
  )
