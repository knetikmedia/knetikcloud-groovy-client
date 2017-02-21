package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.ChallengeActivityResource
import io.swagger.model.ChallengeEventResource
import io.swagger.model.ChallengeResource
import io.swagger.model.PageResourceBareChallengeActivityResource
import io.swagger.model.PageResourceChallengeEventResource
import io.swagger.model.PageResourceChallengeResource
import io.swagger.model.PageResourceTemplateResource
import io.swagger.model.Result
import io.swagger.model.TemplateResource

import java.util.*;

@Mixin(ApiUtils)
class CampaignsChallengesApi {
    String basePath = "https://localhost:8080/"
    String versionPath = "/api/v1"

    def createChallenge ( ChallengeResource challengeResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/challenges"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ChallengeResource.class )
                    
    }
    def createChallengeActivity ( Long challengeId, ChallengeActivityResource challengeActivityResource, Boolean validateSettings, Closure onSuccess, Closure onFailure)  {
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
    def createChallengeTemplate ( TemplateResource challengeTemplateResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/challenges/templates"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    TemplateResource.class )
                    
    }
    def deleteChallenge ( Long id, Closure onSuccess, Closure onFailure)  {
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
    def deleteChallengeActivity ( Long activityId, Long challengeId, Closure onSuccess, Closure onFailure)  {
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
    def deleteChallengeEvent ( Long id, Closure onSuccess, Closure onFailure)  {
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
    def deleteChallengeTemplate ( String id, String cascade, Closure onSuccess, Closure onFailure)  {
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
    def getChallenge ( Long id, Closure onSuccess, Closure onFailure)  {
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
    def getChallengeActivities ( Long challengeId, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
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
                    PageResourceBareChallengeActivityResource.class )
                    
    }
    def getChallengeActivity ( Long activityId, Closure onSuccess, Closure onFailure)  {
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
    def getChallengeEvent ( Long id, Closure onSuccess, Closure onFailure)  {
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
    def getChallengeEvents ( String filterStartDate, String filterEndDate, Boolean filterCampaigns, Long filterChallenge, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/challenges/events"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterStartDate)))
            queryParams.put("filterStartDate", String.valueOf(filterStartDate))
if (!"null".equals(String.valueOf(filterEndDate)))
            queryParams.put("filterEndDate", String.valueOf(filterEndDate))
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
                    PageResourceChallengeEventResource.class )
                    
    }
    def getChallengeTemplate ( String id, Closure onSuccess, Closure onFailure)  {
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
    def getChallengeTemplates ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
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
                    PageResourceTemplateResource.class )
                    
    }
    def getChallenges ( Boolean filterTemplate, Boolean filterActiveCampaign, Closure onSuccess, Closure onFailure)  {
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
                    PageResourceChallengeResource.class )
                    
    }
    def updateChallenge ( Long id, ChallengeResource challengeResource, Closure onSuccess, Closure onFailure)  {
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
    def updateChallengeActivity ( Long activityId, Long challengeId, ChallengeActivityResource challengeActivityResource, Closure onSuccess, Closure onFailure)  {
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
                    ChallengeActivityResource.class )
                    
    }
    def updateChallengeTemplate ( String id, TemplateResource challengeTemplateResource, Closure onSuccess, Closure onFailure)  {
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
                    TemplateResource.class )
                    
    }
}
