package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.BreTriggerResource
import io.swagger.model.PageResourceBreTriggerResource
import io.swagger.model.Result

import java.util.*;

@Mixin(ApiUtils)
class BRERuleEngineTriggersApi {
    String basePath = "https://devsandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def createBRETrigger ( BreTriggerResource breTriggerResource, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/bre/triggers"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    BreTriggerResource.class )
                    
    }
    def deleteBRETrigger ( String eventName, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/bre/triggers/{event_name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (eventName == null) {
            throw new RuntimeException("missing required params eventName")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getBRETrigger ( String eventName, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/bre/triggers/{event_name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (eventName == null) {
            throw new RuntimeException("missing required params eventName")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    BreTriggerResource.class )
                    
    }
    def getBRETriggers ( Boolean filterSystem, String filterCategory, String filterTags, String filterName, String filterSearch, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/bre/triggers"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterSystem)))
            queryParams.put("filter_system", String.valueOf(filterSystem))
if (!"null".equals(String.valueOf(filterCategory)))
            queryParams.put("filter_category", String.valueOf(filterCategory))
if (!"null".equals(String.valueOf(filterTags)))
            queryParams.put("filter_tags", String.valueOf(filterTags))
if (!"null".equals(String.valueOf(filterName)))
            queryParams.put("filter_name", String.valueOf(filterName))
if (!"null".equals(String.valueOf(filterSearch)))
            queryParams.put("filter_search", String.valueOf(filterSearch))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceBreTriggerResource.class )
                    
    }
    def updateBRETrigger ( String eventName, BreTriggerResource breTriggerResource, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/bre/triggers/{event_name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (eventName == null) {
            throw new RuntimeException("missing required params eventName")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    BreTriggerResource.class )
                    
    }
}
