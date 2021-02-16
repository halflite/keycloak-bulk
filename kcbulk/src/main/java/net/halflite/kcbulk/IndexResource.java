package net.halflite.kcbulk;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

@Path("/")
public class IndexResource {

  private final Template index;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public TemplateInstance index() {
      return index.instance();  
  }

  @Inject
  public IndexResource(Template index) {
    this.index = index;
  }
}
