package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class TokenDetailsResource {

    String clientId = null

    List<String> roles = new ArrayList<String>()

    Integer userId = null
  

}

