package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.ExpressionResource;
import java.util.List;
@Canonical
class StringOperationResource {

    List<ExpressionResource> args = new ArrayList<ExpressionResource>()

    String op = null

    String type = null
  

}

