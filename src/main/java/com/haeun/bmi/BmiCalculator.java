package com.haeun.bmi;

public class BmiCalculator {
	private double lowWeight;		//저체중
	private double normalWeight;	//보통체중
	private double overWeight;		//과체중
	private double obesityWeight;	//비만체중
	
	public void bmiCalcu(double weight, double height) {
		//bmi 계산식 : 몸무게 / (키*0.01)^2 
		
		double height2 = height*(0.01);
		double bmiResult = weight / ((height2)*(height2));
		
		System.out.println("BMI지수 : "+(int)bmiResult);
		
		if(bmiResult > obesityWeight) {
			System.out.println("비만입니다.");
		} else if(bmiResult > overWeight) {
			System.out.println("과체중입니다.");
		} else if(bmiResult > normalWeight) {
			System.out.println("정상체중입니다.");
		} else{
			System.out.println("저체중입니다.");
		}		
	}

	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}

	public void setNormalWeight(double normalWeight) {
		this.normalWeight = normalWeight;
	}

	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}

	public void setObesityWeight(double obesityWeight) {
		this.obesityWeight = obesityWeight;
	}
	
}
