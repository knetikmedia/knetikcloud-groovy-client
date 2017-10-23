package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SimpleUserResource;
@Canonical
class FlagResource {

  /* The context of that resource */
  String context = null

  /* The context_id of that resource */
  String contextId = null

  /* The date/time this resource was created in seconds since epoch */
  Long createdDate = null

  /* The unique ID for that resource */
  Long id = null

  /* The flag reason of that resource */
  String reason = null

  /* The date/time this resource was last updated in seconds since epoch */
  Long updatedDate = null

  /* The basic user resource */
  SimpleUserResource user = null
  

}

