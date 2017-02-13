package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PageResourceBillingReport

import java.util.*;

@Mixin(ApiUtils)
class ReportingSubscriptionsApi {
    String basePath = "https://integration.knetikcloud.com/"
    String versionPath = "/api/v1"

    def getSubscriptionReports ( Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/reporting/subscription"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceBillingReport.class )
                    
    }
}
