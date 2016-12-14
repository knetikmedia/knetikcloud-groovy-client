package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.ContributionResource;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import java.util.List;
@Canonical
class ArtistResource {

  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* YYYY/MM/DD when this artist was born */
  String born = null

  /* The current number of contributions the artist has made */
  Integer contributionCount = null

  /* The list of media this artist has contributed to as well as role(s) during contribution.  Use media endpoint to add contributions */
  List<ContributionResource> contributions = new ArrayList<ContributionResource>()

  /* The date/time this resource was created in seconds since unix epoch */
  Long createdDate = null

  /* YYYY/MM/DD when this artist died */
  String died = null

  /* The unique ID for that resource */
  Long id = null

  /* The user friendly name of that resource. Defaults to blank string */
  String longDescription = null

  /* The user friendly name of that resource */
  String name = null

  /* The sort order priority ofr the artist.  Default 100 */
  Integer priority = null

  /* The user friendly name of that resource. Defaults to blank string */
  String shortDescription = null

  /* An artist template this artist is validated against (private). May be null and no validation of additional_properties will be done */
  String template = null

  /* The date/time this resource was last updated in seconds since unix epoch */
  Long updatedDate = null
  

}

