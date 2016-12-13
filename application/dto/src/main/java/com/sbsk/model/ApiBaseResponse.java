package com.sbsk.model;

import java.util.HashMap;
import java.util.Map;

public class ApiBaseResponse extends GenericErrorContainer implements ApiResponse {

	private static final String API_VERSION = "0.1";
	protected String sid;
	protected String version;
	protected boolean success;
	protected Map<String, Object> data;

	public ApiBaseResponse() {
		this.version = API_VERSION;
	}

	@Override
	public String getVersion() {
		return version;
	}

	@Override
	public String getSid() {
		return sid;
	}

	@Override
	public void setSid(String sid) {
		this.sid = sid;
	}

	@Override
	public void insertData(String key, Object obj) {
		data = data != null ? data : new HashMap<String, Object>();
		data.put(key, obj);
	}

	@Override
	public Object retrieveData(String key) {
		return (data != null) ? data.get(key) : null;
	}

	@Override
	public boolean isSuccess() {
		return success;
	}

	@Override
	public void setSuccessful() {
		this.success = true;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	@Override
	public String toString() {
		return "BaseAddOnsApiResponse [sid=" + sid + ", version=" + version + ", success=" + success + ", data=" + data + ", errors=" + getErrors() + ", warnings="
				+ getWarnings() + "]";
	}

}