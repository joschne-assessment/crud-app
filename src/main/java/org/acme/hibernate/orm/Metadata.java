package org.acme.hibernate.orm;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

@Path("metadata")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
public class Metadata {

    @ConfigProperty(name = "app.version")
    private String appVersion;

    @ConfigProperty(name = "app.color")
    private String appColor;

    @GET
    public String get() {
        return "{\"version\":\"" + appVersion + "\",\"color\":\"" + appColor + "\"}";
    }

}

