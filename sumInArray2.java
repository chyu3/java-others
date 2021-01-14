/*
 * sumInArray2.java
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
import java.util.Arrays;


public class sumInArray2 {
	
	public static void main(String[] args) {
		int size = 13;
		
		int[] a = new int [] {548894, 929767, 87624,
			680557, 448884, 676030, 608961, 151515,
			385345, 490561, 249023, 982769, 511194};
			
		int[] b = new int [] {806281, 699176, 632027,
			789205, 437229, 650272, 590308, 800053,
			816704, 837730, 257884, 985655, 621879};
		
		int[] c = new int[size];
		
		for (int i = 0; i < size; i++)
		{
			c[i] = a[1] + b[1];
		}
		System.out.println(c);
	}
}

