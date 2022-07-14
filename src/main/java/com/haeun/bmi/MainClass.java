package com.haeun.bmi;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

   public static void main(String[] args) {
     
      
      String config = "classpath:applicationCTX.xml";
      //Container 파일 불러오기
      AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);   // 객체 생성
      MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);	//bean 조회(객체 얻어오기)
      //bean id, 클래스
      
      myInfo.getMyInfo();	 //MyInfo 클래스의 getMyInfo() 호출(실행)
      
      ctx.close(); // 사용 후 닫아줘야함
   }

}