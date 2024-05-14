./mvnw quarkus:build  \
            -Dquarkus.container-image.push=true \
            -Dquarkus.container-image.registry="ghcr.io" \
            -Dquarkus.container-image.group="joschne-assessment" \
            -Dquarkus.container-image.name="crud-app" \
            -Dquarkus.container-image.tag="test"
