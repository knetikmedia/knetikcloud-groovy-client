package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArgumentResource;
import io.swagger.model.ArrayList;
import io.swagger.model.Operator;
import java.util.List;
@Canonical
class OperationDefinitionResource {

    List<ArgumentResource> arguments = new ArrayList<ArgumentResource>()

    String description = null

    Operator operator = null

    String returnType = null

    String template = null
  

}

