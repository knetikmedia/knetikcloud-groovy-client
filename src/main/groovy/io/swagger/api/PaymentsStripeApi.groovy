package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PaymentMethodResource
import io.swagger.model.StripeCreatePaymentMethod
import io.swagger.model.StripePaymentRequest

import java.util.*;

@Mixin(ApiUtils)
class PaymentsStripeApi {
    String basePath = "https://localhost:8080/"
    String versionPath = "/api/v1"

    def createCustomerUsingPOST1 ( StripeCreatePaymentMethod request, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/payment/provider/stripe/payment-methods"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    PaymentMethodResource.class )
                    
    }
    def payInvoiceUsingPOST1 ( StripePaymentRequest request, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/payment/provider/stripe/payments"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
}