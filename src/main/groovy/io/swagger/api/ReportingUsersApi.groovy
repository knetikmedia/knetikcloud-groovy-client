package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PageResourceAggregateCountResource
import io.swagger.model.Result

import java.util.*;

@Mixin(ApiUtils)
class ReportingUsersApi {
    String basePath = "https://sandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def getUserRegistrations ( String granularity, Long startDate, Long endDate, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/reporting/users/registrations"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(granularity)))
            queryParams.put("granularity", String.valueOf(granularity))
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
                    PageResourceAggregateCountResource.class )
                    
    }
}
