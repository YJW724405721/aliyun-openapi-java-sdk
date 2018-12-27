/*
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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeOperateInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOperateInfoResponse extends AcsResponse {

	private String requestId;

	private Integer healthCheckDealedCount;

	private Integer securityEventDealedCount;

	private Integer vulnerabilityDealedCount;

	private Boolean success;

	private List<String> suspEventValueArray;

	private List<String> vulValueArray;

	private List<String> dateArray;

	private List<String> healthCheckValueArray;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHealthCheckDealedCount() {
		return this.healthCheckDealedCount;
	}

	public void setHealthCheckDealedCount(Integer healthCheckDealedCount) {
		this.healthCheckDealedCount = healthCheckDealedCount;
	}

	public Integer getSecurityEventDealedCount() {
		return this.securityEventDealedCount;
	}

	public void setSecurityEventDealedCount(Integer securityEventDealedCount) {
		this.securityEventDealedCount = securityEventDealedCount;
	}

	public Integer getVulnerabilityDealedCount() {
		return this.vulnerabilityDealedCount;
	}

	public void setVulnerabilityDealedCount(Integer vulnerabilityDealedCount) {
		this.vulnerabilityDealedCount = vulnerabilityDealedCount;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<String> getSuspEventValueArray() {
		return this.suspEventValueArray;
	}

	public void setSuspEventValueArray(List<String> suspEventValueArray) {
		this.suspEventValueArray = suspEventValueArray;
	}

	public List<String> getVulValueArray() {
		return this.vulValueArray;
	}

	public void setVulValueArray(List<String> vulValueArray) {
		this.vulValueArray = vulValueArray;
	}

	public List<String> getDateArray() {
		return this.dateArray;
	}

	public void setDateArray(List<String> dateArray) {
		this.dateArray = dateArray;
	}

	public List<String> getHealthCheckValueArray() {
		return this.healthCheckValueArray;
	}

	public void setHealthCheckValueArray(List<String> healthCheckValueArray) {
		this.healthCheckValueArray = healthCheckValueArray;
	}

	@Override
	public DescribeOperateInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeOperateInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
