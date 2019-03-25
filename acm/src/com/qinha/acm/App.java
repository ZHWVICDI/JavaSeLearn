package com.qinha.acm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class App {
	private static final String[] COLORS = { "梅花", "黑桃", "方块", "红桃" };
	private static final String[] SYMBOLS = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	private static final Collection<Poker> POKER_COLLECTION = new ArrayList<Poker>();
	static {
		for (int i = 0; i < COLORS.length; i++) {
			for (int j = 0; j < SYMBOLS.length; j++) {
				POKER_COLLECTION.add(new Poker(COLORS[i], SYMBOLS[j]));
			}
		}
	}
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader("path"));
			bw = new BufferedWriter(new FileWriter("toPath"));
			String line = null;
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}
			bw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
