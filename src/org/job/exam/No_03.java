package org.job.exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*华为
 * 输入两个字符串，查找字符串1与字符串2最先匹配的内容，将匹配的字符串输出。
 * 字符串2支持*通配符，*代表任意个字符。字符串长度最长为128.
 *
 * 输入：abcdefabcdeg，a*f
 * 输出：abcdef
 * 
 */

public class No_03{
    public static void main(String[] args) {         
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();
        String str1 = str.substring(0, str.indexOf(","));
        String str2 = str.substring(str.indexOf(",")+1,str.length());
        char[] astr2 = str2.toCharArray();
        int location = 0;
        for(int i=0; i<str2.length(); i++){//找出通配符？在字符串2中出现的位置
            if(str2.charAt(i)=='*'){
                location = i;
            }
        }
        
        String pattern = astr2[location-1] + ".*" + astr2[location+1];
        
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str1);
        while(m.find()) { 
            System.out.println(m.group()); 
        }
    }
}

//
//改进：
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class Main{
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        in.close();
//        String str1 = str.substring(0, str.indexOf(","));
//        String str2 = str.substring(str.indexOf(",")+1,str.length());
//        char[] astr2 = str2.toCharArray();
//        
//        if (str2.contains("*")) {
//            int location = 0;
//            for(int i=0; i<str2.length(); i++){
//                if(str2.charAt(i)=='*'){
//                    location = i;
//                } 
//            }
//            
//            String pattern = astr2[location-1] + ".*" + astr2[location+1];
//            
//            Pattern r = Pattern.compile(pattern);
//            Matcher m = r.matcher(str1);
//            if(m.find()) { 
//                System.out.println(m.group(0)); 
//            }
//        } else {
//            if (str1.indexOf(str2) != -1) {
//                System.out.println(str2);
//            }
//        }
//    }
//}