package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import java.util.List;
@Canonical
class AchievementDefinitionResource {

  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this resource type */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* The date/time this resource was created in seconds since unix epoch */
  Long createdDate = null

  /* The description of the achievement. Must be at least 2 characters in length. */
  String description = null

  /* Whether the achievement is hidden from the user */
  Boolean hidden = null

  /* The maximum value for the achievement definition. Must be greater than or equal to min_value. */
  Integer maxValue = null

  /* The minimum value for the achievement definition. Must be greater than zero. */
  Integer minValue = null

  /* The name of the achievement. Must be at least 6 characters in length. IMMUTABLE */
  String name = null

  /* The id of the rule generated for this achievement */
  String ruleId = null

  /* The tags for the achievement definition */
  List<String> tags = new ArrayList<String>()

  /* An achievement template this achievement is validated against (private). May be null and no validation of additional_properties will be done */
  String template = null

  /* The name of the trigger event associated with this achievement */
  String triggerEventName = null

  /* The date/time this resource was last updated in seconds since unix epoch */
  Long updatedDate = null
  

}

