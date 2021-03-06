/******************************************************************************
 *  
 *  Purpose : Determine Parentheses is balanced or not.    
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.dsaprograms;

import com.bridgelabz.utility.StackListForBalanceParentheses;
import com.bridgelabz.utility.Utility;

public class BalancedParentheses {
	public static void main(String[] args) {
		Utility utility = new Utility();
		StackListForBalanceParentheses stack = new StackListForBalanceParentheses();
		String expresion;
		System.out.print("\nEnter the expression     : ");
		expresion = utility.inputString();
		boolean err = false;
		int i = 0;
		int pos = 0;
		for (char c : expresion.toCharArray()) {
			if (c == '[' || c == '{' || c == '(') {
				stack.push(c, i);
			} else if (c == ']' || c == '}' || c == ')') {
				if (!stack.isEmpty()) {
					pos = stack.getTop().getPosition();
				}
				char x = stack.pop();
				if (x == ' ')
					err = true;

				if (c == ']') {
					if (x != '[') {
						err = true;
						break;
					}
				} else if (c == ')') {
					if (x != '(') {
						err = true;
						break;
					}
				} else {
					if (x != '{') {
						err = true;
						break;
					}
				}
			}
			i++;
		}

		if (err || !stack.isEmpty()) {
			System.out.print("\nExpression Not Balanced -> ");
			for (int j = pos; j > 0; j--)
				System.out.print(' ');
			System.out.print('^');
			i = i - pos - 1;
			while (i-- > 0)
				System.out.print(' ');
			System.out.println('^');
		} else
			System.out.println("\nExpression is Balanced");
	}
}
