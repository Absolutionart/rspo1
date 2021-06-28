package org.javacourse.hw2;

public class HW2App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TAbClsImpl ab=new TAbClsImpl(3);
       ab.inputData();
       ab.displayArray(ab.getNumbers());
       ab.newLine();
       ab.sort();
       ab.displayArray(ab.getNumbers());
       ab.newLine();
       ab.separate();
       ab.reverse();
       ab.displayArray(ab.getOdds());
       ab.displayArray(ab.getEvens());
       ab.newLine();
      
	}

}
