//HackerLand University has the following grading policy:
//
//        Every student receives a grade in the inclusive range from 0 to 100.
//        Any grade less than 40 is a failing grade.
//
//        Sam is a professor at the university and likes to round each student's grade according to these rules:
//
//        If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
//        If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
//
//
//        Examples
//
//        grade = 84 → round to 85 (85 - 84 is less than 3)
//        grade = 29 → do not round (result is less than 40)
//        grade = 57 → do not round (60 - 57 is 3 or higher)
//
//
//        Given the initial value of grade for each of Sam's n students, write code to automate the rounding process.
//
//        Function Description
//        Complete the function gradingStudents in the editor below.
//        gradingStudents has the following parameter(s):
//
//        int grades[n]: the grades before rounding
//
//        Returns
//
//        int[n]: the grades after rounding as appropriate
//
//
//        Input Format
//        The first line contains a single integer, n, the number of students.
//        Each line i of the n subsequent lines contains a single integer, grades[i].
//
//        Constraints
//
//        1 ≤ n ≤ 60
//        0 ≤ grades[i] ≤ 100

import java.util.List;
import java.util.ArrayList;
public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        int n=grades.size();
        List<Integer> result = new ArrayList<>();
        for(int g:grades){
            if(g>=38 && g%5!=0){
                int t= (g/5) +1;
                if(t*5-g<3)result.add(t*5);
                else result.add(g);
            }else result.add(g);
        }
        return result;

    }
}
