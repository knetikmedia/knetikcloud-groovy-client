package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.BreTriggerResource
import io.swagger.model.PageResourceBreTriggerResource

import java.util.*;

@Mixin(ApiUtils)
class BRERuleEngineTriggersApi {
    String basePath = "https://integration.knetikcloud.com/"
    String versionPath = "/api/v1"

    def createTriggerUsingPOST ( BreTriggerResource breTriggerResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/bre/triggers"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    BreTriggerResource.class )
                    
    }
    def deleteTriggerUsingDELETE ( String eventName, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/bre/triggers/{event_name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (eventName == null) {
            throw new RuntimeException("missing required params eventName")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getTriggerUsingGET ( String eventName, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/bre/triggers/{event_name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (eventName == null) {
            throw new RuntimeException("missing required params eventName")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    BreTriggerResource.class )
                    
    }
    def getTriggersUsingGET ( Boolean filterSystem, String filterCategory, String filterName, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/bre/triggers"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterSystem)))
            queryParams.put("filterSystem", String.valueOf(filterSystem))
if (!"null".equals(String.valueOf(filterCategory)))
            queryParams.put("filterCategory", String.valueOf(filterCategory))
if (!"null".equals(String.valueOf(filterName)))
            queryParams.put("filterName", String.valueOf(filterName))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceBreTriggerResource.class )
                    
    }
    def updateTriggerUsingPUT ( String eventName, BreTriggerResource breTriggerResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/bre/triggers/{event_name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (eventName == null) {
            throw new RuntimeException("missing required params eventName")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
}
