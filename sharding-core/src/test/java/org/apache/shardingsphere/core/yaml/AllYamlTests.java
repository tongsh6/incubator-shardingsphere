/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.core.yaml;

import org.apache.shardingsphere.core.yaml.masterslave.YamlMasterSlaveConfigurationTest;
import org.apache.shardingsphere.core.yaml.masterslave.YamlMasterSlaveRuleConfigurationTest;
import org.apache.shardingsphere.core.yaml.sharding.YamlEncryptorConfigurationTest;
import org.apache.shardingsphere.core.yaml.sharding.YamlKeyGeneratorConfigurationTest;
import org.apache.shardingsphere.core.yaml.sharding.YamlShardingConfigurationTest;
import org.apache.shardingsphere.core.yaml.sharding.YamlShardingRuleConfigurationTest;
import org.apache.shardingsphere.core.yaml.sharding.YamlShardingStrategyConfigurationTest;
import org.apache.shardingsphere.core.yaml.sharding.YamlTableRuleConfigurationTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        YamlShardingConfigurationTest.class, 
        YamlShardingRuleConfigurationTest.class, 
        YamlTableRuleConfigurationTest.class, 
        YamlShardingStrategyConfigurationTest.class, 
        YamlKeyGeneratorConfigurationTest.class, 
        YamlMasterSlaveConfigurationTest.class, 
        YamlMasterSlaveRuleConfigurationTest.class,
        YamlEncryptorConfigurationTest.class
})
public final class AllYamlTests {
}
