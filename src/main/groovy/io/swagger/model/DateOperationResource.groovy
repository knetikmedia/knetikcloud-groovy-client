package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.ExpressionResource;
import io.swagger.model.OperationDefinitionResource;
import java.util.List;
@Canonical
class DateOperationResource {

  /* The arguments the operator apply to. See notes for details. */
  List<ExpressionResource> args = new ArrayList<ExpressionResource>()

    String definition = null

  /* The operator to be used in this predicate. See notes for details. */
  String op = null

    String returnType = null

  /* The operators supported by this expression */
  List<OperationDefinitionResource> supportedOperators = new ArrayList<OperationDefinitionResource>()

    String type = null
  

}

