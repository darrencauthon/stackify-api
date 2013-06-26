/*
 * Copyright 2013 Stackify
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stackify.api;

import java.util.Map;

/**
 * Contains details about the web request associated to the error
 * 
 * <p>
 * Example:
 * <pre>
 * {@code
 * WebRequestDetail.Builder builder = WebRequestDetail.newBuilder();
 * builder.userIpAddress("127.0.0.1");
 * builder.httpMethod("GET");
 * builder.requestProtocol("HTTPS");
 * ...
 * WebRequestDetail webRequestDetail = builder.build();
 * }
 * </pre>
 *
 * @author Eric Martin
 */
public class WebRequestDetail {

	/**
	 * User IP address
	 */
	private final String userIpAddress;
	
	/**
	 * HTTP method
	 */
	private final String httpMethod;
	
	/**
	 * Request protocol
	 */
	private final String requestProtocol;
	
	/**
	 * Request URL
	 */
	private final String requestUrl;
	
	/**
	 * Request URL root
	 */
	private final String requestUrlRoot;
	
	/**
	 * Referral URL
	 */
	private final String referralUrl;
	
	/**
	 * Headers
	 */
	private final Map<String, String> headers;
	
	/**
	 * Cookies
	 */
	private final Map<String, String> cookies;
	
	/**
	 * Query string parameters
	 */
	private final Map<String, String> queryString;
	
	/**
	 * Form post data
	 */
	private final Map<String, String> postData;
	
	/**
	 * Session data
	 */
	private final Map<String, String> sessionData;

	/**
	 * Raw post data
	 */
	private final String postDataRaw;

	/**
	 * MVC action
	 */
	private final String mvcAction;
	
	/**
	 * MVC controller
	 */
	private final String mvcController;
	
	/**
	 * MVC area
	 */
	private final String mvcArea;

	/**
	 * @return the userIpAddress
	 */
	public String getUserIpAddress() {
		return userIpAddress;
	}

	/**
	 * @return the httpMethod
	 */
	public String getHttpMethod() {
		return httpMethod;
	}

	/**
	 * @return the requestProtocol
	 */
	public String getRequestProtocol() {
		return requestProtocol;
	}

	/**
	 * @return the requestUrl
	 */
	public String getRequestUrl() {
		return requestUrl;
	}

	/**
	 * @return the requestUrlRoot
	 */
	public String getRequestUrlRoot() {
		return requestUrlRoot;
	}

	/**
	 * @return the referralUrl
	 */
	public String getReferralUrl() {
		return referralUrl;
	}

	/**
	 * @return the headers
	 */
	public Map<String, String> getHeaders() {
		return headers;
	}

	/**
	 * @return the cookies
	 */
	public Map<String, String> getCookies() {
		return cookies;
	}

	/**
	 * @return the queryString
	 */
	public Map<String, String> getQueryString() {
		return queryString;
	}

	/**
	 * @return the postData
	 */
	public Map<String, String> getPostData() {
		return postData;
	}

	/**
	 * @return the sessionData
	 */
	public Map<String, String> getSessionData() {
		return sessionData;
	}

	/**
	 * @return the postDataRaw
	 */
	public String getPostDataRaw() {
		return postDataRaw;
	}

	/**
	 * @return the mvcAction
	 */
	public String getMvcAction() {
		return mvcAction;
	}

	/**
	 * @return the mvcController
	 */
	public String getMvcController() {
		return mvcController;
	}

	/**
	 * @return the mvcArea
	 */
	public String getMvcArea() {
		return mvcArea;
	}

	/**
	 * @param builder The Builder object that contains all of the values for initialization
	 */
	private WebRequestDetail(final Builder builder) {
		this.userIpAddress = builder.userIpAddress;
		this.httpMethod = builder.httpMethod;
		this.requestProtocol = builder.requestProtocol;
		this.requestUrl = builder.requestUrl;
		this.requestUrlRoot = builder.requestUrlRoot;
		this.referralUrl = builder.referralUrl;
		this.headers = builder.headers;
		this.cookies = builder.cookies;
		this.queryString = builder.queryString;
		this.postData = builder.postData;
		this.sessionData = builder.sessionData;
		this.postDataRaw = builder.postDataRaw;
		this.mvcAction = builder.mvcAction;
		this.mvcController = builder.mvcController;
		this.mvcArea = builder.mvcArea;
	}

	/**
	 * @return A new instance of the Builder
	 */
	public static Builder newBuilder() {
		return new Builder();
	}

	/**
	 * WebRequestDetail.Builder separates the construction of a WebRequestDetail from its representation
	 */
	public static class Builder {

		/**
		 * The builder's userIpAddress
		 */
		private String userIpAddress;
		
		/**
		 * The builder's httpMethod
		 */
		private String httpMethod;
		
		/**
		 * The builder's requestProtocol
		 */
		private String requestProtocol;
		
		/**
		 * The builder's requestUrl
		 */
		private String requestUrl;
		
