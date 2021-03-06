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
    String basePath = "https://jsapi-integration.us-east-1.elasticbeanstalk.com"
    String versionPath = "/api/v1"

    def addUserLog ( UserActionLog logEntry, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/audit/logs"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def getBREEventLog ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/bre/logs/event-log/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    BreEventLog.class )
                    
    }
    def getBREEventLogs ( String filterStartDate, String filterEventName, String filterEventId, Integer size, Integer page, String order, String filterRuleId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/bre/logs/event-log"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterStartDate)))
            queryParams.put("filter_start_date", String.valueOf(filterStartDate))
if (!"null".equals(String.valueOf(filterEventName)))
            queryParams.put("filter_event_name", String.valueOf(filterEventName))
if (!"null".equals(String.valueOf(filterEventId)))
            queryParams.put("filter_event_id", String.valueOf(filterEventId))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))
if (!"null".equals(String.valueOf(filterRuleId)))
            queryParams.put("filter_rule_id", String.valueOf(filterRuleId))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceBreEventLog.class )
                    
    }
    def getBREForwardLog ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/bre/logs/forward-log/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    ForwardLog.class )
                    
    }
    def getBREForwardLogs ( String filterStartDate, String filterEndDate, Integer filterStatusCode, Integer filterUrl, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/bre/logs/forward-log"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterStartDate)))
            queryParams.put("filter_start_date", String.valueOf(filterStartDate))
if (!"null".equals(String.valueOf(filterEndDate)))
            queryParams.put("filter_end_date", String.valueOf(filterEndDate))
if (!"null".equals(String.valueOf(filterStatusCode)))
            queryParams.put("filter_status_code", String.valueOf(filterStatusCode))
if (!"null".equals(String.valueOf(filterUrl)))
            queryParams.put("filter_url", String.valueOf(filterUrl))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceForwardLog.class )
                    
    }
    def getUserLog ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/audit/logs/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    UserActionLog.class )
                    
    }
    def getUserLogs ( Integer filterUser, String filterActionName, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/audit/logs"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterUser)))
            queryParams.put("filter_user", String.valueOf(filterUser))
if (!"null".equals(String.valueOf(filterActionName)))
            queryParams.put("filter_action_name", String.valueOf(filterActionName))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceUserActionLog.class )
                    
    }
}
