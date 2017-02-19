package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import io.swagger.model.TierResource;
import java.util.List;
@Canonical
class LevelingResource {

  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* The date the leveling schema was created */
  Long createdDate = null

  /* The description of the leveling schema */
  String description = null

  /* The name of the leveling schema.  IMMUTABLE */
  String name = null

  /* A set of tiers that contain experience boundaries */
  List<TierResource> tiers = new ArrayList<TierResource>()

  /* The date the leveling schema was updated */
  Long updatedDate = null
  

}

