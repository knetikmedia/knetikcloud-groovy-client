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
import io.swagger.model.Result
import io.swagger.model.TemplateResource
import io.swagger.model.UserAchievementGroupResource

import java.util.*;

@Mixin(ApiUtils)
class GamificationAchievementsApi {
    String basePath = "https://sandbox.knetikcloud.com/"
    String versionPath = "/api/v1"

    def createAchievement ( AchievementDefinitionResource achievement, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/achievements"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    AchievementDefinitionResource.class )
                    
    }
    def createAchievementTemplate ( TemplateResource template, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/achievements/templates"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    TemplateResource.class )
                    
    }
    def deleteAchievement ( String name, Closure onSuccess, Closure onFailure)  {
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
    def deleteAchievementTemplate ( String id, String cascade, Closure onSuccess, Closure onFailure)  {
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
    def getAchievement ( String name, Closure onSuccess, Closure onFailure)  {
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
    def getAchievementTemplate ( String id, Closure onSuccess, Closure onFailure)  {
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
    def getAchievementTemplates ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
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
    def getAchievementTriggers ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/achievements/triggers"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    BreTriggerResource.class )
                    
    }
    def getAchievements ( String filterTagset, String filterName, Boolean filterHidden, Boolean filterDerived, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
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
    def getDerivedAchievements ( String name, Closure onSuccess, Closure onFailure)  {
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
    def getUserAchievementProgress ( Integer userId, String achievementName, Closure onSuccess, Closure onFailure)  {
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
    def getUserAchievementsProgress ( Integer userId, Boolean filterAchievementDerived, String filterAchievementTagset, String filterAchievementName, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
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
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceUserAchievementGroupResource.class )
                    
    }
    def getUsersAchievementProgress ( String achievementName, Boolean filterAchievementDerived, String filterAchievementTagset, String filterAchievementName, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
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
if (!"null".equals(String.valueOf(filterAchievementName)))
            queryParams.put("filterAchievementName", String.valueOf(filterAchievementName))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceUserAchievementGroupResource.class )
                    
    }
    def getUsersAchievementsProgress ( Boolean filterAchievementDerived, String filterAchievementTagset, String filterAchievementName, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
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
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceUserAchievementGroupResource.class )
                    
    }
    def updateAchievement ( String name, AchievementDefinitionResource achievement, Closure onSuccess, Closure onFailure)  {
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
                    AchievementDefinitionResource.class )
                    
    }
    def updateAchievementProgress ( Integer userId, String achievementName, AchievementProgressUpdateRequest request, Closure onSuccess, Closure onFailure)  {
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
    def updateAchievementTemplate ( String id, TemplateResource template, Closure onSuccess, Closure onFailure)  {
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
                    TemplateResource.class )
                    
    }
}
