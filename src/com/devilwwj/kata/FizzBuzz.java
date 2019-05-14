package com.devilwwj.kata;

/**
 * 00.FizzBuzz
 * <p>
 * 有一名体育老师，在某次离下课还有五分钟时，决定玩一个报数游戏。此时有100名学生在上课，游戏的规则如下：
 * <p>
 * 1. 老师先说出两个不同的特殊数(都是个位数)，比如3, 5；让所有学生拍成一队，然后按顺序报数；
 * 2. 学生报数时，如果所报数字是「第一个特殊数(3)」的倍数，或者包含「第一个特殊数(3)」，那么不能说该数字，而要说Fizz；
 * 3. 学生报数时，如果所报数字是「第二个特殊数(5)」的倍数，或者包含「第一个特殊数(3)」，那么不能说该数字，而要说Buzz；
 * 4. 如果所报数字同时是「两个特殊数」的倍数，也要特殊处理。例如，如果是「第一个(3)」和「第二个(5)」特殊数的倍数，那么也不能说该数字，而是要说FizzBuzz。
 * 5. 学生报数时，如果所报数字包含了「特殊数」，那么也不能说该数字，而是要说对应的英文单词（见规则1和规则2）。例如，要报13的同学应该说Fizz；要报52的同学应该说Buzz。
 * 6.如果在一次报数中，匹配上述多个规则，Fizz和Buzz都只能出现一次。
 * 7. 否则，直接说出要报的数字。
 * <p>
 * </p>
 *
 * @author devilwwj
 */
public class FizzBuzz {

    private static final String FIZZBUZZ = "FizzBuzz";
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public static String fizzBuzz(int sayNum, int firstNum, int secondNum) {
        // 即是第一个特殊数字的倍数又是第二个数字的倍数说FizzBuzz
        if (isFizzBuzz(sayNum, firstNum, secondNum)) {
            return FIZZBUZZ;
        }

        // 第一个特殊数字的倍数说Fizz
        if (isFizz(sayNum, firstNum)) {
            return FIZZ;
        }

        // 第二个特殊数字的倍数说Buzz
        if (isBuzz(sayNum, secondNum)) {
            return BUZZ;
        }

        // 不满足以上所有条件
        return String.valueOf(sayNum);
    }

    public static boolean isFizzBuzz(int sayNum, int firstNum, int secondNum) {
        return isFizz(sayNum, firstNum) && isBuzz(sayNum, secondNum);
    }

    public static boolean isFizz(int sayNum, int targetNum) {
        return isMultipleOrContainNum(sayNum, targetNum);
    }

    public static boolean isBuzz(int sayNum, int targetNum) {
        return isMultipleOrContainNum(sayNum, targetNum);
    }

    public static boolean isMultipleOrContainNum(int sayNum, int targetNum) {
        return (sayNum % targetNum == 0 || formatNumToString(sayNum).contains(formatNumToString(targetNum)));
    }

    public static String formatNumToString(int num) {
        return String.valueOf(num);
    }

    public static void main(String[] args) {
    }
}
