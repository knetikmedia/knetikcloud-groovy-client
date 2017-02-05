package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.AchievementDefinitionResource
import io.swagger.model.AchievementProgressUpdateRequest
import io.swagger.model.BreTriggerResource
import io.swagger.model.PageResourceAchievementDefinitionResource
import io.swagger.model.PageResourceTemplateResource
import io.swagger.model.PageResourceUserAchievementGroupResource
import io.swagger.model.TemplateResource
import io.swagger.model.UserAchievementGroupResource

import java.util.*;

@Mixin(ApiUtils)
class GamificationAchievementsApi {
    String basePath = "https://integration.knetikcloud.com/"
    String versionPath = "/api/v1"

    def createAchievementUsingPOST ( AchievementDefinitionResource achievement, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/achievements"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    AchievementDefinitionResource.class )
                    
    }
    def createTemplateUsingPOST ( TemplateResource template, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/achievements/templates"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    TemplateResource.class )
                    
    }
    def deleteAchievementTemplateUsingDELETE ( String id, String cascade, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/achievements/templates/{id}"

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
    def deleteAchievementUsingDELETE ( String name, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/achievements/{name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def findAllByGroupNameUsingGET ( String name, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/achievements/derived/{name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    AchievementDefinitionResource.class )
                    
    }
    def getAchievementTemplateUsingGET ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/achievements/templates/{id}"

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
    def getAchievementTemplatesUsingGET ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/achievements/templates"

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
    def getAchievementUsingGET ( String name, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/achievements/{name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    AchievementDefinitionResource.class )
                    
    }
    def getAchievementsUsingGET ( String filterTagset, String filterName, Boolean filterHidden, Boolean filterDerived, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/achievements"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterTagset)))
            queryParams.put("filterTagset", String.valueOf(filterTagset))
if (!"null".equals(String.valueOf(filterName)))
            queryParams.put("filterName", String.valueOf(filterName))
if (!"null".equals(String.valueOf(filterHidden)))
            queryParams.put("filterHidden", String.valueOf(filterHidden))
if (!"null".equals(String.valueOf(filterDerived)))
            queryParams.put("filterDerived", String.valueOf(filterDerived))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceAchievementDefinitionResource.class )
                    
    }
    def getAllUserProgressForAchievementUsingGET ( String achievementName, Boolean filterAchievementDerived, String filterAchievementTagset, Boolean filterAchievementHidden, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/achievements/{achievement_name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (achievementName == null) {
            throw new RuntimeException("missing required params achievementName")
        }

        if (!"null".equals(String.valueOf(filterAchievementDerived)))
            queryParams.put("filterAchievementDerived", String.valueOf(filterAchievementDerived))
if (!"null".equals(String.valueOf(filterAchievementTagset)))
            queryParams.put("filterAchievementTagset", String.valueOf(filterAchievementTagset))
if (!"null".equals(String.valueOf(filterAchievementHidden)))
            queryParams.put("filterAchievementHidden", String.valueOf(filterAchievementHidden))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceUserAchievementGroupResource.class )
                    
    }
    def getAllUserProgressUsingGET ( Boolean filterAchievementDerived, String filterAchievementTagset, String filterAchievementName, Boolean filterAchievementHidden, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/achievements"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterAchievementDerived)))
            queryParams.put("filterAchievementDerived", String.valueOf(filterAchievementDerived))
if (!"null".equals(String.valueOf(filterAchievementTagset)))
            queryParams.put("filterAchievementTagset", String.valueOf(filterAchievementTagset))
if (!"null".equals(String.valueOf(filterAchievementName)))
            queryParams.put("filterAchievementName", String.valueOf(filterAchievementName))
if (!"null".equals(String.valueOf(filterAchievementHidden)))
            queryParams.put("filterAchievementHidden", String.valueOf(filterAchievementHidden))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceUserAchievementGroupResource.class )
                    
    }
    def getAvailableTriggersUsingGET ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/achievements/triggers"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    BreTriggerResource.class )
                    
    }
    def getUserProgressForAchievementUsingGET ( Integer userId, String achievementName, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/achievements/{achievement_name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (achievementName == null) {
            throw new RuntimeException("missing required params achievementName")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    UserAchievementGroupResource.class )
                    
    }
    def getUserProgressUsingGET ( Integer userId, Boolean filterAchievementDerived, String filterAchievementTagset, String filterAchievementName, Boolean filterAchievementHidden, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/achievements"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }

        if (!"null".equals(String.valueOf(filterAchievementDerived)))
            queryParams.put("filterAchievementDerived", String.valueOf(filterAchievementDerived))
if (!"null".equals(String.valueOf(filterAchievementTagset)))
            queryParams.put("filterAchievementTagset", String.valueOf(filterAchievementTagset))
if (!"null".equals(String.valueOf(filterAchievementName)))
            queryParams.put("filterAchievementName", String.valueOf(filterAchievementName))
if (!"null".equals(String.valueOf(filterAchievementHidden)))
            queryParams.put("filterAchievementHidden", String.valueOf(filterAchievementHidden))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceUserAchievementGroupResource.class )
                    
    }
    def updateAchievementUsingPUT ( String name, AchievementDefinitionResource achievement, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/achievements/{name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def updateProgressUsingPUT ( Integer userId, String achievementName, AchievementProgressUpdateRequest request, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/achievements/{achievement_name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (achievementName == null) {
            throw new RuntimeException("missing required params achievementName")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    UserAchievementGroupResource.class )
                    
    }
    def updateTemplateUsingPUT ( String id, TemplateResource template, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/achievements/templates/{id}"

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
