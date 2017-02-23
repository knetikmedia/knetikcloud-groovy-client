package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import java.util.List;
@Canonical
class CategoryResource {

  /* Whether the category is currently active. If not, it and its questions will be filtered out. */
  Boolean active = null

  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* The unique ID for this category */
  String id = null

  /* The name of this category. Cannot be blank */
  String name = null

  /* A category template this category is validated against (private). May be null and no validation of additional_properties will be done */
  String template = null
  

}

