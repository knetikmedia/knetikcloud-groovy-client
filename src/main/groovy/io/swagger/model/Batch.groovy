package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.BatchRequest;
import java.util.List;
@Canonical
class Batch {

    List<BatchRequest> batch = new ArrayList<BatchRequest>()
  

}

