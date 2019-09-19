package cn.myd.gg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//没有意思的啦
public class Test {

//prsf ===>private static final
   private static final int h=2;
//psf =>public static final
    public static final int j=9;
//psfi ====>public static final int
    public static final int yy=8;
//psfs ===>public static final String
    public static final String hhhh="";




    public static void main(String[] args) {

        System.out.println("");

        //soutp
        System.out.println("args = " + Arrays.deepToString(args));

        //soutm
        System.out.println("Test.main");

        //soutv
        System.out.println("args = " + args);
        //xxx.sout---> num1.sout ======> System.out.println(num1);
        int num1 = 1;
        System.out.println(num1);
        ArrayList d = new ArrayList();
    }

    public void gg(){

        int [] arr=new int[2];

        //for 模板一： fori
        for (int i = 0; i <arr.length ; i++) {
            
        }

        //模板二：iter
        for (int i : arr) {
            
        }

        //模板三：itar
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            
        }


        //变形  xx.fori
        for (int i = 0; i < arr.length; i++) {

        }

        //list.fori
        List<String> list = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

        }

        //list.for

        for (String s : list) {

        }


        //list.forr  倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }

    public void ff(){


        String h  ="";
        //模板五ifn
        if (h == null) {

        }
        if (h != null) {

        }
        //变形  xx.nn
        String hh = "";

        if (hh != null) {

        }

        //xx.null
        if (hh == null) {

        }


    }
}
