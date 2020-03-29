package com.at.java;
import java.util.ArrayList;

/**
 * @author Ding
 * @date 2020/3/26 - 21:53
 */
public class TemplatesTest {
    // 模板1：pmain
    public static void main(String[] args) {


//模板2：sout
        System.out.println("Hello World!!");
//        变形：soutp / soutm / soutv /xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");

        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);
//        xxx.sout
        System.out.println(num1);

//        模板3:fori
        String[] arr = new String[]{"Tom","Jerry","HanMeimei","Lilei"};
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
            
        }
//        变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
//        变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
            
        }
//        模板4：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {

        }

//        变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }
//        变形：list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }

//         模板5：ifn
        if (list == null) {

        }
//        变形：inn
        if (list != null) {

        }
//        变形：xxx.nn
        if (list != null) {

        }
//        变形：xxx.null
        if (list == null) {

        }
    }
    public void method(){
        System.out.println("TemplatesTest.method");
    }

}
