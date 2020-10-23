/*
 * CodingameTemperature1.java
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
import java.util.*;
import java.io.*;
import java.math.*;

public class CodingameTemperature1 {
	
	public static void main (String[] args) {
		int positiveMin = 10000;
		int negativeMin = -10000;
		
		int solution;
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if ( n == 0 )
		{
			solution = 0;
		}
		else 
		{
			for (int i = 0; i < n; i++)
			{
				int t = in.nextInt();
				if ( t >= 0 && t < positiveMin)
				{
					positiveMin = t;
				}
				else if ( t < 0 && t > negativeMin)
				{
					negativeMin = t;
				}
			}
			
			solution = (positiveMin > -negativeMin) ? negativeMin : positiveMin;
		}
		System.out.println(solution);
	}
}

