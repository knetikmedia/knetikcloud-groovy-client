package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PageResourceUserRelationshipResource
import io.swagger.model.UserRelationshipResource

import java.util.*;

@Mixin(ApiUtils)
class UsersRelationshipsApi {
    String basePath = "https://localhost:8080/"
    String versionPath = "/api/v1"

    def createUserRelationship ( UserRelationshipResource relationship, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/relationships"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    UserRelationshipResource.class )
                    
    }
    def deleteUserRelationship ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/relationships/{id}"

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
    def getUserRelationship ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/relationships/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    UserRelationshipResource.class )
                    
    }
    def getUserRelationships ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/relationships"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceUserRelationshipResource.class )
                    
    }
    def updateUserRelationship ( Long id, UserRelationshipResource relationship, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/relationships/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    UserRelationshipResource.class )
                    
    }
}
