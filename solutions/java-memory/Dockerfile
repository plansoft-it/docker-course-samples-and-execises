ARG VERSION
FROM openjdk:${VERSION}

RUN mkdir /app

COPY Main.java /app/

WORKDIR /app

RUN javac Main.java

CMD java Main
