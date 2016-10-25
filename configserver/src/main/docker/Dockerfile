FROM oberthur/docker-alpine-java
VOLUME /tmp
ADD configserver-0.0.1-SNAPSHOT.jar app.jar
ENV http_proxy http://<proxyUserName>:<proxyPassword>@<proxyHost>:<proxyPort>
ENV https_proxy http://<proxyUserName>:<proxyPassword>@<proxyHost>:<proxyPort>
ENV no_proxy 192.168.99.100
ENV HTTP_PROXY http://<proxyUserName>:<proxyPassword>@<proxyHost>:<proxyPort>
ENV HTTPS_PROXY http://<proxyUserName>:<proxyPassword>@<proxyHost>:<proxyPort>
ENV NO_PROXY 192.168.99.100
#RUN echo 'hosts: files mdns4_minimal [NOTFOUND=return] dns mdns4' >> /etc/nsswitch.conf
#RUN apk add --update curl
#RUN grep '^networkaddress.cache.ttl=' /opt/${JAVA_PACKAGE}/lib/security/java.security || echo 'networkaddress.cache.ttl=10' >> /opt/${JAVA_PACKAGE}/lib/security/java.security
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dhttps.proxyHost=<proxyHost>","-Dhttps.proxy=<proxyHost>","-Dhttps.proxyPort=<proxyPort>","-Dhttps.proxyUser=<proxyUserName>","-Dhttps.proxyPassword=<proxyPassword>","-jar","/app.jar"]