package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.AddressResource
import io.swagger.model.InvoiceCreateRequest
import io.swagger.model.InvoicePaymentStatusRequest
import io.swagger.model.InvoiceResource
import io.swagger.model.PageResourceInvoiceLogEntry
import io.swagger.model.PageResourceInvoiceResource
import io.swagger.model.PayBySavedMethodRequest
import io.swagger.model.Result

import java.util.*;

@Mixin(ApiUtils)
class InvoicesApi {
    String basePath = "https://sandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def createInvoice ( InvoiceCreateRequest req, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "array",
                    InvoiceResource.class )
                    
    }
    def getFulFillmentStatuses ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices/fulfillment-statuses"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    String.class )
                    
    }
    def getInvoice ( Integer id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    InvoiceResource.class )
                    
    }
    def getInvoiceLogs ( Integer id, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices/{id}/logs"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceInvoiceLogEntry.class )
                    
    }
    def getInvoices ( Integer filterUser, String filterEmail, String filterFulfillmentStatus, String filterPaymentStatus, String filterItemName, String filterExternalRef, String filterCreatedDate, String filterVendorIds, String filterCurrency, String filterShippingStateName, String filterShippingCountryName, Float filterShipping, String filterVendorName, String filterSku, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterUser)))
            queryParams.put("filterUser", String.valueOf(filterUser))
if (!"null".equals(String.valueOf(filterEmail)))
            queryParams.put("filterEmail", String.valueOf(filterEmail))
if (!"null".equals(String.valueOf(filterFulfillmentStatus)))
            queryParams.put("filterFulfillmentStatus", String.valueOf(filterFulfillmentStatus))
if (!"null".equals(String.valueOf(filterPaymentStatus)))
            queryParams.put("filterPaymentStatus", String.valueOf(filterPaymentStatus))
if (!"null".equals(String.valueOf(filterItemName)))
            queryParams.put("filterItemName", String.valueOf(filterItemName))
if (!"null".equals(String.valueOf(filterExternalRef)))
            queryParams.put("filterExternalRef", String.valueOf(filterExternalRef))
if (!"null".equals(String.valueOf(filterCreatedDate)))
            queryParams.put("filterCreatedDate", String.valueOf(filterCreatedDate))
if (!"null".equals(String.valueOf(filterVendorIds)))
            queryParams.put("filterVendorIds", String.valueOf(filterVendorIds))
if (!"null".equals(String.valueOf(filterCurrency)))
            queryParams.put("filterCurrency", String.valueOf(filterCurrency))
if (!"null".equals(String.valueOf(filterShippingStateName)))
            queryParams.put("filterShippingStateName", String.valueOf(filterShippingStateName))
if (!"null".equals(String.valueOf(filterShippingCountryName)))
            queryParams.put("filterShippingCountryName", String.valueOf(filterShippingCountryName))
if (!"null".equals(String.valueOf(filterShipping)))
            queryParams.put("filterShipping", String.valueOf(filterShipping))
if (!"null".equals(String.valueOf(filterVendorName)))
            queryParams.put("filterVendorName", String.valueOf(filterVendorName))
if (!"null".equals(String.valueOf(filterSku)))
            queryParams.put("filterSku", String.valueOf(filterSku))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceInvoiceResource.class )
                    
    }
    def getPaymentStatuses ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices/payment-statuses"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    String.class )
                    
    }
    def payInvoice ( Integer id, PayBySavedMethodRequest request, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices/{id}/payments"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def setExternalRef ( Integer id, String externalRef, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices/{id}/external-ref"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def setInvoiceItemFulfillmentStatus ( Integer id, String sku, String status, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices/{id}/items/{sku}/fulfillment-status"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }
        // verify required params are set
        if (sku == null) {
            throw new RuntimeException("missing required params sku")
        }
        // verify required params are set
        if (status == null) {
            throw new RuntimeException("missing required params status")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def setOrderNotes ( Integer id, String orderNotes, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices/{id}/order-notes"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def setPaymentStatus ( Integer id, InvoicePaymentStatusRequest request, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices/{id}/payment-status"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def updateBillingInfo ( Integer id, AddressResource billingInfoRequest, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices/{id}/billing-address"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
}
