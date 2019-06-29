package edu.tamu.scholars.middleware.discovery.model.generated.relationship;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

import com.fasterxml.jackson.annotation.JsonInclude;
import edu.tamu.scholars.middleware.discovery.model.generated.AbstractNestedDocument;
import io.leangen.graphql.annotations.types.GraphQLType;

/**
 * This file is automatically generated on compile.
 *
 * Do not modify this file -- YOUR CHANGES WILL BE ERASED!
 */
@GraphQLType(
    name = "RelationshipPrincipalInvestigator"
)
@JsonInclude(NON_EMPTY)
public class PrincipalInvestigator extends AbstractNestedDocument {
  private static final long serialVersionUID = -580191233L;

  public PrincipalInvestigator() {
    super();
  }
}
