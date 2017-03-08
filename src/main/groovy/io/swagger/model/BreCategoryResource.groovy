package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import java.util.List;
@Canonical
class BreCategoryResource {

  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* The name of the category. Serves as the unique id */
  String name = null

  /* A template this BRE category is validated against (private). May be null and no validation of additional_properties will be done */
  String template = null
  

}

