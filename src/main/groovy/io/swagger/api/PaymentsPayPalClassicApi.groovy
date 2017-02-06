package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.CreateBillingAgreementRequest
import io.swagger.model.CreatePayPalPaymentRequest
import io.swagger.model.FinalizeBillingAgreementRequest
import io.swagger.model.FinalizePayPalPaymentRequest

import java.util.*;

@Mixin(ApiUtils)
class PaymentsPayPalClassicApi {
    String basePath = "https://localhost:8080/"
    String versionPath = "/api/v1"

    def createPayPalBillingAgreementUrl ( CreateBillingAgreementRequest request, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/payment/provider/paypal/classic/agreements/start"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )
                    
    }
    def createPayPalExpressCheckout ( CreatePayPalPaymentRequest request, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/payment/provider/paypal/classic/checkout/start"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )
                    
    }
    def finalizePayPalBillingAgreement ( FinalizeBillingAgreementRequest request, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/payment/provider/paypal/classic/agreements/finish"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Integer.class )
                    
    }
    def finalizePayPalCheckout ( FinalizePayPalPaymentRequest request, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/payment/provider/paypal/classic/checkout/finish"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
}
