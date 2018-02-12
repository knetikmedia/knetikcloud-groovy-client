package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class ChatMessageRequest {

  /* The content of the message */
  Object content = null

  /* The type of the message set by the client */
  String messageType = null
  

}

