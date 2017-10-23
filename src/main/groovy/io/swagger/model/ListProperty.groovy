package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Property;
import java.util.List;
@Canonical
class ListProperty {

  /* The list of properties */
  List<Property> values = new ArrayList<Property>()
  

}

