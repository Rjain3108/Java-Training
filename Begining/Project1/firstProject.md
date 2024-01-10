1. HelloWorld.java:  Print Hello world
2. MultiplicationTable.java: get table using three methods
    print() --> print table for 5
    print(int) --> print table for a number
    print(int number, int from, int to)
3. TimeConverter.java
    Question:
        In Java, you have been given a partially implemented TimeConverter class that aims to convert time from hours or days to minutes. The TimeConverter class has two static methods that need to be completed:
        convertHoursToMinutes(int hours): This method should take an integer value representing hours and return the equivalent value in minutes.
        convertDaysToMinutes(int days): This method should take an integer value representing days and return the equivalent value in minutes.
        Instructions
            Task 1: Complete the convertHoursToMinutes method in the TimeConverter class so that it accurately converts hours into minutes. The method should return an integer value representing the total number of minutes.
            Task 2: Complete the convertDaysToMinutes method in the TimeConverter class so that it accurately converts days into minutes. The method should return an integer value representing the total number of minutes.
        NOTE: Return -1 for invalid cases (days and hours less than 0).
4.  Coding Exercise: Is Valid Triangle TriangleValidator.java
        You are given three integer inputs that represent the angles of a triangle. You need to complete a method named isValidTriangle(int angle1, int angle2, int angle3), inside a class named TriangleValidator. This method should return a boolean value – true if the given angles form a valid triangle, and false if they do not.
        The conditions for a valid triangle are:
            Each of the angles must be a positive integer.
            The sum of all the three angles must be exactly 180.
        Details
            Ensure you return false if any of the input angles are non-positive (i.e., less than or equal to zero).
            Compute the sum of the angles and check if it equals 180.
            Return true if all conditions are met, false otherwise.
5. Coding Exercise: Is Leap Year --> LeapYearChecker.java
    You are given a class LeapYearChecker with a method isLeapYear(int year). Your task is to complete the implementation of the method to determine if a given year is a leap year.
    The rules are a little tricky. Read them carefully.
    A year is a leap year in the Gregorian calendar if:
        It is divisible by 4 (AND)
        It is NOT divisible by 100 (except when it is divisible by 400)
        Not Divisible by 4 - NOT Leap Year (2041)
        Divisible by 4 and NOT divisible by 100 - Leap Year (2048)
        Divisible by 4 and divisible by 100 - Additional check needed
        Divisible by 4, divisible by 100, divisible by 400 - Leap Year (2000, 2400)
        Divisible by 4, divisible by 100, NOT divisible by 400 - NOT Leap Year (2100, 2200, 2300)
    Instructions
        Implement the isLeapYear method to return true if the year is a leap year and false otherwise.
        You need to account for the edge case where the year is less than 1. For such a case, the method should return false.   
    Please ensure your code passes all the test cases, including edge cases, and adheres to the above guidelines.