package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.OAuth2Resource

import java.util.*;

@Mixin(ApiUtils)
class AccessTokenApi {
    String basePath = "https://sandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def getOAuthToken ( String grantType, String clientId, String clientSecret, String username, String password, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/oauth/token"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (grantType == null) {
            throw new RuntimeException("missing required params grantType")
        }
        // verify required params are set
        if (clientId == null) {
            throw new RuntimeException("missing required params clientId")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    OAuth2Resource.class )
                    
    }
}
