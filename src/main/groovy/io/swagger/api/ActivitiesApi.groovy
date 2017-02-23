package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.ActivityOccurrenceCreationFailure
import io.swagger.model.ActivityOccurrenceResource
import io.swagger.model.ActivityOccurrenceResults
import io.swagger.model.ActivityResource
import io.swagger.model.PageResourceBareActivityResource
import io.swagger.model.Result

import java.util.*;

@Mixin(ApiUtils)
class ActivitiesApi {
    String basePath = "https://sandbox.knetikcloud.com/"
    String versionPath = "/api/v1"

    def createActivity ( ActivityResource activityResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/activities"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ActivityResource.class )
                    
    }
    def createActivityOccurrence ( Boolean test, ActivityOccurrenceResource activityOccurrenceResource, Closure onSuccess, Closure onFailure)  {
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
    def deleteActivity ( Long id, Closure onSuccess, Closure onFailure)  {
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
    def getActivities ( Boolean filterTemplate, String filterName, String filterId, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/activities"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterTemplate)))
            queryParams.put("filterTemplate", String.valueOf(filterTemplate))
if (!"null".equals(String.valueOf(filterName)))
            queryParams.put("filterName", String.valueOf(filterName))
if (!"null".equals(String.valueOf(filterId)))
            queryParams.put("filterId", String.valueOf(filterId))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceBareActivityResource.class )
                    
    }
    def getActivity ( Long id, Closure onSuccess, Closure onFailure)  {
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
    def setActivityOccurrenceResults ( Long activityOccurrenceId, ActivityOccurrenceResults activityOccurrenceResults, Closure onSuccess, Closure onFailure)  {
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
    def updateActivity ( Long id, ActivityResource activityResource, Closure onSuccess, Closure onFailure)  {
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
                    ActivityResource.class )
                    
    }
    def updateActivityOccurrence ( Long activityOccurrenceId, String activityCccurrenceStatus, Closure onSuccess, Closure onFailure)  {
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
}
