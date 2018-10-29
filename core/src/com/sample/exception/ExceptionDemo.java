package com.sample.exception;

import com.sample.Main;

public class ExceptionDemo implements  Runnable{
    static public void testChecked() throws TestExceptionHandler.CheckedExceptionDemo {
        boolean x = true;
        if( x  ){
            throw new TestExceptionHandler.CheckedExceptionDemo("FUCK WTF IS HAPPENING");
        } else {
            System.out.println("WTF?");
        }
    }


    static public void testUnChecked()  {
        boolean x = true;
        if( x  ){
            throw new TestExceptionHandler.UncheckedExceptionDemo("FUCK WTF IS HAPPENING");
        } else {
            System.out.println("WTF?");
        }
    }

    @Override
    public void run() {
        testUnChecked();
        //ERROR BECAUSE OF CHECKED EXCEPTION
        try {
            testChecked();
        } catch (TestExceptionHandler.CheckedExceptionDemo checkedExceptionDemo) {
            checkedExceptionDemo.printStackTrace();
        }
    }



    static class TestExceptionHandler {

        static class CheckedExceptionDemo extends Exception {
            public CheckedExceptionDemo(String message){
                super(message);
            }
        }

        static class UncheckedExceptionDemo extends RuntimeException {
            public UncheckedExceptionDemo(String message){
                super(message);
            }
        }
    }
}
