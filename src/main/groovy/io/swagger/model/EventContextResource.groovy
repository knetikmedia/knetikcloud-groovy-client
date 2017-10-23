package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ExpressionResource;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import java.util.List;
@Canonical
class EventContextResource {

    String definition = null

    String eventName = null

    Map<String, ExpressionResource> parameters = new HashMap<String, ExpressionResource>()

    String type = null
  

}

