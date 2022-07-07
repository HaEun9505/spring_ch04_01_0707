package com.haeun.bmi;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

   public static void main(String[] args) {
     
      
      String config = "classpath:applicationCTX.xml";
      AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);   // ��ü ����
      MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
      //bean id, Ŭ����
      
      myInfo.getMyInfo();
      
      
      ctx.close(); // ��� �� �ݾ������
   }

}