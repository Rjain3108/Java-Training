package com.rishabh.firstJavaProject;


public class LeapYearChecker {
    public boolean isLeapYear(int year) {
       if (year%4 == 0 && year > 0){
           if(year%400 !=0 && year%100 == 0)
           return false;
           else return true;
       } 
       return false;
    }
}