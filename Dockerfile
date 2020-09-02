FROM java:8

EXPOSE 8080

ADD target/reservationsspringboot-0.0.1-SNAPSHOT.jar reservationsspringboot-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","reservationsspringboot-0.0.1-SNAPSHOT.jar"]