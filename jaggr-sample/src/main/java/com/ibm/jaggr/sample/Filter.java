/*
 * (C) Copyright 2012, IBM Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ibm.jaggr.sample;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class Filter implements javax.servlet.Filter {
	private static final String CLASS_NAME = Filter.class.getName();
	private static final Logger LOGGER = Logger.getLogger(CLASS_NAME);
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		LOGGER.logp(Level.WARNING, CLASS_NAME, "init", "INIT CALLED.");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		LOGGER.logp(Level.WARNING, CLASS_NAME, "doFilter", "DOFILTER CALLED.");
		HttpServletResponse resp = (HttpServletResponse)response;
		resp.setHeader("X-TEST-HEADER", "TEST");
	}

	@Override
	public void destroy() {
		LOGGER.logp(Level.WARNING, CLASS_NAME, "destroy", "DESTROY CALLED.");
	}

}
