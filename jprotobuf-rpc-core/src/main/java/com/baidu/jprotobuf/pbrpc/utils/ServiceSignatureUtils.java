/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.jprotobuf.pbrpc.utils;

/**
 * Utility class for service signature string wrap.
 *
 * @author xiemalin
 * @since 2.3.1
 */
public class ServiceSignatureUtils {

    /**
     * make service signature
     * @param serviceName name of service
     * @param methodName name of method
     * @return service signature
     */
    public static String makeSignature(String serviceName, String methodName) {
        return serviceName + '!' + methodName;
    }
}
