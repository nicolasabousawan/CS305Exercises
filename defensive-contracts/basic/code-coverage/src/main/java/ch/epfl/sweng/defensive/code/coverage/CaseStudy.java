package ch.epfl.sweng.defensive.code.coverage;

import ch.epfl.sweng.defensive.code.coverage.model.Course;
import ch.epfl.sweng.defensive.code.coverage.model.Lecturer;
import ch.epfl.sweng.defensive.code.coverage.store.Courses;

import java.util.Optional;

public class CaseStudy {
  public static void demonstrate() {
    String code = "The code";
    /*Course course = Courses.findByCode(code);
    Lecturer lecturer = course.getLecturer();
    String name = lecturer.getName();
    System.out.println(name);
    */
    Optional<Course> optionalCourse = Courses.findByCode(code);
    if (optionalCourse.isPresent()) {
      Course course = optionalCourse.get();
      Optional<Lecturer> optionalLecturer = course.getLecturer();
      if (optionalLecturer.isPresent()) {
        Lecturer lecturer = optionalLecturer.get();
        Optional<String> optionalName = lecturer.getName();
        if (optionalName.isPresent()) {
          String name = optionalName.get();
          System.out.println(name);
        }
      }
    }
  }
}