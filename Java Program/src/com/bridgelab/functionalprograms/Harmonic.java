/******************************************************************************
 *  
 *  Purpose : To take user Input and Determine harmonicValue    
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.functionalprograms;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class Harmonic 
{
 public static void main(String[] args)
 {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter a Number : ");
  float realNumber=scanner.nextFloat();
  float value=Utility.harmonicValue(realNumber);
  scanner.close();
  if(value!=0)
  {
   System.out.println("The Harmonic Value is: "+value);
  }
  else
  {
   System.out.println("Invalid Input...!");
  }
 } 	
}
