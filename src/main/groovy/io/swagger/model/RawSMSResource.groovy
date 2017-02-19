package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class RawSMSResource {

  /* The phone number to attribute the outgoing message to. Optional if the config text.out_number is set. */
  String from = null

  /* A list of user ids to send the message to. */
  List<Integer> recipients = new ArrayList<Integer>()

  /* The body of the outgoing text message. */
  String text = null
  

}

