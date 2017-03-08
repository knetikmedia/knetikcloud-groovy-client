package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Group;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import java.util.List;
@Canonical
class Group {

    Map<String, Property> additionalProperties = new HashMap<String, Property>()

    String description = null

    Integer id = null

    Integer memberCount = null

    String messageOfTheDay = null

    String name = null

    Group parent = null

    String propertiesString = null

    String status = null

    Integer subMemberCount = null

    String template = null

    String uniqueName = null
  

}

