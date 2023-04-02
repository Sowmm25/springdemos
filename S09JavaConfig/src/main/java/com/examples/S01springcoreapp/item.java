package com.examples.S01springcoreapp;

public class item {
String id;
String name;
int price;
int quantity;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
@Override
public String toString() {
	return "item [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
}
