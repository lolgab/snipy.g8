import scala.sys.process._

name := "$name$"

enablePlugins(ScalaNativePlugin)

scalaVersion := "2.11.12"

nativeLinkingOptions ++= "python3-config --ldflags".!!.split(' ').filter(_.nonEmpty).map(_.trim).toSeq
libraryDependencies += "com.github.lolgab" %%% "snipy" % "0.0.2"