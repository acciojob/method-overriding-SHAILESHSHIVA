package com.driver;

public class Main {

   private static class A{

        String meth(){
            return "Invoking method from class A";
        }
    }

    private static class B extends A{

        @Override
        String meth() {
            return "Method is overridenden in Extended class B";
        }
    }

    public static void main(String[]args){

        B b = new B();
        System.out.print(b.meth());


    }
  
}



