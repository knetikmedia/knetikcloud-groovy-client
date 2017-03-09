package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import java.util.List;
@Canonical
class Artist {

    Map<String, Property> additionalProperties = new HashMap<String, Property>()

    Long born = null

    Integer contributionCount = null

    Long created = null

    Long died = null

    Long id = null

    String longDescription = null

    String name = null

    Integer priority = null

    String propertiesString = null

    String shortDescription = null

    String template = null

    Long updated = null
  

}

