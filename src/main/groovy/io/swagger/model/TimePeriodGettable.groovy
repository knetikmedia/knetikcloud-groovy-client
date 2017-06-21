package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Behavior;
@Canonical
class TimePeriodGettable {

  /* The time period limit */
  Integer getLimit = null

  /* The name of a group of items. Multiple items with the same group name will be limited together, leave null to be assigned a random unique name. It is typical that the other properties here will be the same for all, but this is not enforced and the item being recieved will use its settings. */
  String groupName = null

  /* The length of time */
  Integer timeLength = null

  /* The unit of time */
  String unitOfTime = null
  

}

