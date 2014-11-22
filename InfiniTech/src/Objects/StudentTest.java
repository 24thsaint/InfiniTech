/*
 *  ==++++++++++++++++++++++++++++++++++++++++++++++++++++==
 *  |      CENTRAL PHILIPPINE UNIVERSITY                   |
 *  |      Bachelor of Science in Software Engineering     |
 *  |      Jaro, Iloilo City, Philippines                  |
 *  |                                                      |
 *  |          This program is written by Rave, ©2014.     |
 *  |          You are free to use and distribute this.    |
 *  |          Reach me at: admin@blackout.biz.tm          |
 *  |                                                      |
 *  |               ~~~"CODE the FUTURE"~~~                |
 *  ==++++++++++++++++++++++++++++++++++++++++++++++++++++==
 */
package Objects;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Rave Noren Gidor-Sambo Villavicencio-Arevalo
 */
public class StudentTest {

    public static void main(String[] args) {
//        Student student = new Student();
//        student.setContact("0987654321");
//        student.setDepartment(Department.ChE);
//        student.setEmail("rave@1234567");
//        student.setFirstName("Rave");
//        student.setGender(Gender.MALE);
//        student.setId(13047966L);
//        student.setInterest("programming");
//        student.setIsCoordinator(true);
//        student.setLastName("Arevalo");
//        student.setPayment(500);
//        Shirt shirt = new Shirt();
//        shirt.setClaimed(true);
//        shirt.setShirtSize(ShirtSize.L.toString());
//        student.setShirt(shirt);
//        student.setYearLevel(YearLevel.FIRST_YEAR);
//        
//        student.save();

//        Student student = Student.getStudentFinder().findRecordById(13047966L);
//        System.out.println(student.getFirstName());
//        Student student = Student.getStudentFinder().findRecordById(13047966L);
//        List<String> interests = Arrays.asList(student.getInterest().split("\n"));
//
//        List<Event> events = Event.getFinder().findAll();
//        
//        for (Event event : events) {
//            System.out.println(event.getEventName());
//        }
//
//        for (Event event : events) {
//            for (Student s : event.getStudents()) {
//                System.out.println(event.getEventName() + " " + s.getFirstName());
//            }
//        }
//
//        for (Event event : events) {
//            for (String interest : interests) {
//                if (event.categorizeStudentByKeyword(student, interest)) {
//                    System.out.println("ADDED");
//                    try {
//                        event.update();
//                    } catch (Exception e) {
//                        System.out.println("Record already exists for event!");
//                    }
//                    break;
//                }
//            }
//        }
        Event event = new Event();
//        event.setEventName("COMPUTER QUIZ BEE");
//        event.addKeyword("COMPUTER");
//        event.addKeyword("INTERNET");
//        event.addKeyword("PROGRAMMING");
//        event.addKeyword("CODING");        
        event.setEventName("CULTURAL SINGING");
        event.addKeyword("KUNDIMAN");
        event.addKeyword("SINGING");
        event.addKeyword("POP SONG");
        event.addKeyword("SING");        
        event.addKeyword("CHORALE");
        event.save();
        
//        Student student = Student.getStudentFinder().findRecordByField("firstName", "Daryl");
//        System.out.println(student.getShirt().getShirtSize());
    }
}
