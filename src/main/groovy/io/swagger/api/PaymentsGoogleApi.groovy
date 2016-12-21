package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.GooglePaymentRequest

import java.util.*;

@Mixin(ApiUtils)
class PaymentsGoogleApi {
    String basePath = "https://localhost:8080/"
    String versionPath = "/api/v1"

    def handlePaymentUsingPOST ( GooglePaymentRequest request, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/payment/provider/google/payments"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Integer.class )
                    
    }
}
