package com.huawei.niuke;
import java.util.Scanner;
/*
 * 写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
 * 输入例子:0xA  输出例子:10
 */
public class JinzhiZhuanhuan {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	while(sc.hasNext()){
    		//System.out.println(sc.next());
    		String str=sc.next().substring(2);
    		System.out.println(Integer.parseInt(str, 16));
    	}
    }
 
}



/*
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            StringBuffer sb=new StringBuffer();
            sb.append(sc.next());
            //String str=sc.next();
            String str=sb.reverse().substring(0,sb.length()-2);
            char ch[]=str.toCharArray();
            int sum=0;
            for(int i=0;i<ch.length;i++){
                if(ch[i]>='A'&&ch[i]<='F'){
                    sum+=(Integer.valueOf(ch[i])-55)*Math.pow(16,i);
                }else {
                    sum+=(Integer.valueOf(ch[i])-48)*Math.pow(16,i);
                }
            }
            System.out.println(sum);
           // System.out.println(Integer.valueOf('6'));
        }
    }
 
}



public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
while (scanner.hasNextLine()) {
String input = scanner.nextLine();
fun(input);
}
}

public static void fun(String input) {
String subString = input.substring(2, input.length());
int result = 0;
for (int i = 0; i < subString.length(); i++) {
if (subString.charAt(i) >= 'A' && subString.charAt(i) <= 'F') {
result += result * 15 + subString.charAt(i) - 'A' + 10;
} else if (subString.charAt(i) >= 'a' && subString.charAt(i) <= 'f') {
result += result * 15 + subString.charAt(i) - 'a' + 10;
} else {
result += result * 15 + subString.charAt(i) - '0';
}
}
System.out.println(result);
}
}


*/