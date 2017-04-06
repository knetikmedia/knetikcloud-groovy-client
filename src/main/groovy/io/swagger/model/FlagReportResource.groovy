package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class FlagReportResource {

  /* The context of that resource  */
  String context = null

  /* The context ID of that resource */
  String contextId = null

  /* The date/time this resource was created in seconds since epoch */
  Long createdDate = null

  /* The unique ID for that resource */
  Long id = null

  /* The reason of that resource required only in case of active resolution */
  String reason = null

  /* The resolution of that resource */
  String resolution = null

  /* The date/time this report was resolved in seconds since epoch. Null if not resolved yet */
  Long resolved = null

  /* The date/time this resource was last updated in seconds since epoch */
  Long updatedDate = null
  

}

