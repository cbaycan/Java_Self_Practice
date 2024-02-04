package day09_practice_tasks;

public class StudentGrade {
    public static void main(String[] args) {
        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grade = new char[names.length];

        for (int i = 0; i < grade.length; i++) {

            int score = scores[i];
            if (score >= 90) {
                grade[i] = 'A';
            } else if (score >= 80) {
                grade[i] = 'B';
            } else if (score >= 70) {
                grade[i] = 'C';
            } else if (score >= 60) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }

            System.out.println(names[i] + "'s score is " + score + ", and grade is " + grade[i]);


        }

    }
}

