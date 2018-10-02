/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numanaly;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author James Gagnon
 */
public class NumAnaly {
static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
  System.out.println("Enter an initial estimate  for X - enter fractions as decimal values.");
  double x = input.nextDouble();
  
  System.out.println("Function Menu: 1- Square Roots.   2-Exercise 1-9      3- HW 2 Q1     4-Rt3");
  int choice = input.nextInt();
  if(choice==1){
      System.out.println(SQRT(x));
  }
  if(choice==2){
      x=Ex1_9(x);
  }
    if(choice==3){
        System.out.println("Enter (a,b) endpoints");
        double y;
        x = input.nextDouble();
        y = input.nextDouble();
      bisectRt2(x,y);
  }
     if(choice==4){
            System.out.println("Enter (a,b) endpoints");
        double y;
        x = input.nextDouble();
        y = input.nextDouble();
      bisectRt3(x,y);
     }
     
          if(choice==5){
            System.out.println("Enter (a,b) endpoints");
        double y;
        x = input.nextDouble();
        y = input.nextDouble();
      bisectX3(x,y);
     }
            if(choice==6){
      System.out.println(ex(x));
  }
}
    

    public static double bisectX3(double a, double b){
        double tolerance, midpoint, tempA,tempB;
       // System.out.println("Enter desired tolerance in decimal form.");
        tolerance = (double)(1)/(10*10*10*10*10*10*10*10);
        System.out.println("Tolerance is "+ tolerance);
        midpoint = ((a+b)/2);
    for(int i = 0; i <30; i++){
        tempA = midpoint;
        System.out.print("Iteration: "+i+" ");
        midpoint = ((a+b)/2);
         if(Math.signum((a*a*a)-a-1)== Math.signum((midpoint*midpoint*midpoint)-midpoint-1)){   //If sign f(midpoint) == sign f(a) (a=c), else (b = c)
         a = midpoint;
         System.out.println("A is new midpoint at: "+a);
       
       }
       else {
           b = midpoint;
        System.out.println("B is new midpoint at: "+b);
         }
         if((Math.abs(midpoint-tempA)) < tolerance){
            System.out.print("Within Tolerance ");
         }
       System.out.println("Error: "+Math.abs(midpoint-tempA));
    }
        return a;
    }
        public static double bisectRt3(double a, double b){
        double tolerance, midpoint, tempA,tempB;
       // System.out.println("Enter desired tolerance in decimal form.");
        tolerance = (double)(1)/(10*10*10*10*10);
        System.out.println("Tolerance is "+ tolerance);
        midpoint = ((a+b)/2);
    for(int i = 0; i <14; i++){
        System.out.print("Iteration: "+i+" ");
        midpoint = ((a+b)/2);
         if(Math.signum((a*a)-3)== Math.signum((midpoint*midpoint)-3)){   //If sign f(midpoint) == sign f(a) (a=c), else (b = c)
         a = midpoint;
         System.out.println("A is new midpoint at: "+a);
       
       }
       else {
           b = midpoint;
        System.out.println("B is new midpoint at: "+b);
         }
         if((Math.abs(midpoint-Math.sqrt(3))) < tolerance){
            System.out.print("Within Tolerance ");
         }
       System.out.println("Error: "+Math.abs(midpoint-Math.sqrt(3)));
    }
        return a;
    }
    
    
    
    
    public static double bisectRt2(double a, double b){
        double tolerance, midpoint, tempA,tempB;
//        System.out.println("Enter desired tolerance in decimal form.");
//        tolerance = input.nextDouble();
        midpoint = ((a+b)/2);
    for(int i = 0; i <30; i++){
        System.out.print("Iteration: "+i+" ");
        midpoint = ((a+b)/2);
         if(Math.signum((a*a)-2)== Math.signum((midpoint*midpoint)-2)){   //If sign f(midpoint) == sign f(a) (a=c), else (b = c)
         a = midpoint;
        // System.out.println("A is new midpoint at: "+a);
       
       }
       else {
           b = midpoint;
       // System.out.println("B is new midpoint at: "+b);
         }
        // if((Math.abs(midpoint-Math.sqrt(2))) < tolerance){
          //   System.out.print("Within Tolerance ");
        // }
       System.out.println("Error: "+Math.abs(midpoint-Math.sqrt(2)));
    }
        return a;
    }
    public static double SQRT(double root){
     double SQRT = root;
     for(int i = 0; i < 50; i++){
         SQRT = (.5*(SQRT+(root/SQRT)));
     }
     return SQRT;   
    }
    
        public static double ex(double root){
     double SQRT = root;
     for(int i = 0; i < 30; i++){
         double fx = ((SQRT*SQRT*SQRT)-(2*SQRT)-5);
         double fp = (3*(SQRT*SQRT)-2);
         SQRT = (SQRT-(fx/fp));
       
             System.out.print("ITERATION  "+i + " ");
         
         System.out.println(SQRT);
     }
     return SQRT; 
    }
    public static double Ex1_9(double root){
     System.out.println("Enter a value for K - enter fractions as decimal values.");
     double k = input.nextDouble();
     double test = root;
     System.out.println("Iteration:        Value:");
     for(int i = 0; i < 10; i++){
         test = (1.5*test-(.5*k*(test*test*test)));
         System.out.println(i + "                 "+ test);
     } 
     return test;   
    }
}
