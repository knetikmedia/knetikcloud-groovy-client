package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.LeaderboardEntryResource
import io.swagger.model.LeaderboardResource

import java.util.*;

@Mixin(ApiUtils)
class GamificationLeaderboardsApi {
    String basePath = "https://devsandbox.knetikcloud.com/"
    String versionPath = "/api/v1"

    def getLeaderboardUsingGET ( String contextType, String contextId, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/leaderboards/{context_type}/{context_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (contextType == null) {
            throw new RuntimeException("missing required params contextType")
        }
        // verify required params are set
        if (contextId == null) {
            throw new RuntimeException("missing required params contextId")
        }

        if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    LeaderboardResource.class )
                    
    }
    def getStrategiesUsingGET ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/leaderboards/strategies"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    String.class )
                    
    }
    def getUserRankUsingGET ( String contextType, String contextId, String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/leaderboards/{context_type}/{context_id}/users/{id}/rank"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (contextType == null) {
            throw new RuntimeException("missing required params contextType")
        }
        // verify required params are set
        if (contextId == null) {
            throw new RuntimeException("missing required params contextId")
        }
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    LeaderboardEntryResource.class )
                    
    }
}
