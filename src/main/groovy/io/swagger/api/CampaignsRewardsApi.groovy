package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PageRewardSetResource
import io.swagger.model.RewardSetResource

import java.util.*;

@Mixin(ApiUtils)
class CampaignsRewardsApi {
    String basePath = "https://localhost:8080/"
    String versionPath = "/api/v1"

    def createRewardSetUsingPOST ( RewardSetResource rewardSetResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/rewards"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    RewardSetResource.class )
                    
    }
    def deleteRewardSetUsingDELETE ( Integer id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/rewards/{id}"

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
    def getRewardSetUsingGET ( Integer id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/rewards/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    RewardSetResource.class )
                    
    }
    def getRewardSetsUsingGET ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/rewards"

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
                    PageRewardSetResource.class )
                    
    }
    def updateRewardSetUsingPUT ( Integer id, RewardSetResource rewardSetResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/rewards/{id}"

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