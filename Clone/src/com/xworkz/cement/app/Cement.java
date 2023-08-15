package com.xworkz.cement.app;

public class Cement implements Cloneable{
private String brand;
private String ambassador;
private int price;
private double weight;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getAmbassador() {
	return ambassador;
}
public void setAmbassador(String ambassador) {
	this.ambassador = ambassador;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
@Override
public String toString() {
	return "Cement brand=" + brand + ", ambassador=" + ambassador + ", price=" + price + ", weight=" + weight;
			
}


@Override
public Object clone() throws CloneNotSupportedException {
		Cement cement=(Cement)super.clone();
		return cement;
	}


}
