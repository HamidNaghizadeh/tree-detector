package com.hamidnagizadeh;

public class TreeDetectHelper {
  private static int getLastRoot(int[] nodes){
    int lastRoot=1;
    if (nodes.length>=4) {
      if (nodes.length % 2 == 0) {
        lastRoot = nodes.length - 4;
      } else {
        lastRoot = nodes.length - 4;
      }
    }
    return lastRoot;
  }


  public static boolean isBst(int[] nodes){
    for(int i=1;i<nodes.length;i++){
      if(nodes[i]==0){break;}
      if (nodes[i]<nodes[i-1]){
        return false;
      }
    }
    return true;
  }


  public static boolean isMaxHeap(int[] nodes){
    int lastRoot=getLastRoot(nodes);
    for (int i=1;i<=lastRoot;i++){
      if(nodes[i]==0){break;}
      if (nodes[i] < nodes[2 * i]) {
        return false;
      }
      if (nodes.length%2==0) {
        if (nodes[2 * i + 1] != 0) {
          if (nodes[i] < nodes[2 * i + 1]) {
            return false;
          }
        }
      }
    }
    return true;
  }


  public static boolean isMinHeap(int[] nodes){
    int lastRoot=getLastRoot(nodes);
    for (int i=1;i<=lastRoot;i++){
      if(nodes[i]==0){ break;}
      if (nodes[i] > nodes[2 * i]) {
        return false;
      }
      if (nodes.length%2==0) {
        if (nodes[2 * i + 1] != 0) {
          if (nodes[i] > nodes[2 * i + 1]) {
            return false;
          }
        }
      }
    }
    return true;
  }

}
