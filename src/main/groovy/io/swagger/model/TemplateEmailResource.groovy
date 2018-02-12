package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.KeyValuePairstringstring;
import java.util.List;
@Canonical
class TemplateEmailResource {

  /* Address to attribute the outgoing message to. Optional if the config email.out_address is set. */
  String from = null

  /* A list of user ids to send the message to. */
  List<Integer> recipients = new ArrayList<Integer>()

  /* The subject for email */
  String subject = null

  /* The key for the template */
  String templateKey = null

  /* A list of variables to fill in the template */
  List<KeyValuePairstringstring> templateVars = new ArrayList<KeyValuePairstringstring>()
  

}

