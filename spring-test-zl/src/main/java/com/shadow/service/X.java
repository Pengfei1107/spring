package com.shadow.service;


import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;


public class X {



	Y y;
	Z z;


	public void setYluban(Y y) {
		this.y = y;
	}

	public void setZ(Z z) {
		this.z = z;
	}

	public void getY() {
		System.out.println(z);
		System.out.println(y);
	}

	public X(){
		System.out.println("----default-------");
	}



}
