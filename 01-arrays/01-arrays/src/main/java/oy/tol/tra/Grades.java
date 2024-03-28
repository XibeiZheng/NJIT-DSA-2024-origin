package oy.tol.tra;

import java.util.Arrays;
import oy.tol.tra.Algorithms;

public class Grades {

   private Integer [] grades = null;

   public Grades(Integer [] grades) {
      this.grades = new Integer [grades.length];
       System.arraycopy(grades, 0, this.grades, 0, grades.length);
   }

   public void reverse() {
      Algorithms.reverse(grades);
   }

   public void sort() {
      Arrays.sort(grades);
   }

   public Integer [] getArray() {
      return grades;
   }
}