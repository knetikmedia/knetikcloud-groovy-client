package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.GoogleToken
import io.swagger.model.Result

import java.util.*;

@Mixin(ApiUtils)
class SocialGoogleApi {
    String basePath = "https://sandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def linkAccounts1 ( GoogleToken facebookToken, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/social/google/users"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
}
