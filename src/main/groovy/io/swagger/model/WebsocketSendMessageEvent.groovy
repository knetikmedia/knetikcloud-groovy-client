package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.BroadcastableEvent;
import java.util.List;
@Canonical
class WebsocketSendMessageEvent {

    Object content = null

    List<String> usernames = new ArrayList<String>()
  

}

