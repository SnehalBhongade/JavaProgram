package com.star.model;
/*
 *******
   ***
    *
 */
public class D {

	public static void main(String[] args) {
		
		for(int i=3; i<=0; i--)
		{
			for(int j=3; j>=i; j--)
			{
				System.out.print("*");
			}
			for(int k=3; k>=2*i-1; k--)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
