# kata-puzzle
learn how to write unit test code.

[TOC]

说明：本工程由Intellij创建，打开通过import方式导入，单元测试框架采用JUnit.

## 00.FizzBuzz单元测试说明

### 源代码

```Java
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
        if (isMultipleOrContainNum(sayNum, firstNum)) {
            return FIZZ;
        }

        // 第二个特殊数字的倍数说Buzz
        if (isMultipleOrContainNum(sayNum, secondNum)) {
            return BUZZ;
        }

        // 不满足以上所有条件
        return String.valueOf(sayNum);
    }

    public static boolean isFizzBuzz(int sayNum, int firstNum, int secondNum) {
        return isMultipleOrContainNum(sayNum, firstNum) && isMultipleOrContainNum(sayNum, secondNum);
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

```

### 测试用例

```java

public class FizzBuzzTest {

    @Test
    public void testSayFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3, 3, 5));
    }

    @Test
    public void testSayBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5, 3, 5));
    }

    @Test
    public void testSayFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15, 3, 5));
    }

    @Test
    public void testOnlySayNum() {
        assertEquals("1", FizzBuzz.fizzBuzz(1, 3, 5));
    }

}

```

运行单元测试

![](images/Snip20190507_18.png)

查看单元测试结果

![](images/Snip20190507_14.png)


