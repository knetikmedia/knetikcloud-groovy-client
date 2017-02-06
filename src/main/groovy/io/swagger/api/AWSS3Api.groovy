package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.AmazonS3Activity

import java.util.*;

@Mixin(ApiUtils)
class AWSS3Api {
    String basePath = "https://localhost:8080/"
    String versionPath = "/api/v1"

    def getSignedS3URL ( String filename, String contentType, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/amazon/s3/signedposturl"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filename)))
            queryParams.put("filename", String.valueOf(filename))
if (!"null".equals(String.valueOf(contentType)))
            queryParams.put("contentType", String.valueOf(contentType))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    AmazonS3Activity.class )
                    
    }
}
