package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class BroadcastableEvent {

    String client = null

    String customer = null

    Boolean doNotBroadcast = null

    String section = null

    Object source = null

    String specifics = null

    Boolean synchronous = null

    Long timestamp = null

  /* The type of the event. Used for polymorphic type recognition and thus must match an expected type */
  String type = null
  

}

