FROM amazoncorretto:17-al2-jdk

# Create a user
RUN yum update -y && \
    yum install -y shadow-utils && \
    yum clean all && \
    rm -rf /var/cache/dnf
RUN groupadd -r appuser && \
    useradd -m -r -g appuser appuser
USER appuser

WORKDIR /app/
RUN chown -R appuser:appuser /app

# Install Gradle
COPY --chown=appuser:appuser ./gradle/ /app/gradle/
COPY --chown=appuser:appuser ./gradlew /app/
RUN ./gradlew --version --no-daemon

# Install dependencies
COPY --chown=appuser:appuser ./build.gradle ./settings.gradle /app/
RUN ./gradlew dependencies --no-daemon

# Build projcet
COPY --chown=appuser:appuser . /app/
RUN ./gradlew build shadowJar --no-daemon

# Disable building a JAR because we already built it.
ENV SHADOW=No
