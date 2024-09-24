package com.example.project;

import java.io.*;

public class TestHello {

   
   public void testHelloWorld()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     Hello.main(null);

     // assertion
     assertEquals("Hello world!\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }

private void assertEquals(String string, String string2) {
	// TODO Auto-generated method stub
	
}
}
