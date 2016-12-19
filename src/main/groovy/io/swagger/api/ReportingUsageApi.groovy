package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PageUsageInfo

import java.util.*;

@Mixin(ApiUtils)
class ReportingUsageApi {
    String basePath = "https://localhost:8080/"
    String versionPath = "/api/v1"

    def getUsageByDayUsingGET ( Long startDate, Long endDate, Boolean combineEndpoints, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/reporting/usage/day"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (startDate == null) {
            throw new RuntimeException("missing required params startDate")
        }
        // verify required params are set
        if (endDate == null) {
            throw new RuntimeException("missing required params endDate")
        }

        if (!"null".equals(String.valueOf(startDate)))
            queryParams.put("startDate", String.valueOf(startDate))
if (!"null".equals(String.valueOf(endDate)))
            queryParams.put("endDate", String.valueOf(endDate))
if (!"null".equals(String.valueOf(combineEndpoints)))
            queryParams.put("combineEndpoints", String.valueOf(combineEndpoints))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageUsageInfo.class )
                    
    }
    def getUsageByHourUsingGET ( Long startDate, Long endDate, Boolean combineEndpoints, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/reporting/usage/hour"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (startDate == null) {
            throw new RuntimeException("missing required params startDate")
        }
        // verify required params are set
        if (endDate == null) {
            throw new RuntimeException("missing required params endDate")
        }

        if (!"null".equals(String.valueOf(startDate)))
            queryParams.put("startDate", String.valueOf(startDate))
if (!"null".equals(String.valueOf(endDate)))
            queryParams.put("endDate", String.valueOf(endDate))
if (!"null".equals(String.valueOf(combineEndpoints)))
            queryParams.put("combineEndpoints", String.valueOf(combineEndpoints))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageUsageInfo.class )
                    
    }
    def getUsageByMinuteUsingGET ( Long startDate, Long endDate, Boolean combineEndpoints, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/reporting/usage/minute"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (startDate == null) {
            throw new RuntimeException("missing required params startDate")
        }
        // verify required params are set
        if (endDate == null) {
            throw new RuntimeException("missing required params endDate")
        }

        if (!"null".equals(String.valueOf(startDate)))
            queryParams.put("startDate", String.valueOf(startDate))
if (!"null".equals(String.valueOf(endDate)))
            queryParams.put("endDate", String.valueOf(endDate))
if (!"null".equals(String.valueOf(combineEndpoints)))
            queryParams.put("combineEndpoints", String.valueOf(combineEndpoints))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageUsageInfo.class )
                    
    }
    def getUsageByMonthUsingGET ( Long startDate, Long endDate, Boolean combineEndpoints, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/reporting/usage/month"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (startDate == null) {
            throw new RuntimeException("missing required params startDate")
        }
        // verify required params are set
        if (endDate == null) {
            throw new RuntimeException("missing required params endDate")
        }

        if (!"null".equals(String.valueOf(startDate)))
            queryParams.put("startDate", String.valueOf(startDate))
if (!"null".equals(String.valueOf(endDate)))
            queryParams.put("endDate", String.valueOf(endDate))
if (!"null".equals(String.valueOf(combineEndpoints)))
            queryParams.put("combineEndpoints", String.valueOf(combineEndpoints))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageUsageInfo.class )
                    
    }
    def getUsageByYearUsingGET ( Long startDate, Long endDate, Boolean combineEndpoints, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/reporting/usage/year"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (startDate == null) {
            throw new RuntimeException("missing required params startDate")
        }
        // verify required params are set
        if (endDate == null) {
            throw new RuntimeException("missing required params endDate")
        }

        if (!"null".equals(String.valueOf(startDate)))
            queryParams.put("startDate", String.valueOf(startDate))
if (!"null".equals(String.valueOf(endDate)))
            queryParams.put("endDate", String.valueOf(endDate))
if (!"null".equals(String.valueOf(combineEndpoints)))
            queryParams.put("combineEndpoints", String.valueOf(combineEndpoints))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageUsageInfo.class )
                    
    }
}
