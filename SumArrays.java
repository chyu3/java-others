/*
 * SumArrays.java
 * 
 * Copyright 2021 Tina Chen <ChenTina@10-72-120-211.wifi.8.s.pas.ofs.edu.sg>
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
import java.util.Random;

public class SumArrays {
	
	public static void main (String[] args) {
		Random r = new Random();
		int size = 10;
		
		int[] a = new int[size];
		int[] b = new int[size];
		int[] sum = new int[size];
		
		for (int i = 0; i < size; i++)
		{
			a[i] = r.nextInt(6) + 1;
			b[i] = r.nextInt(6) + 1;
			sum[i] = a[i] + b[i];
			System.out.println("For trial " + i + ": a =" + a[i] + "; b =" + b[i] + "; sum =" + sum[i]);
		}
	}
}

