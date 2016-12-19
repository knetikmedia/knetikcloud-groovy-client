package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Localizer;
import java.util.List;
@Canonical
class TemplateSMSResource {

  /* The phone number to attribute the outgoing message to. Optional if the config text.out_number is set. */
  String from = null

    Localizer localizer = null

  /* A list of user ids to send the message to. */
  List<Integer> recipients = new ArrayList<Integer>()

  /* The key for the template. */
  String templateKey = null

  /* A list of values to fill in the template. Order matters. */
  List<String> templateVars = new ArrayList<String>()
  

}

