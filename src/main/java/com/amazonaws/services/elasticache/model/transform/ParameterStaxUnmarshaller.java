/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticache.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Parameter StAX Unmarshaller
 */
public class ParameterStaxUnmarshaller implements Unmarshaller<Parameter, StaxUnmarshallerContext> {

    public Parameter unmarshall(StaxUnmarshallerContext context) throws Exception {
        Parameter parameter = new Parameter();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return parameter;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("ParameterName", targetDepth)) {
                    parameter.setParameterName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ParameterValue", targetDepth)) {
                    parameter.setParameterValue(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Description", targetDepth)) {
                    parameter.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Source", targetDepth)) {
                    parameter.setSource(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DataType", targetDepth)) {
                    parameter.setDataType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AllowedValues", targetDepth)) {
                    parameter.setAllowedValues(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("IsModifiable", targetDepth)) {
                    parameter.setIsModifiable(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MinimumEngineVersion", targetDepth)) {
                    parameter.setMinimumEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return parameter;
                }
            }
        }
    }

    private static ParameterStaxUnmarshaller instance;
    public static ParameterStaxUnmarshaller getInstance() {
        if (instance == null) instance = new ParameterStaxUnmarshaller();
        return instance;
    }
}
    