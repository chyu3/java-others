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
	
	public static double mean(double[] m) 
	{
		double sum = 0;
        for (int i = 0; i < m.length; i++) 
        {
			sum += m[i];
		}
		return sum / m.length;
	}
	
	// the array double[] m MUST BE SORTED
    public static double median(double[] m) 
    {
        int middle = m.length/2;
        if (m.length%2 == 1) 
        {
            return m[middle];
        } 
        else 
        {
        return (m[middle-1] + m[middle]) / 2.0;
        }
    }


	public static void main (String[] args) {
		
	}
}

