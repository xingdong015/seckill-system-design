/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.system.design.gateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Dubbo Spring Cloud Servlet Gateway Bootstrap.
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 *
 * https://juejin.cn/post/6996852203755405326
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.system.design.gateway")
public class DubboSpringCloudServletGatewayBootstrap {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DubboSpringCloudServletGatewayBootstrap.class)
				.properties("spring.profiles.active=nacos").run(args);
	}

}
