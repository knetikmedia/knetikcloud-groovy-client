package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.AOccurrenceOfAnActivityTheActualGameForExampleUsedToTrackScoresParticipantsAndProvideSettings
import io.swagger.model.ActivityOccurrenceCreationFailure
import io.swagger.model.ActivityOccurrenceResults
import io.swagger.model.PageResourceBareActivityResource
import io.swagger.model.PageResourceTemplateResource
import io.swagger.model.RepresentsAnActivityThatCanBeParameterizedAndTrackedThroughMetricsScoresEtc
import io.swagger.model.Result
import io.swagger.model.TemplateResource

import java.util.*;

@Mixin(ApiUtils)
class ActivitiesApi {
    String basePath = "https://sandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def createActivity ( RepresentsAnActivityThatCanBeParameterizedAndTrackedThroughMetricsScoresEtc activityResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/activities"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    RepresentsAnActivityThatCanBeParameterizedAndTrackedThroughMetricsScoresEtc.class )
                    
    }
    def createActivityOccurrence ( Boolean test, AOccurrenceOfAnActivityTheActualGameForExampleUsedToTrackScoresParticipantsAndProvideSettings activityOccurrenceResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/activity-occurrences"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(test)))
            queryParams.put("test", String.valueOf(test))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    AOccurrenceOfAnActivityTheActualGameForExampleUsedToTrackScoresParticipantsAndProvideSettings.class )
                    
    }
    def createActivityTemplate ( TemplateResource activityTemplateResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/activities/templates"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    TemplateResource.class )
                    
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
    def deleteActivityTemplate ( String id, String cascade, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/activities/templates/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        if (!"null".equals(String.valueOf(cascade)))
            queryParams.put("cascade", String.valueOf(cascade))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getActivities ( Boolean filterTemplate, String filterName, Object filterId, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
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
                    RepresentsAnActivityThatCanBeParameterizedAndTrackedThroughMetricsScoresEtc.class )
                    
    }
    def getActivityTemplate ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/activities/templates/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    TemplateResource.class )
                    
    }
    def getActivityTemplates ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/activities/templates"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceTemplateResource.class )
                    
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
    def updateActivity ( Long id, RepresentsAnActivityThatCanBeParameterizedAndTrackedThroughMetricsScoresEtc activityResource, Closure onSuccess, Closure onFailure)  {
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
                    RepresentsAnActivityThatCanBeParameterizedAndTrackedThroughMetricsScoresEtc.class )
                    
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
    def updateActivityTemplate ( String id, TemplateResource activityTemplateResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/activities/templates/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    TemplateResource.class )
                    
    }
}
