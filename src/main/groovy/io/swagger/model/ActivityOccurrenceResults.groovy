package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.UserActivityResults;
import java.util.List;
@Canonical
class ActivityOccurrenceResults {

  /* The game results for each user. Include all users that played (paid to get in) even if they were eliminated without a result. A null metric is allowed */
  List<UserActivityResults> users = new ArrayList<UserActivityResults>()
  

}

