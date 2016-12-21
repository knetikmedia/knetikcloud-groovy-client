package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ActivityEntitlementResource;
@Canonical
class ActivityOccurrenceJoinResult {

  /* The details on the entitlement object needed to enter the occurrence (if any) */
  ActivityEntitlementResource entitlement = null

  /* Zero if the user was/could be added to the occurrence. Jsapi error code indicating the reason of the failure otherwise */
  Integer errorCode = null

  /* An error message if failure */
  String message = null

  /* The user's id */
  Long userId = null
  

}

