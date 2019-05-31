package com.devilwwj.kata;

import java.util.List;

public class StudentAchievement {

    public int averageScore(List<Integer> scoreList) {
        int size = scoreList.size();
        return countTotalScore(scoreList) / size;
    }

    public int countTotalScore(List<Integer> scoreList) {
        int sum = 0;
        for (Integer aScoreList : scoreList) {
            sum += aScoreList;
        }
        return sum;
    }

    public String printReport(int studentNum, List<StudentInfo> studentInfos) {
        String reportString = "";
        for (StudentInfo studentInfo : studentInfos) {
            if (studentNum == studentInfo.studentNum) {
                reportString = formatScore(studentInfo);
                break;
            }
        }
        return reportString;
    }

    private String formatScore(StudentInfo studentInfo) {
        return String.format("姓名:%s\n学号%s\n数学:%s\n语文:%s\n英语:%s\n编程:%s\n平均分:%s\n总分:%s",
                studentInfo.name, studentInfo.studentNum, studentInfo.mathScore, studentInfo.chineseScore, studentInfo.englishScore,
                studentInfo.programScore, studentInfo.averageScore, studentInfo.totalScore);
    }
}
