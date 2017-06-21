package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class LimitedGettableGroup {

  /* Whether to get active items only */
  Boolean activeOnly = null

  /* The name of the group. Multiple items with the same group name will be limited together, leave null to be assigned a random unique name. It is typical that owned_limit and active_only will be the same for all, but this is not enforced and the item being recieved will use its settings. */
  String name = null

  /* The max number of items that can be purchased */
  Integer ownedLimit = null
  

}

