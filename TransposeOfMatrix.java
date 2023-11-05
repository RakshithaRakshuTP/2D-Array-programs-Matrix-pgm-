package com.Section3Programming.pack;
import java.util.Scanner;
//@Author:: Rakshitha.T.P
public class TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] m=new int[3][3];
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the matrix elements for 3X3 matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				m[i][j]=ob.nextInt();
			}
		}
		int [][] transpose=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				transpose[i][j]=m[j][i];
			}
		}
		System.out.println("Matrix befor");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix after transpose");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
//OUTPUT::
//enter the matrix elements for 3X3 matrix
//1 2 3
//4 5 6
//7 8 9
//Matrix befor
//1 2 3 
//4 5 6 
//7 8 9 
//Matrix after transpose
//1 4 7 
//2 5 8 
//3 6 9 
