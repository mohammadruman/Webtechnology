public class 29ques1 {
    public static void main(String[] args) {
        double[][] studentsData = {
                {65.5, 143.6},
                {67.3, 167.2},
                {70.2, 165.8},
                {61.7, 131.2},
                {87.1, 223.6},
                {59.3, 119.0},
                {75.2, 194.7},
                {71.1, 175.9},
                {66.3, 154.3},
                {80.5, 209.8}
        };

        double tallestHeight = studentsData[0][0];
        double shortestHeight = studentsData[0][0];
        int tallestStudentIndex = 0;
        int shortestStudentIndex = 0;

        double heaviestWeight = studentsData[0][1];
        double lightestWeight = studentsData[0][1];
        int heaviestStudentIndex = 0;
        int lightestStudentIndex = 0;

        for (int i = 1; i < studentsData.length; i++) {
            if (studentsData[i][0] > tallestHeight) {
                tallestHeight = studentsData[i][0];
                tallestStudentIndex = i;
            }
            if (studentsData[i][0] < shortestHeight) {
                shortestHeight = studentsData[i][0];
                shortestStudentIndex = i;
            }

            if (studentsData[i][1] > heaviestWeight) {
                heaviestWeight = studentsData[i][1];
                heaviestStudentIndex = i;
            }
            if (studentsData[i][1] < lightestWeight) {
                lightestWeight = studentsData[i][1];
                lightestStudentIndex = i;
            }
        }

        System.out.println("Student with the tallest height: Student " + (tallestStudentIndex + 1));
        System.out.println("Student with the shortest height: Student " + (shortestStudentIndex + 1));
        System.out.println("Student with the heaviest weight: Student " + (heaviestStudentIndex + 1));
        System.out.println("Student with the lightest weight: Student " + (lightestStudentIndex + 1));
    }
}
```