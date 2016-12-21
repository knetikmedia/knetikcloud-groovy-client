package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PageResourceAggregateCountResource

import java.util.*;

@Mixin(ApiUtils)
class ReportingUsersApi {
    String basePath = "https://localhost:8080/"
    String versionPath = "/api/v1"

    def executiveRevenueItemSalesUsingGET1 ( String granularity, Long startDate, Long endDate, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/reporting/users/registrations"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(granularity)))
            queryParams.put("granularity", String.valueOf(granularity))
if (!"null".equals(String.valueOf(startDate)))
            queryParams.put("startDate", String.valueOf(startDate))
if (!"null".equals(String.valueOf(endDate)))
            queryParams.put("endDate", String.valueOf(endDate))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceAggregateCountResource.class )
                    
    }
}
