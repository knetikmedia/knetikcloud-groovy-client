package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import java.util.List;
@Canonical
class TierResource {

  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* The name of the tier */
  String name = null

  /* The required progress for the tier */
  Integer requiredProgress = null

  /* The name of the triggered event */
  String triggerEventName = null
  

}

