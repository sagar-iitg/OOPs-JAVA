package com.sagar.codepoints;

public class Main {
  public static void main(String[] argv) {
    int[] bytes = new int[] { 65, 1, 67, 68 };
    System.out.println(new String(bytes, 1, 2));

  }
}