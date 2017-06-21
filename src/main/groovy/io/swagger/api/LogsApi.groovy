package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.BreEventLog
import io.swagger.model.ForwardLog
import io.swagger.model.PageResourceBreEventLog
import io.swagger.model.PageResourceForwardLog
import io.swagger.model.PageResourceUserActionLog
import io.swagger.model.Result
import io.swagger.model.UserActionLog

import java.util.*;

@Mixin(ApiUtils)
class LogsApi {
    String basePath = "https://sandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def addUserLog ( UserActionLog logEntry, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/audit/logs"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def getBREEventLog ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/bre/logs/event-log/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    BreEventLog.class )
                    
    }
    def getBREEventLogs ( String filterStartDate, String filterEventName, String filterEventId, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/bre/logs/event-log"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterStartDate)))
            queryParams.put("filterStartDate", String.valueOf(filterStartDate))
if (!"null".equals(String.valueOf(filterEventName)))
            queryParams.put("filterEventName", String.valueOf(filterEventName))
if (!"null".equals(String.valueOf(filterEventId)))
            queryParams.put("filterEventId", String.valueOf(filterEventId))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceBreEventLog.class )
                    
    }
    def getBREForwardLog ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/bre/logs/forward-log/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    ForwardLog.class )
                    
    }
    def getBREForwardLogs ( String filterStartDate, String filterEndDate, Integer filterStatusCode, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/bre/logs/forward-log"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterStartDate)))
            queryParams.put("filterStartDate", String.valueOf(filterStartDate))
if (!"null".equals(String.valueOf(filterEndDate)))
            queryParams.put("filterEndDate", String.valueOf(filterEndDate))
if (!"null".equals(String.valueOf(filterStatusCode)))
            queryParams.put("filterStatusCode", String.valueOf(filterStatusCode))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceForwardLog.class )
                    
    }
    def getUserLog ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/audit/logs/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    UserActionLog.class )
                    
    }
    def getUserLogs ( Integer filterUser, String filterActionName, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/audit/logs"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterUser)))
            queryParams.put("filterUser", String.valueOf(filterUser))
if (!"null".equals(String.valueOf(filterActionName)))
            queryParams.put("filterActionName", String.valueOf(filterActionName))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceUserActionLog.class )
                    
    }
}
