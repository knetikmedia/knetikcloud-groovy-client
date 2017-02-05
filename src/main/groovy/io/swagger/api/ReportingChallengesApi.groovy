package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PageResourceChallengeEventParticipantResource

import java.util.*;

@Mixin(ApiUtils)
class ReportingChallengesApi {
    String basePath = "https://integration.knetikcloud.com/"
    String versionPath = "/api/v1"

    def getChallengeEventLeaderboardUsingGET ( Long filterEvent, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/reporting/events/leaderboard"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterEvent)))
            queryParams.put("filterEvent", String.valueOf(filterEvent))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceChallengeEventParticipantResource.class )
                    
    }
    def getChallengeEventParticipantsUsingGET ( Long filterEvent, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/reporting/events/participants"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterEvent)))
            queryParams.put("filterEvent", String.valueOf(filterEvent))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceChallengeEventParticipantResource.class )
                    
    }
}
