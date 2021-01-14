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
		
		int[] a =  {452468, 835242, 153705,
			779817, 136764, 296899, 38386, 569072,
			768459, 574370, 399955, 841795, 506993};
			
		int[] b = {379575, 151871, 818818,
			766349, 116232, 828771, 209784, 515869,
			292162, 881115, 864593, 205104, 57092};
		
		int[] c = new int[size];
		
		for (int i = 0; i < size; i++)
		{
			c[i] = a[i] + b[i];
			System.out.println(c[i]);
		}
		
	}
}

