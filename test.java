/*
 * test.java
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


class ClassA 
{
	
	public void foo() 
	{
		System.out.println("Class A");
		
	}
}

/* INHERITED from ClassA 
 * can include attributes and methods
 */
class ClassB extends ClassA
{
	
	public void	bar()
	{
		System.out.println("Class B");
	}
	
}

public class test
{
	public static void main(String args[])
	{
		ClassB a = new ClassB();
		
		a.foo();
		a.bar();
	}
}
