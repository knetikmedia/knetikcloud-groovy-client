package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PageResourceRevenueCountryReportResource
import io.swagger.model.PageResourceRevenueProductReportResource
import io.swagger.model.RevenueReportResource

import java.util.*;

@Mixin(ApiUtils)
class ReportingRevenueApi {
    String basePath = "https://integration.knetikcloud.com/"
    String versionPath = "/api/v1"

    def getItemRevenue ( String currencyCode, Long startDate, Long endDate, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/reporting/revenue/item-sales/{currency_code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (currencyCode == null) {
            throw new RuntimeException("missing required params currencyCode")
        }

        if (!"null".equals(String.valueOf(startDate)))
            queryParams.put("startDate", String.valueOf(startDate))
if (!"null".equals(String.valueOf(endDate)))
            queryParams.put("endDate", String.valueOf(endDate))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    RevenueReportResource.class )
                    
    }
    def getRefundRevenue ( String currencyCode, Long startDate, Long endDate, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/reporting/revenue/refunds/{currency_code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (currencyCode == null) {
            throw new RuntimeException("missing required params currencyCode")
        }

        if (!"null".equals(String.valueOf(startDate)))
            queryParams.put("startDate", String.valueOf(startDate))
if (!"null".equals(String.valueOf(endDate)))
            queryParams.put("endDate", String.valueOf(endDate))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    RevenueReportResource.class )
                    
    }
    def getRevenueByCountry ( String currencyCode, Long startDate, Long endDate, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/reporting/revenue/countries/{currency_code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (currencyCode == null) {
            throw new RuntimeException("missing required params currencyCode")
        }

        if (!"null".equals(String.valueOf(startDate)))
            queryParams.put("startDate", String.valueOf(startDate))
if (!"null".equals(String.valueOf(endDate)))
            queryParams.put("endDate", String.valueOf(endDate))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceRevenueCountryReportResource.class )
                    
    }
    def getRevenueByItem ( String currencyCode, Long startDate, Long endDate, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/reporting/revenue/products/{currency_code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (currencyCode == null) {
            throw new RuntimeException("missing required params currencyCode")
        }

        if (!"null".equals(String.valueOf(startDate)))
            queryParams.put("startDate", String.valueOf(startDate))
if (!"null".equals(String.valueOf(endDate)))
            queryParams.put("endDate", String.valueOf(endDate))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceRevenueProductReportResource.class )
                    
    }
    def getSubscriptionRevenue ( String currencyCode, Long startDate, Long endDate, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/reporting/revenue/subscription-sales/{currency_code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (currencyCode == null) {
            throw new RuntimeException("missing required params currencyCode")
        }

        if (!"null".equals(String.valueOf(startDate)))
            queryParams.put("startDate", String.valueOf(startDate))
if (!"null".equals(String.valueOf(endDate)))
            queryParams.put("endDate", String.valueOf(endDate))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    RevenueReportResource.class )
                    
    }
}
