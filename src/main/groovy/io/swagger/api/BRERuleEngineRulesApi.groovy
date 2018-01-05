package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.BooleanResource
import io.swagger.model.BreRule
import io.swagger.model.Expressionobject
import io.swagger.model.PageResourceBreRule
import io.swagger.model.Result

import java.util.*;

@Mixin(ApiUtils)
class BRERuleEngineRulesApi {
    String basePath = "https://devsandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def createBRERule ( BreRule breRule, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/bre/rules"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    BreRule.class )
                    
    }
    def deleteBRERule ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/bre/rules/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getBREExpressionAsString ( Expressionobject expression, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/bre/rules/expression-as-string"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )
                    
    }
    def getBRERule ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/bre/rules/{id}"

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
                    BreRule.class )
                    
    }
    def getBRERules ( String filterName, Boolean filterEnabled, Boolean filterSystem, String filterTrigger, String filterAction, String filterCondition, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/bre/rules"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterName)))
            queryParams.put("filter_name", String.valueOf(filterName))
if (!"null".equals(String.valueOf(filterEnabled)))
            queryParams.put("filter_enabled", String.valueOf(filterEnabled))
if (!"null".equals(String.valueOf(filterSystem)))
            queryParams.put("filter_system", String.valueOf(filterSystem))
if (!"null".equals(String.valueOf(filterTrigger)))
            queryParams.put("filter_trigger", String.valueOf(filterTrigger))
if (!"null".equals(String.valueOf(filterAction)))
            queryParams.put("filter_action", String.valueOf(filterAction))
if (!"null".equals(String.valueOf(filterCondition)))
            queryParams.put("filter_condition", String.valueOf(filterCondition))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceBreRule.class )
                    
    }
    def setBRERule ( String id, BooleanResource enabled, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/bre/rules/{id}/enabled"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def updateBRERule ( String id, BreRule breRule, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/bre/rules/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    BreRule.class )
                    
    }
}