		/**
		 * The builder's requestUrlRoot
		 */
		private String requestUrlRoot;
		
		/**
		 * The builder's referralUrl
		 */
		private String referralUrl;
		
		/**
		 * The builder's headers
		 */
		private Map<String,String> headers;
		
		/**
		 * The builder's cookies
		 */
		private Map<String,String> cookies;
		
		/**
		 * The builder's queryString
		 */
		private Map<String,String> queryString;
		
		/**
		 * The builder's postData
		 */
		private Map<String,String> postData;
		
		/**
		 * The builder's sessionData
		 */
		private Map<String,String> sessionData;
		
		/**
		 * The builder's postDataRaw
		 */
		private String postDataRaw;
		
		/**
		 * The builder's mvcAction
		 */
		private String mvcAction;
		
		/**
		 * The builder's mvcController
		 */
		private String mvcController;
		
		/**
		 * The builder's mvcArea
		 */
		private String mvcArea;
		
		/**
		 * Sets the builder's userIpAddress
		 * @param userIpAddress The userIpAddress to be set
		 * @return Reference to the current object
		 */
		public Builder userIpAddress(final String userIpAddress) {
			this.userIpAddress = userIpAddress;
			return this;
		}
		
		/**
		 * Sets the builder's httpMethod
		 * @param httpMethod The httpMethod to be set
		 * @return Reference to the current object
		 */
		public Builder httpMethod(final String httpMethod) {
			this.httpMethod = httpMethod;
			return this;
		}
		
		/**
		 * Sets the builder's requestProtocol
		 * @param requestProtocol The requestProtocol to be set
		 * @return Reference to the current object
		 */
		public Builder requestProtocol(final String requestProtocol) {
			this.requestProtocol = requestProtocol;
			return this;
		}
		
		/**
		 * Sets the builder's requestUrl
		 * @param requestUrl The requestUrl to be set
		 * @return Reference to the current object
		 */
		public Builder requestUrl(final String requestUrl) {
			this.requestUrl = requestUrl;
			return this;
		}
		
		/**
		 * Sets the builder's requestUrlRoot
		 * @param requestUrlRoot The requestUrlRoot to be set
		 * @return Reference to the current object
		 */
		public Builder requestUrlRoot(final String requestUrlRoot) {
			this.requestUrlRoot = requestUrlRoot;
			return this;
		}
		
		/**
		 * Sets the builder's referralUrl
		 * @param referralUrl The referralUrl to be set
		 * @return Reference to the current object
		 */
		public Builder referralUrl(final String referralUrl) {
			this.referralUrl = referralUrl;
			return this;
		}
		
		/**
		 * Sets the builder's headers
		 * @param headers The headers to be set
		 * @return Reference to the current object
		 */
		public Builder headers(final Map<String,String> headers) {
			this.headers = headers;
			return this;
		}
		
		/**
		 * Sets the builder's cookies
		 * @param cookies The cookies to be set
		 * @return Reference to the current object
		 */
		public Builder cookies(final Map<String,String> cookies) {
			this.cookies = cookies;
			return this;
		}
		
		/**
		 * Sets the builder's queryString
		 * @param queryString The queryString to be set
		 * @return Reference to the current object
		 */
		public Builder queryString(final Map<String,String> queryString) {
			this.queryString = queryString;
			return this;
		}
		
		/**
		 * Sets the builder's postData
		 * @param postData The postData to be set
		 * @return Reference to the current object
		 */
		public Builder postData(final Map<String,String> postData) {
			this.postData = postData;
			return this;
		}
		
		/**
		 * Sets the builder's sessionData
		 * @param sessionData The sessionData to be set
		 * @return Reference to the current object
		 */
		public Builder sessionData(final Map<String,String> sessionData) {
			this.sessionData = sessionData;
			return this;
		}
		
		/**
		 * Sets the builder's postDataRaw
		 * @param postDataRaw The postDataRaw to be set
		 * @return Reference to the current object
		 */
		public Builder postDataRaw(final String postDataRaw) {
			this.postDataRaw = postDataRaw;
			return this;
		}
		
		/**
		 * Sets the builder's mvcAction
		 * @param mvcAction The mvcAction to be set
		 * @return Reference to the current object
		 */
		public Builder mvcAction(final String mvcAction) {
			this.mvcAction = mvcAction;
			return this;
		}
		
		/**
		 * Sets the builder's mvcController
		 * @param mvcController The mvcController to be set
		 * @return Reference to the current object
		 */
		public Builder mvcController(final String mvcController) {
			this.mvcController = mvcController;
			return this;
		}
		
		/**
		 * Sets the builder's mvcArea
		 * @param mvcArea The mvcArea to be set
		 * @return Reference to the current object
		 */
		public Builder mvcArea(final String mvcArea) {
			this.mvcArea = mvcArea;
			return this;
		}
		
		/**
		 * @return A new object constructed from this builder
		 */
		public WebRequestDetail build() {
			return new WebRequestDetail(this);
		}
	}
}
