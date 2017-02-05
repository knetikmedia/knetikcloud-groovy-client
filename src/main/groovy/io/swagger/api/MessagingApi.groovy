package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.RawEmailResource
import io.swagger.model.RawSMSResource
import io.swagger.model.TemplateEmailResource
import io.swagger.model.TemplateSMSResource

import java.util.*;

@Mixin(ApiUtils)
class MessagingApi {
    String basePath = "https://integration.knetikcloud.com/"
    String versionPath = "/api/v1"

    def sendRawEmailUsingPOST ( RawEmailResource rawEmailResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/messaging/raw-email"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def sendRawSMSUsingPOST ( RawSMSResource rawSMSResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/messaging/raw-sms"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def sendRawSMSUsingPOST1 ( TemplateSMSResource templateSMSResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/messaging/templated-sms"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def sendTemplateEmailUsingPOST ( TemplateEmailResource messageResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/messaging/templated-email"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
}
