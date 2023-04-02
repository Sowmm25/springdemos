package com.examples.S01springcoreapp;

public class shoppingcart {
item i=new item();

public item getI() {
	return i;
}

public void setI(item i) {
	this.i = i;
}

@Override
public String toString() {
	return "shoppingcart [i=" + i + "]";
}

}
