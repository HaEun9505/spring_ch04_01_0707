package com.haeun.bmi;

import java.util.ArrayList;

public class MyInfo {
	private String name;				//이름
	private double weight;				//몸무게
	private double height;				//키
	private ArrayList<String> hobbys;	//취미
	private BmiCalculator bmiCal;		//계산
	
	public void bmiCalculation() {
		bmiCal.bmiCalcu(weight, height);
	}
	
	public void getMyInfo() {
		System.out.println("이름 : "+name);
		System.out.println("몸무게 : "+weight);
		System.out.println("키 : "+height);
		System.out.println("취미 : "+hobbys);
		//메소드 호출
		bmiCalculation();
		//bmiCal.bmiCalcu(weight, height);
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setBmiCal(BmiCalculator bmiCal) {
		this.bmiCal = bmiCal;
	}

	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
	
}
