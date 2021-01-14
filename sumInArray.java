/*
 * sumInArray.java
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


public class sumInArray {
	
	public static void main(String[] args) {  
        int [] arr = new int [] {1194, 319, 514, 1085, 623, 836,
		717, 570, 1259, 804, 273, 1258, 1173, 498, 1280, 968, 584,
		503, 693, 628, 658, 1090, 336, 508, 1068, 910, 304, 874, 643,
		799, 845, 536, 1109, 58, 321, 431, 885, 1028, 992, 843, 532, 1256, 
		801, 404, 453, 781, 71, 1027, 1274, 755};  
        int sum = 0;  
        
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }  
        System.out.println("Sum of all the elements of an array: " + sum);  
        
        //or ----------------------------------------------------------------
        int[] n = {1194, 319, 514, 1085, 623, 836,
		717, 570, 1259, 804, 273, 1258, 1173, 498, 1280, 968, 584,
		503, 693, 628, 658, 1090, 336, 508, 1068, 910, 304, 874, 643,
		799, 845, 536, 1109, 58, 321, 431, 885, 1028, 992, 843, 532, 1256, 
		801, 404, 453, 781, 71, 1027, 1274, 755};
        //int sum = 0;
        for (int i : n)
        {
            sum += i;
        }
        System.out.println(sum);
    }  
}

