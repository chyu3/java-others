/*
 * Datatypes.java
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
import java.io.*;
import java.util.*;

public class Datatypes {
	
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int t = in.nextInt(); in.nextLine();
		
		for (int a = 0; a < t; a++)
		{
			String s = in.nextLine();
			List<String> types = new ArrayList<String>();
			try
			{
				long e = Long.parseLong(s);
				types.add("long");
				int d = Integer.parseInt(s);
				types.add("int");
				short c = Short.parseShort(s);
				types.add("short");
				byte b = Byte.parseByte(s);
				types.add("byte");
				if (s.equals("1") || s.equals("0")) types.add("boolean");
			}
			catch(NumberFormatException exc)
			{
				
			}
			
			finally
			{
				if (types.size() == 0) 
				System.out.println(s + " can't be fitted anywhere.");
				
				else
				{
					System.out.println(s + " can be fitted in: ");
					for (int i = types.size()-1; i >= 0; i--) 
					{
						System.out.println("* " + types.get(i));
					}
				}
			}
		}
	}
}
