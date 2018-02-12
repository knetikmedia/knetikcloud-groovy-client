package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.ActivityOccurrenceCreationFailure
import io.swagger.model.ActivityOccurrenceJoinResult
import io.swagger.model.ActivityOccurrenceResource
import io.swagger.model.ActivityOccurrenceResults
import io.swagger.model.ActivityOccurrenceResultsResource
import io.swagger.model.ActivityOccurrenceSettingsResource
import io.swagger.model.ActivityResource
import io.swagger.model.ActivityUserResource
import io.swagger.model.CreateActivityOccurrenceRequest
import io.swagger.model.IntWrapper
import io.swagger.model.PageResourceActivityOccurrenceResource
import io.swagger.model.PageResourceBareActivityResource
import io.swagger.model.PageResourceTemplateResource
import io.swagger.model.Result
import io.swagger.model.TemplateResource
import io.swagger.model.ValueWrapperstring

import java.util.*;

@Mixin(ApiUtils)
class ActivitiesApi {
    String basePath = "https://sandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def addUser ( Long activityOccurrenceId, Boolean test, Boolean bypassRestrictions, IntWrapper userId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/activity-occurrences/{activity_occurrence_id}/users"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (activityOccurrenceId == null) {
            throw new RuntimeException("missing required params activityOccurrenceId")
        }

        if (!"null".equals(String.valueOf(test)))
            queryParams.put("test", String.valueOf(test))
if (!"null".equals(String.valueOf(bypassRestrictions)))
            queryParams.put("bypass_restrictions", String.valueOf(bypassRestrictions))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ActivityOccurrenceResource.class )
                    
    }
    def createActivity ( ActivityResource activityResource, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/activities"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ActivityResource.class )
                    
    }
    def createActivityOccurrence ( Boolean test, CreateActivityOccurrenceRequest activityOccurrenceResource, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/activity-occurrences"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(test)))
            queryParams.put("test", String.valueOf(test))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ActivityOccurrenceResource.class )
                    
    }
    def createActivityTemplate ( TemplateResource activityTemplateResource, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/activities/templates"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    TemplateResource.class )
                    
    }
    def deleteActivity ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/activities/{id}"

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
    def deleteActivityTemplate ( String id, String cascade, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
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


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getActivities ( Boolean filterTemplate, String filterName, String filterId, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/activities"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterTemplate)))
            queryParams.put("filter_template", String.valueOf(filterTemplate))
if (!"null".equals(String.valueOf(filterName)))
            queryParams.put("filter_name", String.valueOf(filterName))
if (!"null".equals(String.valueOf(filterId)))
            queryParams.put("filter_id", String.valueOf(filterId))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceBareActivityResource.class )
                    
    }
    def getActivity ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/activities/{id}"

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
                    ActivityResource.class )
                    
    }
    def getActivityOccurrenceDetails ( Long activityOccurrenceId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/activity-occurrences/{activity_occurrence_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (activityOccurrenceId == null) {
            throw new RuntimeException("missing required params activityOccurrenceId")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    ActivityOccurrenceResource.class )
                    
    }
    def getActivityTemplate ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/activities/templates/{id}"

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
                    TemplateResource.class )
                    
    }
    def getActivityTemplates ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
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


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceTemplateResource.class )
                    
    }
    def listActivityOccurrences ( String filterActivity, String filterStatus, Integer filterEvent, Integer filterChallenge, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/activity-occurrences"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterActivity)))
            queryParams.put("filter_activity", String.valueOf(filterActivity))
if (!"null".equals(String.valueOf(filterStatus)))
            queryParams.put("filter_status", String.valueOf(filterStatus))
if (!"null".equals(String.valueOf(filterEvent)))
            queryParams.put("filter_event", String.valueOf(filterEvent))
if (!"null".equals(String.valueOf(filterChallenge)))
            queryParams.put("filter_challenge", String.valueOf(filterChallenge))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceActivityOccurrenceResource.class )
                    
    }
    def removeUser ( Long activityOccurrenceId, String userId, Boolean ban, Boolean bypassRestrictions, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/activity-occurrences/{activity_occurrence_id}/users/{user_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (activityOccurrenceId == null) {
            throw new RuntimeException("missing required params activityOccurrenceId")
        }
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }

        if (!"null".equals(String.valueOf(ban)))
            queryParams.put("ban", String.valueOf(ban))
if (!"null".equals(String.valueOf(bypassRestrictions)))
            queryParams.put("bypass_restrictions", String.valueOf(bypassRestrictions))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def setActivityOccurrenceResults ( Long activityOccurrenceId, ActivityOccurrenceResultsResource activityOccurrenceResults, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/activity-occurrences/{activity_occurrence_id}/results"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (activityOccurrenceId == null) {
            throw new RuntimeException("missing required params activityOccurrenceId")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ActivityOccurrenceResults.class )
                    
    }
    def setActivityOccurrenceSettings ( Long activityOccurrenceId, ActivityOccurrenceSettingsResource settings, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/activity-occurrences/{activity_occurrence_id}/settings"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (activityOccurrenceId == null) {
            throw new RuntimeException("missing required params activityOccurrenceId")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    ActivityOccurrenceResource.class )
                    
    }
    def setUserStatus ( Long activityOccurrenceId, String userId, String status, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/activity-occurrences/{activity_occurrence_id}/users/{user_id}/status"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (activityOccurrenceId == null) {
            throw new RuntimeException("missing required params activityOccurrenceId")
        }
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    ActivityUserResource.class )
                    
    }
    def updateActivity ( Long id, ActivityResource activityResource, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/activities/{id}"

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
                    ActivityResource.class )
                    
    }
    def updateActivityOccurrenceStatus ( Long activityOccurrenceId, ValueWrapperstring activityOccurrenceStatus, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/activity-occurrences/{activity_occurrence_id}/status"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (activityOccurrenceId == null) {
            throw new RuntimeException("missing required params activityOccurrenceId")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def updateActivityTemplate ( String id, TemplateResource activityTemplateResource, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/activities/templates/{id}"

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
                    TemplateResource.class )
                    
    }
}
