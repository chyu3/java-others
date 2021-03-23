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
import java.util.Arrays;

public class MeanMedianModeArray {
	
	public static double findMean(int[] a, int n)
	{
		int sum = 0;
		for (int i = 0; i < n; i++)
		{
			sum += a[i];
		}
		return (double)sum / (double)n; //allows finale average in double/with decimals
	}
	
	public static double findMedian(int[] a, int n) //find central of the array
	{
		Arrays.sort(a); //sort elements of an array in order
		
		if (n % 2 != 0) //check if array has even number of elements
		return (double) a [n / 2];
		
		return (double) (a [ (n-1) / 2 ] + a[n/2] ) / 2.0;
	}
	
	public static double findMode(int[] a, int n)
	{
	    int maxValue = 0, maxCount = 0, i, j;

        for (i = 0; i < n; ++i) 
        {
            int count = 0;
            for (j = 0; j < n; ++j) 
            {
                if (a[j] == a[i])
                ++count;
            }

            if (count > maxCount) 
            {
                maxCount = count;
                maxValue = a[i];
            }
        }
        return maxValue;
	}
	
	public static void main (String[] args) {
		int[] array = {16, 21, 23, 7, 18, 27, 99, 67, 99};
		int n = array.length;  //number of elements
		
		System.out.println("Mean of your numbers are: " + findMean(array, n));
		System.out.println("Median of your numbers are: " + findMedian(array, n));
		System.out.println("Mode of your numbers are: " + findMode(array, n));
	}
}

