package Pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Courses {

private List<WebAutomation> webAutomation;

private List<API> api;

private List<Mobile> mobile;
public List<WebAutomation> getWebAutomation() {
	return webAutomation;
}
public void setWebAutomation(List<WebAutomation> webAutomation) {
	this.webAutomation = webAutomation;
}
public List<API> getApi() {
	return api;
}
public void setApi(List<API> api) {
	this.api = api;
}
public List<Mobile> getMobile() {
	return mobile;
}
public void setMobile(List<Mobile> mobile) {
	this.mobile = mobile;
}


}
