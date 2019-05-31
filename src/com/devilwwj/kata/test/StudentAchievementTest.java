package com.devilwwj.kata.test;

import com.devilwwj.kata.StudentAchievement;
import com.devilwwj.kata.StudentInfo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentAchievementTest {

    StudentAchievement studentAchievement = new StudentAchievement();
    StudentInfo studentInfo = new StudentInfo();
    List<Integer> scoreList = new ArrayList<>();

    @Before
    public void setUp() {
        studentInfo.name = "wenjiewu";
        studentInfo.studentNum = 123;
        studentInfo.mathScore = 90;
        studentInfo.chineseScore = 88;
        studentInfo.englishScore = 85;
        studentInfo.programScore = 86;

        scoreList.add(studentInfo.mathScore);
        scoreList.add(studentInfo.chineseScore);
        scoreList.add(studentInfo.englishScore);
        scoreList.add(studentInfo.programScore);
    }

    @Test
    public void testAverageScore() {
        Assert.assertEquals(87, studentAchievement.averageScore(scoreList));
    }

    @Test
    public void testCountTotalScore() {
        Assert.assertEquals(349, studentAchievement.countTotalScore(scoreList));
    }

    @Test
    public void testPrintReport() {
        Assert.assertEquals("wenjiewu", studentInfo.name);
        Assert.assertEquals(123, studentInfo.studentNum);
        Assert.assertEquals(90, studentInfo.mathScore);
        Assert.assertEquals(88, studentInfo.chineseScore);
        Assert.assertEquals(85, studentInfo.englishScore);
        Assert.assertEquals(86, studentInfo.programScore);

        studentInfo.averageScore = studentAchievement.averageScore(scoreList);
        studentInfo.totalScore = studentAchievement.countTotalScore(scoreList);

        List<StudentInfo> studentInfos = new ArrayList<>();
        studentInfos.add(studentInfo);

        String reportString = String.format("姓名:%s\n学号%s\n数学:%s\n语文:%s\n英语:%s\n编程:%s\n平均分:%s\n总分:%s",
                studentInfo.name, studentInfo.studentNum, studentInfo.mathScore, studentInfo.chineseScore, studentInfo.englishScore,
                studentInfo.programScore, studentInfo.averageScore, studentInfo.totalScore);

        Assert.assertEquals(reportString, studentAchievement.printReport(123, studentInfos));
        Assert.assertEquals("", studentAchievement.printReport(124, studentInfos));
    }


}
