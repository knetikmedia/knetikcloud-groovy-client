package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class TemplatedEmail {

  /* The external template ID used by the email provider */
  String externalTemplateId = null

  /* The map of data used by the template */
  Object templateData = null
  

}

