package lab5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.HashMap;

import java.util.StringTokenizer;


public class Main {

  public static HashMap<String,Integer> res = new HashMap<String, Integer>();

  public static void main(String[] args) {
    try {
      File f = new File("src/lab5/Test.java");
      BufferedReader b = new BufferedReader(new FileReader(f));
      String readLine = "";
      while ((readLine = b.readLine()) != null) {
        System.out.println(readLine);
        parse(readLine);
      }
      System.out.println(res);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void parse(String a)
  {
    StringTokenizer line = new StringTokenizer(a);
    while(line.hasMoreTokens())
    {
      String word = line.nextToken();

      if(res.containsKey(word))
      {
        int t = res.get(word)+ 1;
        res.put(word,t);
      }else{
        res.put(word, 1);
      }
    }
  }

}
