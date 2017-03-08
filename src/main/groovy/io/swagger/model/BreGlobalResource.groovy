package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.BreGlobalScopeDefinition;
import java.util.List;
@Canonical
class BreGlobalResource {

  /* A human readable description for display in admin pages */
  String description = null

  /* The id of the global definition. Default is a random guid. Cannot be updated */
  String id = null

  /* The key for the global. Must be unique when combined with scope names. Usually a single descriptive word like 'purchases' or 'logins' */
  String key = null

  /* A human readable name for display in admin pages */
  String name = null

  /* A list of scoping parameters. Allows the global to have a different value in different context such as a count of purchases for each user (by putting a 'user' scope in this list). When using this global in a rule these scopes will need to be mapped with an expression to provide a value, similar to the parameters in an action */
  List<BreGlobalScopeDefinition> scopes = new ArrayList<BreGlobalScopeDefinition>()

  /* Where this global came from. System globals cannot be removed or updated */
  Boolean systemGlobal = null

  /* The variable type the global stores. See the See Bre Variables enpoint for list */
  String type = null
  

}

