package edu.tamu.scholars.middleware.graphql.model.person;

import edu.tamu.scholars.middleware.graphql.model.person.SelectedPublicationVenue;

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
    name = "PersonPublication"
)
@JsonInclude(NON_EMPTY)
public class Publication extends AbstractNestedDocument {
  private static final long serialVersionUID = -937429959L;

  private String type;

  private String publisher;

  private SelectedPublicationVenue venue;

  private String date;

  public Publication() {
    super();
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public SelectedPublicationVenue getVenue() {
    return venue;
  }

  public void setVenue(SelectedPublicationVenue venue) {
    this.venue = venue;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }
}