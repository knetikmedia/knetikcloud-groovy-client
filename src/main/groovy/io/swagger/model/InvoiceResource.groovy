package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.InvoiceItemResource;
import io.swagger.model.SimpleUserResource;
import java.util.List;
@Canonical
class InvoiceResource {

  /* Line one of the customer's billing address */
  String billingAddress1 = null

  /* Line two of the customer's billing address */
  String billingAddress2 = null

  /* The city for the customer's billing address */
  String billingCityName = null

  /* The country for the customer's billing address */
  String billingCountryName = null

  /* The customer's name for the billing address */
  String billingFullName = null

  /* The postal code for the customer's billing address */
  String billingPostalCode = null

  /* The state for the customer's billing address */
  String billingStateName = null

  /* The guid of the cart this invoice came from */
  String cartId = null

  /* The date the invoice was created, unix timestamp in seconds */
  Long createdDate = null

  /* The code for the currency invoice prices are in */
  String currency = null

  /* The fulfillment status of the invoice */
  String currentFulfillmentStatus = null

  /* The payment status of the invoice */
  String currentPaymentStatus = null

  /* The amount of money saved through coupons */
  Double discount = null

  /* The customer's email address */
  String email = null

  /* An external reference to filter on */
  String externalRef = null

  /* The amount of federal tax added */
  Double fedTax = null

  /* The final price of the invoice */
  Double grandTotal = null

  /* The id of the invoice */
  Integer id = null

  /* A reference number for the invoice */
  String invoiceNumber = null

  /* A list of items within the invoice */
  List<InvoiceItemResource> items = new ArrayList<InvoiceItemResource>()

  /* The customer's name prefix */
  String namePrefix = null

  /* Notes about the order */
  String orderNotes = null

  /* The id of an invoice this is a child of */
  Integer parentInvoiceId = null

  /* The id of a saved payment method used to pay for the invoice */
  Integer paymentMethodId = null

  /* The customer's phone number */
  String phone = null

  /* The customer's phone number */
  String phoneNumber = null

  /* The shipping cost */
  Double shipping = null

  /* Line one of the customer's shipping address */
  String shippingAddress1 = null

  /* Line two of the customer's shipping address */
  String shippingAddress2 = null

  /* The city for the customer's shipping address */
  String shippingCityName = null

  /* The country for the customer's shipping address */
  String shippingCountryName = null

  /* The customer's name for the shipping address */
  String shippingFullName = null

  /* The postal code for the customer's shipping address */
  String shippingPostalCode = null

  /* The state for the customer's shipping address */
  String shippingStateName = null

  /* A number to use in sorting items. default 500. */
  Integer sort = null

  /* The amount of state tax added */
  Double stateTax = null

  /* The sum price of all items before shipping, coupons and tax */
  Double subtotal = null

  /* The date the invoice was last updated, unix timestamp in seconds */
  Long updatedDate = null

  /* The owner of the invoice */
  SimpleUserResource user = null

  /* The id of the vendor */
  Integer vendorId = null

  /* The name of the invoice */
  String vendorName = null
  

}

