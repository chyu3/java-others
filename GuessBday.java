/*
 * GuessBday.java
 * 
 * Copyright 2021 Frank <Frank@FRANK-PC>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
 import java.util.Scanner

public class GuessBday {
	
	public static void main (String[] args) {
		String set1 = 
		"1 3 5 7 \n" +
		"9 11 13 15\n" +
		"17 19 21 23\n" +
		"25 27 29 31";
		
		String set2 =
		"2 3 6 7\n" +
		"10 11 14 15\n" +
		"18 19 22 23\n" +
		"26 27 30 31";
		
		String set3 = 
		"4 5 6 7\n" +
		"12 13 14 15\n" +
		"20 21 22 23\n" +
		"28 29 30 31";
		
		String set4 =
		"8 9 10 11\n" +
		"12 13 14 15\n" +
		"24 25 26 27\n" +
		"28 29 30 31";
		
		String set5 = 
		"16 17 18 19\n" +
		"20 21 22 23\n" +
		"24 25 26 27\n" +
		"28 29 30 31";
		
		//----------------------------------------------
		int day = 0;
		
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//prompt the user to answer questions
		System.out.println("Is your brithday in set1?\n");
		System.out.println(set1);
	}
}

