FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD vehicaltracking-0.0.1-SNAPSHOT.jar app.jar
ENV http_proxy http://<proxyUserName>:<proxyPassword>@<proxyHost>:<proxyPort>
ENV https_proxy http://<proxyUserName>:<proxyPassword>@<proxyHost>:<proxyPort>
ENV no_proxy 192.168.99.100
RUN echo 'hosts: files mdns4_minimal [NOTFOUND=return] dns mdns4' >> /etc/nsswitch.conf
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]