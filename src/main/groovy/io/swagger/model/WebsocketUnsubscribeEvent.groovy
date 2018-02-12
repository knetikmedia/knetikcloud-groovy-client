package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BroadcastableEvent;
import io.swagger.model.Topic;
import io.swagger.model.TopicSubscriber;
@Canonical
class WebsocketUnsubscribeEvent {

    Topic topic = null

    TopicSubscriber topicSubscriber = null
  

}

