package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import java.util.List;
@Canonical
class MapProperty {

  /* A map/object of string to sub-property */
  Map<String, Property> map = new HashMap<String, Property>()
  

}

