package learn.Templates;

import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

//        int usex = 0;
//        char sex = usex==0 ? '男':'女';
//        System.out.println(sex);

//        System.out.println("1");
//        int person1 = new Scanner(System.in).nextInt();
//        System.out.println("2");
//        int person2 = new Scanner(System.in).nextInt();
//        int maxTemp = person1 > person2 ? person1:person2;
//        System.out.println("3");
//        int person3 = new Scanner(System.in).nextInt();
//        maxTemp = maxTemp > person3 ? maxTemp:person3;
//
//        System.out.println("the max:"+maxTemp);

//        System.out.println("输入值：");
//        String Swithdemo = new Scanner(System.in).nextLine();
//
//        switch (Swithdemo) {
//            case "是":
//                System.out.println("正确！");
//                break;
//            case "不是":
//                System.out.println("错误！");
//                break;
//            default:
//                System.out.println("违规输入！");
//        }

//        int high = 8844430;
//        float i = 0.1f;
//        int count = 0;
//        System.out.println(i);
//        while (high >= i) {
//            i *= 2;
//            count++;
//        }
//        System.out.println(count);

//        int i = 1;
//        int sum =0;
//        while (i <= 100) {
//            sum = sum + i;
//            System.out.println("sum = "+ sum);
//            i++;
//        }

//        for (int hour = 0;hour <24;hour++){
//            for (int minute = 0;minute <= 59;minute++) {
//                for (int second = 0;second <= 59;second++) {
//                    System.out.println(hour+"时"+minute+"分"+second+"秒");
//                }
//            }
//        }

//        for (int i =1;i<=10;i++){
//            int r = new Random().nextInt(10000);
//            System.out.println(r);
//        }

        int RondemNum = new Random().nextInt(100) + 1;
        for (int Num = -1; Num != RondemNum; Num = -1) {
            System.out.println("write down:");
            Num = new Scanner(System.in).nextInt();
            if (Num > RondemNum) {
                System.out.println("bigger");
                System.out.println("again");
                continue;
            } else if (Num < RondemNum) {
                System.out.println("smaller");
                System.out.println("again");
                continue;
            } else {
                System.out.println("Right!");
                break;
            }
        }


    }
}
