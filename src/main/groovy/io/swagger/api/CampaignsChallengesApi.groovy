package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.ChallengeActivityResource
import io.swagger.model.ChallengeEventResource
import io.swagger.model.ChallengeResource
import io.swagger.model.PageBareChallengeActivityResource
import io.swagger.model.PageChallengeEventResource
import io.swagger.model.PageChallengeResource
import io.swagger.model.PageTemplateResource
import io.swagger.model.TemplateResource

import java.util.*;

@Mixin(ApiUtils)
class CampaignsChallengesApi {
    String basePath = "https://devsandbox.knetikcloud.com/"
    String versionPath = "/api/v1"

    def createChallengeActivityUsingPOST ( Long challengeId, ChallengeActivityResource challengeActivityResource, Boolean validateSettings, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/challenges/{challenge_id}/activities"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (challengeId == null) {
            throw new RuntimeException("missing required params challengeId")
        }

        if (!"null".equals(String.valueOf(validateSettings)))
            queryParams.put("validateSettings", String.valueOf(validateSettings))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ChallengeActivityResource.class )
                    
    }
    def createChallengeTemplateUsingPOST ( TemplateResource challengeTemplateResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/challenges/templates"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    TemplateResource.class )
                    
    }
    def createChallengeUsingPOST ( ChallengeResource challengeResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/challenges"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ChallengeResource.class )
                    
    }
    def deleteChallengeActivityUsingDELETE ( Long activityId, Long challengeId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/challenges/{challenge_id}/activities/{activity_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (activityId == null) {
            throw new RuntimeException("missing required params activityId")
        }
        // verify required params are set
        if (challengeId == null) {
            throw new RuntimeException("missing required params challengeId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteChallengeEventUsingDELETE ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/challenges/events/{id}"

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
    def deleteChallengeTemplateUsingDELETE ( String id, String cascade, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/challenges/templates/{id}"

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
    def deleteChallengeUsingDELETE ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/challenges/{id}"

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
    def getActivitiesUsingGET1 ( Long challengeId, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/challenges/{challenge_id}/activities"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (challengeId == null) {
            throw new RuntimeException("missing required params challengeId")
        }

        if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageBareChallengeActivityResource.class )
                    
    }
    def getChallengeActivityUsingGET ( Long activityId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/challenges/{challenge_id}/activities/{activity_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (activityId == null) {
            throw new RuntimeException("missing required params activityId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    ChallengeActivityResource.class )
                    
    }
    def getChallengeEventUsingGET ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/challenges/events/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    ChallengeEventResource.class )
                    
    }
    def getChallengeEventssUsingGET ( Long filterStartDateMin, Long filterStartDateMax, Long filterEndDateMin, Long filterEndDateMax, Boolean filterCampaigns, Long filterChallenge, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/challenges/events"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterStartDateMin)))
            queryParams.put("filterStartDateMin", String.valueOf(filterStartDateMin))
if (!"null".equals(String.valueOf(filterStartDateMax)))
            queryParams.put("filterStartDateMax", String.valueOf(filterStartDateMax))
if (!"null".equals(String.valueOf(filterEndDateMin)))
            queryParams.put("filterEndDateMin", String.valueOf(filterEndDateMin))
if (!"null".equals(String.valueOf(filterEndDateMax)))
            queryParams.put("filterEndDateMax", String.valueOf(filterEndDateMax))
if (!"null".equals(String.valueOf(filterCampaigns)))
            queryParams.put("filterCampaigns", String.valueOf(filterCampaigns))
if (!"null".equals(String.valueOf(filterChallenge)))
            queryParams.put("filterChallenge", String.valueOf(filterChallenge))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageChallengeEventResource.class )
                    
    }
    def getChallengeTemplateUsingGET ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/challenges/templates/{id}"

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
    def getChallengeTemplatesUsingGET ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/challenges/templates"

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
                    PageTemplateResource.class )
                    
    }
    def getChallengeUsingGET ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/challenges/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    ChallengeResource.class )
                    
    }
    def getChallengesUsingGET1 ( Boolean filterTemplate, Boolean filterActiveCampaign, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/challenges"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterTemplate)))
            queryParams.put("filterTemplate", String.valueOf(filterTemplate))
if (!"null".equals(String.valueOf(filterActiveCampaign)))
            queryParams.put("filterActiveCampaign", String.valueOf(filterActiveCampaign))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageChallengeResource.class )
                    
    }
    def updateChallengeActivityUsingPUT ( Long activityId, Long challengeId, ChallengeActivityResource challengeActivityResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/challenges/{challenge_id}/activities/{activity_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (activityId == null) {
            throw new RuntimeException("missing required params activityId")
        }
        // verify required params are set
        if (challengeId == null) {
            throw new RuntimeException("missing required params challengeId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def updateChallengeTemplateUsingPUT ( String id, TemplateResource challengeTemplateResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/challenges/templates/{id}"

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
    def updateChallengeUsingPUT ( Long id, ChallengeResource challengeResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/challenges/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    ChallengeResource.class )
                    
    }
}
