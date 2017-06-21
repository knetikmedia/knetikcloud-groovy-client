package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.ExpressionResource;
import java.util.List;
@Canonical
class PredicateResource {

  /* The arguments the operator apply to. See notes for details. */
  List<ExpressionResource> args = new ArrayList<ExpressionResource>()

  /* The operator to be used in this predicate. See notes for details. */
  String op = null

    String type = null
  

}

