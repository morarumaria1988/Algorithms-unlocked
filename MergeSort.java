import java.util.*;

 // Compiler version JDK 11.0.2

 class MergeSort
 {
   
   public static void main(String args[])
   {    
    char[] letters = { 'a', 'b', 'c', 'd', 'c' };
    int n = letters.length;
    int p = 0;
    int r = n - 1;
    MergeSort ex = new MergeSort();
    System.out.println(ex.r(letters, p, r));
  }
  
 void mS(char[] A, int p, int r) {   
   if (p >= r) return;
   int q = (p + r)/2;
   mS(A[], p, q);
   mS(A[], q + 1, r);
   Merge(A[], p, q, r);//TODO 
  }
  }