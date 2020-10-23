/*
 * Break&Continue.java
 * 
 * Copyright 2020 Tina Chen <ChenTina@10-72-120-211.wifi.8.s.pas.ofs.edu.sg>
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


public class BreakContinue{
	
	public static void main (String[] args) {
		for ( int i = 0; i < 10; i++) //Break, Stops at the given number
		{
			if ( i == 4 ) //jumps out of loop when i = 4
			{
				break; 
			}
			System.out.println(i); //result: 0,1,2,3
		}
		
		for ( int i = 0; i < 10; i++) //Continue, skips the given number
		{
			if ( i == 4) //Start from 0, skips 4 and continue to the 10th
			{
				continue;
			}
			System.out.println(i); //result: 0,1,2,3,5,6,7,8,9
		}
		
		//break and continue in while loop
		int i = 0; 
		while ( i < 10 )
		{
			System.out.println(i); //result: 0,1,2,3
			i++;
			if (i == 4) //break
			{
				break;
			}
			
			if (i == 4) //continue
			{
				i++;
				continue;
			}
			System.out.println(i); //result: 0,1,2,3,5,6,7,8,9
			i++;
		}
	}
}

