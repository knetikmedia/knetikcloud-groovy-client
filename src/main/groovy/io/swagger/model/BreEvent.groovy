package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class BreEvent {

  /* The event name of the trigger to be fired */
  String eventName = null

  /* The parameters to the event. A Map (assosiative array) with a key for each trigger parameter name and a corrosponding value. */
  Object params = null
  

}

