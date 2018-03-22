package com.bridgelab.oop;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelab.utility.StockOperation;
import com.bridgelab.utility.Utility;

public class StockAccount {

	public static void main(String[] args) throws IOException, ParseException {
		  StockOperation stock=new StockOperation();
		  Utility utility=new Utility();
		  char input=' ';
		  do
		  {

		  	System.out.print("\n\n\n\n\t\t\t\t    S T O C K-A C C O U N T");
		  	System.out.print("\n\t\t\t\t------------------------------");

		  	System.out.print("\n\t\t\t\tCreate  User Account : Enter 1");
		  	System.out.print("\n\t\t\t\tBuy     the Share    : Enter 2");
		  	System.out.print("\n\t\t\t\tSell    the Share    : Enter 3");
		  	System.out.print("\n\t\t\t\tDisplay Report       : Enter 4");

		  	System.out.print("\n\t\t\t\t------------------------------\n");

		  	
		  	System.out.print("\n\t\t\t\tEnter Choice : ");
		    int choice=utility.inputInteger();

		   switch (choice)
		   {
		     case 1 : stock.createUser();
		    	      break;
		     
		     case 2 : stock.buy();
		              break;
		              
		     case 3 : stock.sell();
		              break;
		              
		     case 4 : stock.dispalyReport();
		              break;
		              
		    default : System.out.println("\n\t\t\t\tInvalid Choice...!");		       
		   }
		   System.out.print("\n\t\t\t\tDo you Want to continue (Y/N) : ");
		   input=utility.inputCharacter();
		  }while(input=='Y' || input=='y');
		 }
		}
