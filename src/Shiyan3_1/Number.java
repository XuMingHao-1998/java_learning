package Shiyan3_1;
import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        int number=0,d5,d4,d3,d2,d1;
        Scanner reader=new Scanner(System.in);
        System.out.println("输入一个1至99999之间的数");
        number = reader.nextInt();
        if(number >= 1 && number <= 99999){                     //计算number在1~99999之间的条件
            d5 = number/10000;                                  //计算number的最高位（万位）d5
            d4 = number%10000/1000;                             //计算number的千位d4
            d3 = number%1000/100;                               //计算number的百位d3
            d2 = number%100/10;                                 //计算number的十位d2
            d1 = number%10;                                     //计算number的个位d1
            if(d5 != 0){                                        //判断number是5位数的条件
                System.out.println(number+"是5位数");
                if(d5 == d1 && d4 == d2)                        //判断number是回文数的条件
                    System.out.println(number + "是回文数");
                else
                    System.out.println(number + "不是回文数");
            }
            else if(d4 != 0){
                System.out.println(number+"是4位数");
                if(d4 == d1 && d3 == d2)
                    System.out.println(number + "是回文数");
                else
                    System.out.println(number + "不是回文数");
            }
            else if(d3 != 0){
                System.out.println(number+"是3位数");
                if(d3 == d1)
                    System.out.println(number + "是回文数");
                else
                    System.out.println(number + "不是回文数");
            }
            else if(d2 != 0){
                System.out.println(number+"是2位数");
                if(d2 == d1)
                    System.out.println(number + "是回文数");
                else
                    System.out.println(number + "不是回文数");
            }
            else if(d1 != 0){
                System.out.println(number+"是1位数");
                System.out.println(number+"是回文数");
            }
        }
        else
            System.out.println(number+"不在1~99999之间");
    }
}
