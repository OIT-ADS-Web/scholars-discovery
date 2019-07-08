package edu.tamu.scholars.middleware.graphql.model.person;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

import com.fasterxml.jackson.annotation.JsonInclude;
import edu.tamu.scholars.middleware.graphql.model.AbstractNestedDocument;
import io.leangen.graphql.annotations.types.GraphQLType;
import java.lang.String;

/**
 * This file is automatically generated on compile.
 *
 * Do not modify this file -- YOUR CHANGES WILL BE ERASED!
 */
@GraphQLType(
    name = "PersonAwardsAndHonors"
)
@JsonInclude(NON_EMPTY)
public class AwardsAndHonors extends AbstractNestedDocument {
  private static final long serialVersionUID = -349132681L;

  private String date;

  public AwardsAndHonors() {
    super();
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }
}