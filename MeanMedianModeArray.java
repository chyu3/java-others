/*
 * MeanMedianModeArray.java
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


public class MeanMedianModeArray {
	
	public static double findMean(double[] a)
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++)
		{
			sum += a[i];
		}
		return sum / a.length;
	}
	
    public static int findMedian(int[] a)
    {
        
    }
    
    public static int findMode(int[] a)
    {
		
    }


	public static void main (String[] args) {
		double[] array = {7, 7, 7, 8, 8, 4};
		findMean(array);
		
	}
}

