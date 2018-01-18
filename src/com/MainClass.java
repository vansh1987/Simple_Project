package com;

public class MainClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Console c = new Console();
		//c.showMenu();
		//System.out.println("Test");
		Connection d = new Connection();
		d.connectionSql();
		d.createTable();
		Console c = new Console();
		c.showMenu();

	}

}
