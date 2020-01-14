package orther;

import java.util.Scanner;

public class javaScan {
    public static void main(String arg[]){//main--来自高金磊
        Scanner scanner=new Scanner(System.in);
//        用 Scanner 实现字符串的输入有两种方法，一种是next（），一种nextLine()；
//
//        next() 一定要读取到有效字符后才可以结束输入，对输入有效字符之前遇到的空格键、Tab键或Enter键等结束符，next() 方法会自动将其去掉，只有在输入有效字符之后，next()方法才将其后输入的空格键、Tab键或Enter键等视为分隔符或结束符。
//
//        nextLine()方法的结束符只是Enter键。
//
//        简言之，next方法不能得到带空格的字符串，而nextLine()方法返回的是Enter键之前的所有字符
/**
 * 1
 * 11  1
 */
        System.out.println(scanner.next());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.next());
        System.out.println(scanner.nextLine());
        System.out.println();

    }
}
