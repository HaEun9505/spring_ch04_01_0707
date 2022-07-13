package com.haeun.bmi;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

   public static void main(String[] args) {
     
      
      String config = "classpath:applicationCTX.xml";
      //Container ���� �ҷ�����
      AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);   // ��ü ����
      MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);	//bean ��ȸ(��ü ������)
      //bean id, Ŭ����
      
      myInfo.getMyInfo();	 //MyInfo Ŭ������ getMyInfo() ȣ��(����)
      
      ctx.close(); // ��� �� �ݾ������
   }

}