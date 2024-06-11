# Projekt: TestEntity


## Notizen 28.5.24
Spring Data: https://spring.io/projects/spring-data

Postgres Docker: https://hub.docker.com/_/postgres
docker run --name <db-name> -e POSTGRES_PASSWORD=mysecretpassword -p 5432:5432 -d postgres

IntelliJ Datagrip Postgres verbinden
DAtenbank erstellen, Namen speichern

https://hackernoon.com/using-postgres-effectively-in-spring-boot-applications

konfiguration Datenbank in application.properties

Repository
Service erstellen
GetAll Methode von Controller bis Datenbank

## Notizen 10.6.24

### Test Konfiguration
H2 Dependency für Test hinzufügen
H2 in test application properties konfigurieren.

### Deployment mit Datenbank
appication-prod.properties

Environment variablen in in prod properties verwenden db url und passwort

Docker file -Dspring.profiles.active=prod

In render Environment variablen für DB anlegen - gleicher name wie in application-prod.properties 