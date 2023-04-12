
import java.util.Scanner;

public class studentdetails {
   public static void main(String args[]) {
      int n, roll[] = new int[50];
      String name[] = new String[50];
      float cgpa[] = new float[50], min_cgpa = 10.0f;
      String min_name = "";

      Scanner scan = new Scanner(System.in);

      System.out.print("Enter the number of students: ");
      n = scan.nextInt();

      System.out.println("Enter the details of " + n + " students:");

      for(int i=0; i<n; i++) {
         System.out.println("Student " + (i+1) + ":");
         System.out.print("Roll number: ");
         roll[i] = scan.nextInt();
         System.out.print("Name: ");
         name[i] = scan.next();
         System.out.print("CGPA: ");
         cgpa[i] = scan.nextFloat();

         if(cgpa[i]<min_cgpa){
            min_cgpa = cgpa[i];
            min_name = name[i];
         }
      }

      System.out.println("Details of all "+ n + "students:");
      System.out.println("Roll\tName\tCGPA");
      for(int i=0;i<n;i++)
      {
        System.out.println(roll[i] + "\t" + name[i] + "\t" + cgpa[i]);
      }
      System.out.println("Student with the lowest CGPA is : "+ min_name);
   }
}

