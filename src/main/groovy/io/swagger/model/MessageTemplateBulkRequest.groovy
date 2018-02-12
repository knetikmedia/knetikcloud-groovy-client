package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class MessageTemplateBulkRequest {

  /* The data to fill the templates with */
  Object data = null

  /* A list of message template ids */
  List<String> ids = new ArrayList<String>()
  

}

