package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PropertyFieldListResource
import io.swagger.model.Result

import java.util.*;

@Mixin(ApiUtils)
class TemplatesPropertiesApi {
    String basePath = "https://sandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def getTemplatePropertyType ( String type, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/templates/properties/{type}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (type == null) {
            throw new RuntimeException("missing required params type")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PropertyFieldListResource.class )
                    
    }
    def getTemplatePropertyTypes ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/templates/properties"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    PropertyFieldListResource.class )
                    
    }
}
