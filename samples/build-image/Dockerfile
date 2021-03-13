ARG VERSION=3.8-buster
FROM python:$VERSION

RUN mkdir /app

COPY main.py /app/

COPY main2.py /app/

WORKDIR /app

ENTRYPOINT ["python3"]

CMD ["main.py"]

