package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import java.util.List;
@Canonical
class UserActionLog {

  /* A description of the action taken */
  String actionDescription = null

  /* The name of the action taken */
  String actionName = null

  /* The date of the action, unix timestamp in seconds */
  Long createdDate = null

  /* A map of additional details such as the target of the action */
  Map<String, String> details = new HashMap<String, String>()

  /* The id of the log entry */
  String id = null

  /* The id of the api request that spawned the action, if generated internally */
  String requestId = null

  /* The id of the user that took the action, if any. Read-only if not posting with LOGS_ADMIN */
  Integer userId = null
  

}

