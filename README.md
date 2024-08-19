# jmediator-spring-boot-starter

Spring Boot Starter for the JMediator

## Release Build

Manual process to publish to Maven Central. At the moment publishing using the maven plugin is broken for the new process.

- Check version number in POM
- export GPG_TTY=$(tty) 
- mvn -DskipTests -DcreateChecksum=true install gpg:sign
- Enter PGP Key
- Zip ./m2/repository/io/membrane-api/jmediator-spring-boot-starter
- Login at: https://central.sonatype.com and upload ZIP file

Todo: - Use maven plugin to publish 