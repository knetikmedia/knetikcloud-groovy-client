package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Behavior;
import java.util.List;
@Canonical
class PreReqEntitlement {

  /* The item ids that must already be in the user's inventory */
  List<Integer> itemIds = new ArrayList<Integer>()
  

}

