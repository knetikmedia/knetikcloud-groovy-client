package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class InvoiceLogEntry {

  /* The date this event occured as a unix timestamp in seconds */
  Long date = null

  /* The ID of the invoice */
  Integer invoiceId = null

  /* A message describing the event */
  String message = null

  /* The type of event */
  String type = null
  

}

