package com.p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

//Write a java program to find the most repeated word in text file. 
//Your program should take one text file as input and find out the most repeated word in that file.
public class FileAccess {

	public static void main(String[] args) {
		String line = null;
		HashMap<String, Integer> hs = new HashMap<String, Integer>();

		File fl = new File("D://july22//t2.txt");// fl just holds the path

		try {
			FileReader fr = new FileReader(fl);
			BufferedReader br = new BufferedReader(fr);
			line = br.readLine();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(line);
		String[] sp = line.split(" ");
		
		for(String st : sp) {
			if(hs.containsKey(st)) {
				hs.put(st,hs.get(st)+1);
			}
			else {
				hs.put(st,1);
			}
		}
		System.out.println(hs);
		int maxcount=0;
		Set<String> ks = hs.keySet();
		for(String st:ks) {
			if(hs.get(st)>maxcount) {
				maxcount = hs.get(st);
			}
		}
		
		System.out.println(maxcount);
		
		
	}
}
