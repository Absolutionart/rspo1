package org.javacourse.hw2;
import java.util.*;
public abstract class TAbCls {
public void displayArray(int[] arr)
{
	for(int i=0;i<arr.length;i++)System.out.print(arr[i]+"\t");
}
public void newLine()
{
	System.out.print("\n");
}
public void inputData(int[] arr)
{
	Scanner input=new Scanner(System.in);
	for(int i=0;i<arr.length;i++)arr[i]=input.nextInt();
}
public void sort(int[] arr)
{
	int i,j,var;
	for(i=0;i<arr.length-1;i++)
	{
		for(j=i+1;j<arr.length;j++)
		{
			if(arr[j]<arr[i])
			{
				var=arr[i];arr[i]=arr[j];arr[j]=var;
			}
		}
	}
}
public abstract void inputData();
public abstract void sort();
public abstract void reverse(int[] arr);
public abstract void separate(int[] arr);
public abstract void reverse();
public abstract void separate();
}
