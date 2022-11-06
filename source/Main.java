package com.hamidnagizadeh;


import java.util.Scanner;

public class Main {
  // some colors ANSI code to use changing console text color
  private static final String RED_BOLD = "\033[1;31m";    // RED
  private static final String GREEN_BOLD = "\033[1;32m";  // GREEN
  private static final String RESET = "\033[0m";  // Text Reset
  private static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW


  public static void main(String[] args) {

    while (true) {
      String isBst = RED_BOLD + "Tree isn't Bst" + RESET;
      String isMaxHeap = RED_BOLD + "Tree isn't MaxHeap" + RESET;
      String isMinHeap = RED_BOLD + "Tree isn't MinHeap" + RESET;

      Scanner s = new Scanner(System.in);
      System.out.println("You want too check being : \n 1 - BST \n 2 - MaxHeap and MinHeap ");
      int selectedAct = s.nextInt();


      System.out.println("Enter your Tree's size");
      int maxSize = s.nextInt();
      int[] nodes = new int[maxSize + 1];


      if (selectedAct == 1) {
        System.out.println("Enter your Tree's Array Indices like this : \n 10 20 30 40 50 60 70 ... -100");
        System.out.println(YELLOW_BOLD + "*** Be careful you should enter inOrder Traversal of your tree. ***" + RESET);
      } else {
        System.out.println("Enter your Tree's Array Indices like this : \n 10 20 30 40 50 60 70 ...");
      }


      int inputedNode;

      for (int i = 1; i < 100; i++) {
        inputedNode = s.nextInt();
        if (inputedNode == -100) {
          break;
        }
        nodes[i] = inputedNode;
      }


      if (selectedAct == 1) {
        if (TreeDetectHelper.isBst(nodes)) {
          isBst = GREEN_BOLD + "Tree is Bst" + RESET;
        }

        System.out.println("------------------------");
        System.out.println("***  " + isBst + "  ***");
        System.out.println("------------------------");

      } else {

        if (TreeDetectHelper.isMaxHeap(nodes)) {
          isMaxHeap = GREEN_BOLD + "Tree is MaxHeap" + RESET;
        }

        if (TreeDetectHelper.isMinHeap(nodes)) {
          isMinHeap = GREEN_BOLD + "Tree is MinHeap" + RESET;
        }

        System.out.println("------------------------------");
        System.out.println("  ***  " + isMaxHeap + " ***  ");
        System.out.println("  ***  " + isMinHeap + " ***  ");
        System.out.println(" -----------------------------");
      }


    }

    }
}
