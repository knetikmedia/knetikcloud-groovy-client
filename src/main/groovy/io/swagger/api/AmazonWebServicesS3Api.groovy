package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.AmazonS3Activity
import io.swagger.model.Result

import java.util.*;

@Mixin(ApiUtils)
class AmazonWebServicesS3Api {
    String basePath = "https://devsandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def getDownloadURL ( String bucket, String path, Integer expiration, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/amazon/s3/downloadurl"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(bucket)))
            queryParams.put("bucket", String.valueOf(bucket))
if (!"null".equals(String.valueOf(path)))
            queryParams.put("path", String.valueOf(path))
if (!"null".equals(String.valueOf(expiration)))
            queryParams.put("expiration", String.valueOf(expiration))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
    def getSignedS3URL ( String filename, String contentType, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/amazon/s3/signedposturl"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filename)))
            queryParams.put("filename", String.valueOf(filename))
if (!"null".equals(String.valueOf(contentType)))
            queryParams.put("content_type", String.valueOf(contentType))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    AmazonS3Activity.class )
                    
    }
}
