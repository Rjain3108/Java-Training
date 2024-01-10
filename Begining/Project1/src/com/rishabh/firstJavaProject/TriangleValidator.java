package com.rishabh.firstJavaProject;

public class TriangleValidator {
    public boolean isValidTriangle(int angle1, int angle2, int angle3) {
        // write your code here
        if(angle1>0 && angle2 > 0 && angle3 >0)
        return (angle1 + angle2 + angle3) == 180;
        return false;
    }
}