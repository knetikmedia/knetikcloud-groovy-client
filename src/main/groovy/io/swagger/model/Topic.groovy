package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class Topic {

    Long createdDate = null

    String displayName = null

    String id = null

    Boolean locked = null

    List<String> tags = new ArrayList<String>()

    Object topicMap = null

    Long updatedDate = null

    Integer userCount = null
  

}

