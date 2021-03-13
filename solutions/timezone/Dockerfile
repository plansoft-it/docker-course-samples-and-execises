FROM ubuntu:20.04

ENV DEBIAN_FRONTEND=noninteractive
RUN apt-get update && apt-get install -y --no-install-recommends tzdata \
    && rm -rf /var/lib/apt/lists/*
RUN echo "Europe/Rome" > /etc/timezone
RUN rm -rf /etc/localtime && dpkg-reconfigure -f noninteractive tzdata

CMD ["/bin/bash","-c", "date"]