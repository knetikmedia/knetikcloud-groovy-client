package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.BreActionLog;
import java.util.List;
@Canonical
class BreRuleLog {

  /* The actions of the BRE rule */
  List<BreActionLog> actions = new ArrayList<BreActionLog>()

  /* Whether the rule ran */
  Boolean ran = null

  /* The reason for the rule */
  String reason = null

  /* The end date of the rule in seconds */
  Long ruleEndDate = null

  /* The id of the rule */
  String ruleId = null

  /* The name of the rule */
  String ruleName = null

  /* The start date of the rule in seconds */
  Long ruleStartDate = null
  

}

