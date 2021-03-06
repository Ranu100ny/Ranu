/******************************************************************************
 *  
 *  Purpose : Maintain Clinique Management System And Perform Many Operation like
 *            Add Doctor(),Add Patient(),Take Appointment(),Display(),Search().
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.oop;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.CliniqueManagementOperation;
import com.bridgelabz.utility.Utility;

public class CliniqueManagement {
	public static void main(String[] args) throws IOException, ParseException {
		CliniqueManagementOperation action = new CliniqueManagementOperation();
		Utility utility = new Utility();
		char input = ' ';
		do {

			System.out.print("\n\n\n\n\t\t\t\t    Clinique Management System ");
			System.out.print("\n\t\t\t\t-----------------------------------");
			System.out.print("\n\t\t\t\t    Add   Doctor      : Enter 1");
			System.out.print("\n\t\t\t\t    Add   Patient     : Enter 2");
			System.out.print("\n\t\t\t\t    Take  Appointment : Enter 3");
			System.out.print("\n\t\t\t\t    Display Doctor    : Enter 4");
			System.out.print("\n\t\t\t\t    Display Patient   : Enter 5");
			System.out.print("\n\t\t\t\t    Search Both       : Enter 6");

			System.out.print("\n\t\t\t\t------------------------------------\n");

			System.out.print("\n\t\t\t\t \t  Enter Choice : ");
			int choice = utility.inputInteger();

			switch (choice) {
			case 1:
				action.addDocotor();
				break;

			case 2:
				action.addPatient();
				break;

			case 3:
				action.takeAppointment();
				break;

			case 4:
				action.displayDoctor();
				break;

			case 5:
				action.displayPatient();
				break;

			case 6:
				action.search();
				break;

			default:
				System.out.println("\n\t\t\t\tInvalid Choice...!");
			}
			System.out.println();
			System.out.print("\n\t\t\t\t   Do you Want to continue (Y/N) : ");
			input = utility.inputCharacter();
		} while (input == 'Y' || input == 'y');
	}
}
