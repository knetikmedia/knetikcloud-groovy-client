package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ActionResource;
import io.swagger.model.PredicateOperation;
@Canonical
class BreRule {

  /* A list of actions to execute, and the mapping for their parameters, when the rule runs. Minimum 1 */
  ActionResource actions = null

  /* A condition expression that must be met in a given event for the rule to run. Empty to always run */
  PredicateOperation condition = null

  /* The condition as a readable string. Filled in by the system from the condition */
  String conditionText = null

  /* The human readable description of the rule */
  String description = null

  /* Whether the rule is enabled to run (in conjunction with dates). Default true */
  Boolean enabled = null

  /* The date the rule ceases to take effect, or null if never. Unix timestamp in seconds */
  Long endDate = null

  /* The event name of the trigger this rule runs for. Affects which parameters are available */
  String eventName = null

  /* The id of the rule for later references. If left null a random guid will be generated. Must be unique. Cannot be changed */
  String id = null

  /* The human readable name of the rule */
  String name = null

  /* Used to sort rules to control the order they run in. Larger numbered sort values run first.  Default 500 */
  Integer sort = null

  /* The date the rule begins to take effect, or null if always. Unix timestamp in seconds */
  Long startDate = null

  /* Whether the rule is a default part of the system. System rules cannot be edited or deleted, but may be disabled */
  Boolean systemRule = null
  

}

