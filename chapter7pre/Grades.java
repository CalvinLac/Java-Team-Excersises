import java.util.Scanner;

public class Grades {
    
    public int[] arrayGrades;

    public Grades(int numOfGrades) {
      arrayGrades = new int[numOfGrades];
      Scanner keyboard = new Scanner(System.in);
      for (int i = 0; i < numOfGrades; i ++) {
        arrayGrades[i] = keyboard.nextInt();
      }
    }
    
    public double getAverage() {
      double average = 0;
      double total = 0;
      for (int i = 0; i < arrayGrades.length; i ++) {
        total += arrayGrades[i];
      }
      average = total/arrayGrades.length;
      return average;
    }
    
    public double getMin() {
      double min = arrayGrades[0];
      for (int i = 0; i < arrayGrades.length; i ++) {
        if (arrayGrades[i] < min) {
          min = arrayGrades[i];
        }
        else {
          continue;
        }
      }
      return min;
    }
    
    public double getMax() {
      double max = arrayGrades[0];
      for (int i = 0; i < arrayGrades.length; i ++) {
        if (arrayGrades[i] > max) {
          max = arrayGrades[i];
        }
        else {
          continue;
        }
      }
      return max;
    }

}