package org.job.exam;

/*
 * 
 * 
 */

import java.util.Scanner;

public class No_11{  
//    private static int n=3, m=5;  
//    private static boolean[][] flagArr;  
//    private static char[][] array= {{'A','B','C','D','E'},{'E','F','G','H','U'},{'A','B','S','D','F'}};  
//    private static boolean isFound;  
    private static int n, m;  
    private static boolean[][] flagArr;  
    private static char[][] array;  
    private static boolean isFound;  
      
    public static void main(String args[]){  
        Scanner cin = new Scanner(System.in);  
        String word;  
        while (cin.hasNext()){  
            n = cin.nextInt();  
            m = cin.nextInt();  
            array = new char[n][m];  
            word = cin.next();  
            isFound = false;  
            for(int i=0; i<n; i++) {  
                array[i] = cin.next().toCharArray();  
            }  
            flagArr = new boolean[n][m];  
            for(int i=0; i<n; i++) {  
                for(int j=0; j<m; j++){  
                    flagArr[i][j] = false;  
                }  
            }  
              
            findWord(word);  
              
            if(isFound) {  
                System.out.println("YES");  
            } else {  
                System.out.println("NO");  
            }  
        }  
    }  
  
    private static void findWord(String word) {  
        for(int i=0; i<n; i++)   
            for(int j=0; j<m; j++) {  
                if(array[i][j] == word.charAt(0)) {  
                    flagArr[i][j] = true;  
                    findNext(word, 1, i, j);  
                    if(isFound)  
                        return ;  
                    else  
                        flagArr[i][j] = false;  
                }  
            }  
    }  
  
    private static void findNext(String word, int index, int x, int y) {  
        if(index == word.length()) {   
            isFound = true;  
            return ;  
        } else if(index < word.length()){  
            int nextIndex = index + 1;  
            //up  
            if ((x-1)>=0 && (!flagArr[x-1][y]) && array[x-1][y]==word.charAt(index)) {  
                flagArr[x-1][y] = true;  
                findNext(word, nextIndex, x-1, y);  
            }  
            //right  
            if((y+1)<m && (!flagArr[x][y+1]) && array[x][y+1]==word.charAt(index)) {  
                flagArr[x][y+1] = true;  
                findNext(word, nextIndex, x, y+1);  
            }  
            //dowm  
            if ((x+1)<n && (!flagArr[x+1][y]) && array[x+1][y]==word.charAt(index)) {  
                flagArr[x+1][y] = true;  
                findNext(word, nextIndex, x+1, y);  
            }  
            //left  
            if((y-1)>0 && (!flagArr[x][y-1]) && array[x][y-1]==word.charAt(index)) {  
                flagArr[x][y-1] = true;  
                findNext(word, nextIndex, x, y-1);  
            }  
            flagArr[x][y] = false;  
        }  
    }  
      
}  

