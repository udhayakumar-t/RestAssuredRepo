package Pojo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class Mobile {
private String courseTitle;
public String getCourseTitle() {
	return courseTitle;
}
public void setCourseTitle(String courseTitle) {
	this.courseTitle = courseTitle;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
private String price;


}
