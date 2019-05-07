package com.devilwwj.kata;

/**
 * 00.FizzBuzz
 * <p>
 * 有一名体育老师，在某次离下课还有五分钟时，决定玩一个报数游戏。此时有100名学生在上课，游戏的规则如下：
 *
 * 1. 老师先说出两个不同的特殊数(都是个位数)，比如3, 5；让所有学生拍成一队，然后按顺序报数；
 * 2. 学生报数时，如果所报数字是「第一个特殊数(3)」的倍数，或者包含「第一个特殊数(3)」，那么不能说该数字，而要说Fizz；
 * 3. 学生报数时，如果所报数字是「第二个特殊数(5)」的倍数，或者包含「第一个特殊数(3)」，那么不能说该数字，而要说Buzz；
 * 4. 如果所报数字同时是「两个特殊数」的倍数，也要特殊处理。例如，如果是「第一个(3)」和「第二个(5)」特殊数的倍数，那么也不能说该数字，而是要说FizzBuzz。
 * 5. 学生报数时，如果所报数字包含了「特殊数」，那么也不能说该数字，而是要说对应的英文单词（见规则1和规则2）。例如，要报13的同学应该说Fizz；要报52的同学应该说Buzz。
 * 6.如果在一次报数中，匹配上述多个规则，Fizz和Buzz都只能出现一次。
 * 7. 否则，直接说出要报的数字。
 *
 * </p>
 * @author devilwwj
 */
public class FizzBuzz {


    public static void sayNumberGame(int firstNum, int secondNum) {
        // 从1~100报数
        for (int i = 1; i <= 100; i++) {
            // 即是第一个特殊数字的倍数又是第二个数字的倍数说FizzBuzz
            if (isMultipleNum(firstNum, i) && isMultipleNum(secondNum, i)) {
                System.out.println(String.format("%s Don't Say number, but say FizzBuzz", i));
                continue;
            }

            // 第一个特殊数字的倍数说Fizz
            if (isMultipleNum(firstNum, i)) {
                System.out.println(String.format("%d is a multiple of %d or contains %d Say Fizz", i, firstNum, firstNum));
                continue;
            }

            // 第二个特殊数字的倍数说Buzz
            if (isMultipleNum(secondNum, i)) {
                System.out.println(String.format("%d is a multiple of %d or contains %d Say Buzz", i, secondNum, secondNum));
                continue;
            }

            // 不满足以上所有条件
            System.out.println(String.format("%s Say number", i));
        }
    }

    public static boolean isMultipleNum(int targetNum, int sayNum) {
        String targetNumStr = String.valueOf(targetNum);
        String sayNumStr = String.valueOf(sayNum);
        return sayNum % targetNum == 0 || sayNumStr.contains(targetNumStr);
    }

    public static void main(String[] args) {
        System.out.println("00.FizzBuzz!!!");
        sayNumberGame(3, 5);
    }
}
