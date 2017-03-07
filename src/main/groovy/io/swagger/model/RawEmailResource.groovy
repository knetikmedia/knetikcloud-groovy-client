package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class RawEmailResource {

  /* The body of the outgoing message. */
  String body = null

  /* Address to attribute the outgoing message to. Optional if the config email.out_address is set. */
  String from = null

  /* Whether the body is to be treated as html. Default false. */
  Boolean html = null

  /* A list of user ids to send the message to. */
  List<Integer> recipients = new ArrayList<Integer>()

  /* The subject of the outgoing message. */
  String subject = null
  

}

