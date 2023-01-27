package helloworld;

public class Address {
	private String line;
	private String city;
public Address(String line,String city) {
	this.city=city;
	this.line=line;
}
public String getLine() {
	return line;
}
public void setLine(String line) {
	this.line = line;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String toString() {
	return String.format("line-%s,city-%s",line,city );
}
}
