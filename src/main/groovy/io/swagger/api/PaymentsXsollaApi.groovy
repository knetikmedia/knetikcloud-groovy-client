package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.XsollaPaymentRequest

import java.util.*;

@Mixin(ApiUtils)
class PaymentsXsollaApi {
    String basePath = "https://devsandbox.knetikcloud.com/"
    String versionPath = "/api/v1"

    def createTokenUrlUsingPOST ( XsollaPaymentRequest request, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/payment/provider/xsolla/payment"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )
                    
    }
    def receiveNotificationUsingPOST ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/payment/provider/xsolla/notifications"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
}
