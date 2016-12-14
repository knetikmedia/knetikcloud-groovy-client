package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.ActivityOccurrenceCreationFailure
import io.swagger.model.ActivityOccurrenceResource
import io.swagger.model.ActivityOccurrenceResults
import io.swagger.model.ActivityResource
import io.swagger.model.PageBareActivityResource

import java.util.*;

@Mixin(ApiUtils)
class ActivitiesApi {
    String basePath = "https://devsandbox.knetikcloud.com/"
    String versionPath = "/api/v1"

    def completeActivityOccurrenceUsingPUT ( Long activityOccurrenceId, String activityCccurrenceStatus, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/activity-occurrences/{activity_occurrence_id}/status"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (activityOccurrenceId == null) {
            throw new RuntimeException("missing required params activityOccurrenceId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def createActivityOccurrenceUsingPOST ( Boolean test, ActivityOccurrenceResource activityOccurrenceResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/activity-occurrences"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(test)))
            queryParams.put("test", String.valueOf(test))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ActivityOccurrenceResource.class )
                    
    }
    def createActivityUsingPOST ( ActivityResource activityResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/activities"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ActivityResource.class )
                    
    }
    def deleteActivityUsingDELETE ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/activities/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getActivitiesUsingGET ( Boolean filterTemplate, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/activities"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterTemplate)))
            queryParams.put("filterTemplate", String.valueOf(filterTemplate))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageBareActivityResource.class )
                    
    }
    def getActivityUsingGET ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/activities/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    ActivityResource.class )
                    
    }
    def postResultsUsingPOST ( Long activityOccurrenceId, ActivityOccurrenceResults activityOccurrenceResults, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/activity-occurrences/{activity_occurrence_id}/results"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (activityOccurrenceId == null) {
            throw new RuntimeException("missing required params activityOccurrenceId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ActivityOccurrenceResults.class )
                    
    }
    def updateActivityUsingPUT ( Long id, ActivityResource activityResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/activities/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
}
