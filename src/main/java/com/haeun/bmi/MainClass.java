package com.haeun.bmi;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

   public static void main(String[] args) {
     
      
      String config = "classpath:applicationCTX.xml";
      AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);   // °´Ã¼ »ý¼º
      MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
      //bean id, Å¬·¡½º
      
      myInfo.getMyInfo();
      
      
      ctx.close(); // »ç¿ë ÈÄ ´Ý¾ÆÁà¾ßÇÔ
   }

}