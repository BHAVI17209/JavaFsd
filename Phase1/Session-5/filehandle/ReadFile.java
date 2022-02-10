package com.bhavitha.filehandle;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

import java.util.Iterator;

public class ReadFile {
	
	public static List<String> readFile(String fileName)
	{
		List<String> list= Collections.emptyList();
		try {
			list=Files.readAllLines(Paths.get(fileName),StandardCharsets.UTF_8);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		List<String> result =readFile("D:\\JavaFsd\\Filedemo\\testfile2.txt");
		
		Iterator<String> it=result.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
