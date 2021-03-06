/*
 * Copyright 2008-2009 the original author or authors.
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

package org.broadleafcommerce.core.web;

import java.util.Enumeration;

import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;

import org.broadleafcommerce.core.web.SpringTemporaryRedirectOverrideFilter;

import junit.framework.TestCase;

/**
 * 
 * @author jfischer
 *
 */
public class SpringTemporaryRedirectOverrideFilterTest extends TestCase {
	
	public void testFilter() throws Exception {
		SpringTemporaryRedirectOverrideFilter filter = new SpringTemporaryRedirectOverrideFilter();
		FilterConfig config = new FilterConfig() {
			
			public String getFilterName() {
				return null;
			}
			
			public String getInitParameter(String param) {
				return "category/temp.*\n stellar/test/tester another/small/test";
			}
			
			public Enumeration<String> getInitParameterNames() {
				return null;
			}

			public ServletContext getServletContext() {
				return null;
			}
		};
		filter.init(config);
		assertFalse(filter.isUrlMatch("nonsense/category/temp/mytest"));
		assertTrue(filter.isUrlMatch("category/temp/mytest"));
		assertTrue(filter.isUrlMatch("stellar/test/tester"));
	}

}
