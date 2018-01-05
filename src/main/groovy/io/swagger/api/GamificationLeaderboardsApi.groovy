package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.LeaderboardEntryResource
import io.swagger.model.LeaderboardResource
import io.swagger.model.Result

import java.util.*;

@Mixin(ApiUtils)
class GamificationLeaderboardsApi {
    String basePath = "https://devsandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def getLeaderboard ( String contextType, String contextId, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
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
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    LeaderboardResource.class )
                    
    }
    def getLeaderboardRank ( String contextType, String contextId, String id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
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

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    LeaderboardEntryResource.class )
                    
    }
    def getLeaderboardStrategies ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/leaderboards/strategies"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    String.class )
                    
    }
}
