/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cognitosync.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Subscribe To Dataset Request Marshaller
 */
public class SubscribeToDatasetRequestMarshaller implements Marshaller<Request<SubscribeToDatasetRequest>, SubscribeToDatasetRequest> {

    public Request<SubscribeToDatasetRequest> marshall(SubscribeToDatasetRequest subscribeToDatasetRequest) {
    if (subscribeToDatasetRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<SubscribeToDatasetRequest> request = new DefaultRequest<SubscribeToDatasetRequest>(subscribeToDatasetRequest, "AmazonCognitoSync");
        String target = "AWSCognitoSyncService.SubscribeToDataset";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        String uriResourcePath = "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}/subscriptions/{DeviceId}"; 
        uriResourcePath = uriResourcePath.replace("{IdentityPoolId}", (subscribeToDatasetRequest.getIdentityPoolId() == null) ? "" : StringUtils.fromString(subscribeToDatasetRequest.getIdentityPoolId())); 
        uriResourcePath = uriResourcePath.replace("{IdentityId}", (subscribeToDatasetRequest.getIdentityId() == null) ? "" : StringUtils.fromString(subscribeToDatasetRequest.getIdentityId())); 
        uriResourcePath = uriResourcePath.replace("{DatasetName}", (subscribeToDatasetRequest.getDatasetName() == null) ? "" : StringUtils.fromString(subscribeToDatasetRequest.getDatasetName())); 
        uriResourcePath = uriResourcePath.replace("{DeviceId}", (subscribeToDatasetRequest.getDeviceId() == null) ? "" : StringUtils.fromString(subscribeToDatasetRequest.getDeviceId())); 

        uriResourcePath = uriResourcePath.replaceAll("//", "/");

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    if(!(nameValuePair[1].isEmpty()))
                        request.addParameter(nameValuePair[0], nameValuePair[1]);
                }
            }
        }
        request.setResourcePath(uriResourcePath);
        
        request.setContent(new ByteArrayInputStream(new byte[0]));

        return request;
    }
}
