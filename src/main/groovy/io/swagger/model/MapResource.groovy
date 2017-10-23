package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ExpressionResource;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import java.util.List;
@Canonical
class MapResource {

    String definition = null

    Map<String, ExpressionResource> map = new HashMap<String, ExpressionResource>()

    String type = null
  

}

