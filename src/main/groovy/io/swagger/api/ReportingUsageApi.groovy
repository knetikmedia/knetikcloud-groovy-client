package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PageResourceUsageInfo
import io.swagger.model.Result

import java.util.*;

@Mixin(ApiUtils)
class ReportingUsageApi {
    String basePath = "https://jsapi-integration.us-east-1.elasticbeanstalk.com"
    String versionPath = "/api/v1"

    def getUsageByDay ( Long startDate, Long endDate, Boolean combineEndpoints, String method, String url, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
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
            queryParams.put("start_date", String.valueOf(startDate))
if (!"null".equals(String.valueOf(endDate)))
            queryParams.put("end_date", String.valueOf(endDate))
if (!"null".equals(String.valueOf(combineEndpoints)))
            queryParams.put("combine_endpoints", String.valueOf(combineEndpoints))
if (!"null".equals(String.valueOf(method)))
            queryParams.put("method", String.valueOf(method))
if (!"null".equals(String.valueOf(url)))
            queryParams.put("url", String.valueOf(url))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceUsageInfo.class )
                    
    }
    def getUsageByHour ( Long startDate, Long endDate, Boolean combineEndpoints, String method, String url, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
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
            queryParams.put("start_date", String.valueOf(startDate))
if (!"null".equals(String.valueOf(endDate)))
            queryParams.put("end_date", String.valueOf(endDate))
if (!"null".equals(String.valueOf(combineEndpoints)))
            queryParams.put("combine_endpoints", String.valueOf(combineEndpoints))
if (!"null".equals(String.valueOf(method)))
            queryParams.put("method", String.valueOf(method))
if (!"null".equals(String.valueOf(url)))
            queryParams.put("url", String.valueOf(url))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceUsageInfo.class )
                    
    }
    def getUsageByMinute ( Long startDate, Long endDate, Boolean combineEndpoints, String method, String url, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
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
            queryParams.put("start_date", String.valueOf(startDate))
if (!"null".equals(String.valueOf(endDate)))
            queryParams.put("end_date", String.valueOf(endDate))
if (!"null".equals(String.valueOf(combineEndpoints)))
            queryParams.put("combine_endpoints", String.valueOf(combineEndpoints))
if (!"null".equals(String.valueOf(method)))
            queryParams.put("method", String.valueOf(method))
if (!"null".equals(String.valueOf(url)))
            queryParams.put("url", String.valueOf(url))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceUsageInfo.class )
                    
    }
    def getUsageByMonth ( Long startDate, Long endDate, Boolean combineEndpoints, String method, String url, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
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
            queryParams.put("start_date", String.valueOf(startDate))
if (!"null".equals(String.valueOf(endDate)))
            queryParams.put("end_date", String.valueOf(endDate))
if (!"null".equals(String.valueOf(combineEndpoints)))
            queryParams.put("combine_endpoints", String.valueOf(combineEndpoints))
if (!"null".equals(String.valueOf(method)))
            queryParams.put("method", String.valueOf(method))
if (!"null".equals(String.valueOf(url)))
            queryParams.put("url", String.valueOf(url))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceUsageInfo.class )
                    
    }
    def getUsageByYear ( Long startDate, Long endDate, Boolean combineEndpoints, String method, String url, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
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
            queryParams.put("start_date", String.valueOf(startDate))
if (!"null".equals(String.valueOf(endDate)))
            queryParams.put("end_date", String.valueOf(endDate))
if (!"null".equals(String.valueOf(combineEndpoints)))
            queryParams.put("combine_endpoints", String.valueOf(combineEndpoints))
if (!"null".equals(String.valueOf(method)))
            queryParams.put("method", String.valueOf(method))
if (!"null".equals(String.valueOf(url)))
            queryParams.put("url", String.valueOf(url))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceUsageInfo.class )
                    
    }
    def getUsageEndpoints ( Long startDate, Long endDate, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/reporting/usage/endpoints"

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
            queryParams.put("start_date", String.valueOf(startDate))
if (!"null".equals(String.valueOf(endDate)))
            queryParams.put("end_date", String.valueOf(endDate))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    String.class )
                    
    }
}
