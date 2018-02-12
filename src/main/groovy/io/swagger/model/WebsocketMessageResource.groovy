package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class WebsocketMessageResource {

  /* The body of the outgoing message. */
  Object content = null

  /* A message type to inform websocket recipient how to parse content */
  String messageType = null

  /* A list of user ids to send the message to. */
  List<Integer> recipients = new ArrayList<Integer>()
  

}

