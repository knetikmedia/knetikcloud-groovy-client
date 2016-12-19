package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class VendorResource {

  /* Whether the vendor is active.  Default = true */
  Boolean active = null

  /* The date the vendor was added. Unix timestamp in seconds */
  Long createDate = null

  /* A description of the vendor */
  String description = null

  /* The id of the vendor */
  Integer id = null

  /* The url of an image for the vendor */
  String imageUrl = null

  /* Whether the vendor needs to manually approve invoices before they are paid.  A separate checkout flow is required in this case.  Default: false */
  Boolean manualApproval = null

  /* The name of the vendor */
  String name = null

  /* The primary email address for the vendor */
  String primaryContactEmail = null

  /* The name of the primary contact for the vendor */
  String primaryContactName = null

  /* The primary phone number for the vendor */
  String primaryContactPhone = null

  /* The email address for sale inquiries for the vendor */
  String salesEmail = null

  /* The email address for support inquiries for the vendor */
  String supportEmail = null

  /* The date the vendor was last updated. Unix timestamp in seconds */
  Long updateDate = null

  /* The url for the vendor's site */
  String url = null
  

}

