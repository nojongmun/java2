package com.ict.day03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex03 {
	public static void main(String[] args) {
		File file = new File("c:/study/util/k.txt");
        FileReader fr = null;
        BufferedReader br = null;
		try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String msg = null;
            StringBuffer sb = new StringBuffer();
            while((msg = br.readLine()) != null) {
            	sb.append(msg+"\n");
            }
            System.out.println(sb.toString());
		} catch (Exception e) {
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
			}
		}		
	}
}
