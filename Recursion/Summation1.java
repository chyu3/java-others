/*
 * recursive.java
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

// adding up between two set numbers
public class Summation1 {
	
	public static void main (String[] args) {
		int s = sum(1, 3);
		System.out.println(s);
	}
	public static int sum(int a, int b)
	{
		if (b > a)
		{
			return b + sum(a, b - 1); //3+ (1, 2)+ 2 (1, 1) + 1
		}
		else
		{
			return b;
		}
	}
}

