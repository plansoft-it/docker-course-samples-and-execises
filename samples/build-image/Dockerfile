ARG VERSION=18.04
FROM ubuntu:${VERSION}

RUN apt update -y && apt install -y python3 && \
    rm -rf /var/lib/apt/lists/* && mkdir /app

COPY main.py /app/

COPY main2.py /app/

WORKDIR /app

ENTRYPOINT ["python3"]

CMD ["main.py"]

