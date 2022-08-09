//
// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
//
package org.apache.cloudstack.oauth2;

import com.cloud.utils.component.PluggableService;
import org.apache.cloudstack.api.auth.PluggableAPIAuthenticator;
import org.apache.cloudstack.framework.config.ConfigKey;

import java.util.Collection;

public interface OAuth2AuthManager extends PluggableAPIAuthenticator, PluggableService {
    public static final ConfigKey<Boolean> OAuth2IsPluginEnabled = new ConfigKey<Boolean>("Advanced", Boolean.class, "oauth2.enabled", "false",
            "Indicates whether OAuth SSO plugin is enabled or not", true);
}