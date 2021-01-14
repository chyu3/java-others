/*
 * AddArrayAddElement.java
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
import java.io.*;
import java.util.*;

public class AddArrayAddElement {
	
	public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      int[] array = new int[3];
      int sum = 0;
      
      System.out.println("Enter the elements:");
      
      for (int i=0; i<3; i++)
      {
    	  array[i] = scanner.nextInt();
      }
      for( int num : array) {
          sum = sum + num;
      }
      
      System.out.println("Sum of array elements is:"+sum);
   }
}

