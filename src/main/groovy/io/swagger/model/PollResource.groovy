package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.NestedCategory;
import io.swagger.model.PollAnswerResource;
import io.swagger.model.Property;
import java.util.List;
@Canonical
class PollResource {

  /* Whether the poll is active */
  Boolean active = null

  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* The answers to the poll */
  List<PollAnswerResource> answers = new ArrayList<PollAnswerResource>()

  /* The category for the poll */
  NestedCategory category = null

  /* The date/time this resource was created in seconds since unix epoch */
  Long createdDate = null

  /* The id of the poll */
  String id = null

  /* The tags for the poll */
  List<String> tags = new ArrayList<String>()

  /* A poll template this poll is validated against (private). May be null and no validation of additional_properties will be done */
  String template = null

  /* The text of the poll */
  String text = null

  /* The media type of the poll */
  String type = null

  /* The date/time this resource was last updated in seconds since unix epoch */
  Long updatedDate = null
  

}

