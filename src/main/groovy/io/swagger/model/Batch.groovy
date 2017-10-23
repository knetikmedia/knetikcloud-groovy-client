package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.BatchRequest;
import java.util.List;
@Canonical
class Batch {

  /* The list of batch requests */
  List<BatchRequest> batch = new ArrayList<BatchRequest>()

  /* The amount of time before a request token is returned instead of the batch result.  Default is 60.  Range is 0-300 */
  Integer timeout = null
  

}

