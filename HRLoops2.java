/*
 * H.RLoops2.java
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

class HRLoops2{
    static int getValue(int a, int b, int n)
    {
        int sum = a;
        for (int z=n; z>=0; z--)
        {
            sum = sum + ((int) Math.pow (2,z))*b;
        }
    }

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int t = 0;
        int a = 0;
        int b = 0;
        int n = 0;
        t = in.nextInt();
        for(int i=0; i<t; i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j=0; j<n; j++)
            {
                System.out.print(getValue(a,b,j)+"  ");
            }
            System.out.println();
        }
    }
}
