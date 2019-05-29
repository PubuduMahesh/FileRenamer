package com.excample.filerename;

import java.io.File;

public class FileRename {
	
	public static void main(String []arg)
	{
		File f = new File("D:\\Temp\\renamedFile.txt");
		try
		{
			if(f.renameTo(new File("D:\\Temp\\done.txt")))
			{
				System.out.println("Successfully done.");
			}
			else
			{
				System.out.println("failed");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}		
		
	}
}
