package edu.tamu.scholars.middleware.discovery.model.generated.relationship;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

import com.fasterxml.jackson.annotation.JsonInclude;
import edu.tamu.scholars.middleware.discovery.model.generated.AbstractNestedDocument;
import io.leangen.graphql.annotations.types.GraphQLType;
import java.lang.String;

/**
 * This file is automatically generated on compile.
 *
 * Do not modify this file -- YOUR CHANGES WILL BE ERASED!
 */
@GraphQLType(
    name = "RelationshipContributor"
)
@JsonInclude(NON_EMPTY)
public class Contributor extends AbstractNestedDocument {
  private static final long serialVersionUID = -834479133L;

  private String type;

  public Contributor() {
    super();
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
