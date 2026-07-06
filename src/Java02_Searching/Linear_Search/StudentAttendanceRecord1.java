package Java02_Searching.Linear_Search;

// https://leetcode.com/problems/student-attendance-record-i/

public class StudentAttendanceRecord1 {
    public static void main(String[] args) {
        String s = "PPALLP";

        System.out.println("Eligible for Attendance Award = " + checkRecord(s));
    }

    static boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                countA++;

                if (countA >= 2) {
                    return false;
                }
            }

            if (s.charAt(i) == 'L') {
                countL++;

                if (countL >= 3) {
                    return false;
                }
            } else {
                countL = 0;
            }
        }

        return true;
    }

}
