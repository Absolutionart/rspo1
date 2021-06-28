package org.javacourse.hw2;

import java.util.Scanner;

public class TAbClsImpl extends TAbCls
{
private int N;
private int[] odds;
private int[] evens;
private int[] numbers;
private final int dim=10;

	public TAbClsImpl() {
	super();
	this.odds=new int[this.dim];
	this.evens=new int[this.dim];
	this.numbers=new int[2*this.dim];
	// TODO Auto-generated constructor stub
}

	public TAbClsImpl(int n) {
		super();
		N = n;
		this.odds=new int[this.N];
		this.evens=new int[this.N];
		this.numbers=new int[2*this.N];
	}

	public int getN() {
		return N;
	}

	public void setN(int n) {
		N = n;
	}

	public int[] getOdds() {
		return odds;
	}

	public void setOdds(int[] odds) {
		this.odds = odds;
	}

	public int[] getEvens() {
		return evens;
	}

	public void setEvens(int[] evens) {
		this.evens = evens;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public int getDim() {
		return dim;
	}

	@Override
	public void reverse(int[] arr) {
		// TODO Auto-generated method stub
		int var,bnd,i,j;
		bnd=arr.length/2;
		for(i=0;i<bnd;i++)
		{
			j=arr.length-1-i;
			var=arr[i];arr[j]=arr[i];arr[j]=var;
		}
	}

	@Override
	public void separate(int[] arr) {
		// TODO Auto-generated method stub
		int i=0,j=0,k;
		for(k=0;k<arr.length;k++)
		{
			if(arr[k]%2!=0)this.odds[i++]=arr[k];
			else this.evens[j++]=arr[k];
		}
		
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		int var,bnd,i,j;
		bnd=this.N/2;
		for(i=0;i<bnd;i++)
		{
			j=this.N-1-i;
			var=this.odds[i];this.odds[i]=this.odds[j];this.odds[j]=var;
		}
		
	}

	@Override
	public void separate() {
		// TODO Auto-generated method stub
		int i=0,j=0,k;
		for(k=0;k<this.numbers.length;k++)
		{
			if(this.numbers[k]%2!=0)this.odds[i++]=this.numbers[k];
			else this.evens[j++]=this.numbers[k];
		}
		
	}

	@Override
	public void inputData() {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		for(int i=0;i<this.numbers.length;i++)
		{
			System.out.print("Input "+(i+1)+"th number:");
			this.numbers[i]=input.nextInt();	
		}
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		int i,j,var;
		for(i=0;i<this.numbers.length-1;i++)
		{
			for(j=i+1;j<this.numbers.length;j++)
			{
				if(this.numbers[j]<this.numbers[i])
				{
					var=this.numbers[i];this.numbers[i]=this.numbers[j];this.numbers[j]=var;
				}
			}
		}	
		
	}
	
    
}
