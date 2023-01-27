package helloworld;

public class Person {
private String name;
private int age;
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
	public Person(String name, int age) {
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return String.format("name-%s,age-%d",name,age );
}
}