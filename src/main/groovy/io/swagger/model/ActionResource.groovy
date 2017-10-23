package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ActionVariableResource;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class ActionResource {

  /* The category the action is in. All customer specific actions are in the 'custom' category */
  String category = null

  /* The description of the action */
  String description = null

  /* The name of the action. Used as the unique id for reference */
  String name = null

  /* A list of tags for searching */
  List<String> tags = new ArrayList<String>()

  /* The variables required for the action */
  List<ActionVariableResource> variables = new ArrayList<ActionVariableResource>()
  

}

