package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.BreRuleLog;
import java.util.List;
@Canonical
class BreEventLog {

  /* The customer of the BRE event log */
  String customer = null

  /* The event id of the BRE event log */
  String eventId = null

  /* The event name of the BRE event log */
  String eventName = null

  /* The event start date of the BRE event log */
  Long eventStartDate = null

  /* The id of the BRE event log */
  String id = null

  /* The event paramters of the BRE event log */
  Object parameters = null

  /* The rules of the BRE event log */
  List<BreRuleLog> rules = new ArrayList<BreRuleLog>()
  

}

