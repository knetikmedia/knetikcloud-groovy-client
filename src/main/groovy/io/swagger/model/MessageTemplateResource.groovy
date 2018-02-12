package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class MessageTemplateResource {

  /* The content of the template. See Apache Velocity documentation for formatting */
  String content = null

  /* The id of the template. Cannot be changed after creation. default: auto generated */
  String id = null

  /* The name of the template */
  String name = null

  /* A list of tags for search purposes. Will be converted to lower case */
  List<String> tags = new ArrayList<String>()
  

}

