package azeroth.thinkinginjava;

import java.util.ArrayList;

import azeroth.Util;

/**
 * main method
 * @author chris.zhang
 *
 */
public class MainEntry {
	public static void main(String[] args) {
		Util.print("Hello,world!");
		
		ArrayList list = new ArrayList();
        for (char c = 'a'; c <= 'z'; c++) {
            list.add(c);
        }
        String str = "";
        for (int i = 0; i < 4; i++) {
            int num = (int) (Math.random() * 26);
            str = str + list.get(num);
        }
        System.out.println("ch"+str);
	}
}
