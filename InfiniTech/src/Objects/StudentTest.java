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
        
        Student student = Student.getStudentFinder().findRecordById(13047966L);
        System.out.println(student.getFirstName());
    }
}
