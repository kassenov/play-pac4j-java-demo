name := "play-pac4j-java-demo"

version := "2.3.2-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.pac4j" % "play-pac4j" % "2.3.2",
  "org.pac4j" % "pac4j-http" % "1.9.4",
  "org.pac4j" % "pac4j-cas" % "1.9.4",
  "org.pac4j" % "pac4j-openid" % "1.9.4" exclude("xml-apis" , "xml-apis"),
  "org.pac4j" % "pac4j-oauth" % "1.9.4",
  "org.pac4j" % "pac4j-saml" % "1.9.4",
  "org.pac4j" % "pac4j-oidc" % "1.9.4" exclude("commons-io" , "commons-io"),
  "org.pac4j" % "pac4j-gae" % "1.9.4",
  "org.pac4j" % "pac4j-jwt" % "1.9.4" exclude("commons-io" , "commons-io"),
  "org.pac4j" % "pac4j-ldap" % "1.9.4",
  "org.pac4j" % "pac4j-sql" % "1.9.4",
  "org.pac4j" % "pac4j-mongo" % "1.9.4",
  "org.pac4j" % "pac4j-stormpath" % "1.9.4",
  "com.typesafe.play" % "play-cache_2.11" % "2.4.0",
  "commons-io" % "commons-io" % "2.4"
)

resolvers ++= Seq(Resolver.mavenLocal, "Sonatype snapshots repository" at "https://oss.sonatype.org/content/repositories/snapshots/")

routesGenerator := InjectedRoutesGenerator
