FROM amazonlinux:2
RUN yum install -y sudo which tar unzip
RUN sudo yum install -y java-11-amazon-corretto
RUN curl -o /opt/newrelic-java.zip --create-dirs https://download.newrelic.com/newrelic/java-agent/newrelic-agent/current/newrelic-java.zip
RUN unzip /opt/newrelic-java.zip -d /opt/
COPY newrelic.yml /opt/newrelic/newrelic.yml
WORKDIR /app