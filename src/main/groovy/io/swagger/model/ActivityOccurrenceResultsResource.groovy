package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.UserActivityResultsResource;
import java.util.List;
@Canonical
class ActivityOccurrenceResultsResource {

  /* The game results for each user. Include all users that played (paid to get in) even if they were eliminated without a result. A null metric is allowed */
  List<UserActivityResultsResource> users = new ArrayList<UserActivityResultsResource>()
  

}

