package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PageResourceAggregateInvoiceReportResource
import io.swagger.model.Result

import java.util.*;

@Mixin(ApiUtils)
class ReportingOrdersApi {
    String basePath = "https://sandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def getInvoiceReports ( String currencyCode, String granularity, String filterPaymentStatus, String filterFulfillmentStatus, Long startDate, Long endDate, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/reporting/orders/count/{currency_code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (currencyCode == null) {
            throw new RuntimeException("missing required params currencyCode")
        }

        if (!"null".equals(String.valueOf(granularity)))
            queryParams.put("granularity", String.valueOf(granularity))
if (!"null".equals(String.valueOf(filterPaymentStatus)))
            queryParams.put("filter_payment_status", String.valueOf(filterPaymentStatus))
if (!"null".equals(String.valueOf(filterFulfillmentStatus)))
            queryParams.put("filter_fulfillment_status", String.valueOf(filterFulfillmentStatus))
if (!"null".equals(String.valueOf(startDate)))
            queryParams.put("start_date", String.valueOf(startDate))
if (!"null".equals(String.valueOf(endDate)))
            queryParams.put("end_date", String.valueOf(endDate))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceAggregateInvoiceReportResource.class )
                    
    }
}
