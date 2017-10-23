package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class RawPushResource {

  /* A list of user ids to send the message to. */
  List<Integer> recipients = new ArrayList<Integer>()

  /* The body of the outgoing message. */
  String text = null
  

}

