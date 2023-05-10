package programmers.Lv_00;
import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.net.Proxy;
import java.util.Scanner;

public class Training_03 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//        String upa = a.toUpperCase();
//        String loa = a.toLowerCase();
//        for (int i = 0; i < a.length(); i++) {
//            if (a.charAt(i) == upa.charAt(i)) {
//                a = a.replace(a.charAt(i),loa.charAt(i));
//            } else {
//                a = a.replace(a.charAt(i),upa.charAt(i));
//            }
//        }
//        System.out.println(a);
//        이 코드는 잘못된 결과를 출력할 우려가 있음
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i=0; i<a.length(); i++) {
            char c = a.charAt(i);
            if(Character.isUpperCase(c)) {
                System.out.print((char)(c+32));
            }
            else {
                System.out.print((char)(c-32));
            }
        }
    }
}
