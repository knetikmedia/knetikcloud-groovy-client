package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import java.util.List;
@Canonical
class BillingReport {

    Long created = null

    String id = null

    List<String> lastKnownFailures = new ArrayList<String>()

    Long scheduled = null

    Map<String, Integer> statistics = new HashMap<String, Integer>()
  

}

