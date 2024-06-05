package Pojo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetCourse {

private String url;

private String expertise;
private Courses courses;

private String instrutor;

private String linkedin;
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getExpertise() {
	return expertise;
}
public void setExpertise(String expertise) {
	this.expertise = expertise;
}
public Courses getCourses() {
	return courses;
}
public void setCourses(Courses courses) {
	this.courses = courses;
}
public String getInstrutor() {
	return instrutor;
}
public void setInstrutor(String instrutor) {
	this.instrutor = instrutor;
}
public String getLinkedin() {
	return linkedin;
}
public void setLinkedin(String linkedin) {
	this.linkedin = linkedin;
}

}
