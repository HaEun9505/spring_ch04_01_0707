package com.haeun.bmi;

import java.util.ArrayList;
//BmiCalculatorŬ������ ����
public class MyInfo {
	private String name;				//�̸�
	private double weight;				//������
	private double height;				//Ű
	private ArrayList<String> hobbys;	//���
	private BmiCalculator bmiCal;		//���(BmiCalculatorŬ����) ��������
	
	public void bmiCalculation() {			//�޼ҵ� ����
		bmiCal.bmiCalcu(weight, height);	//��ü.�޼ҵ�
	}
	
	public void getMyInfo() {
		System.out.println("�̸� : "+name);
		System.out.println("������ : "+weight);
		System.out.println("Ű : "+height);
		System.out.println("��� : "+hobbys);
		
		
		bmiCalculation();	//�޼ҵ� ȣ��
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