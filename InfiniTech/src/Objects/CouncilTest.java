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

import Controllers.CouncilJpaController;
import Controllers.EMFactory;
import Controllers.StudentJpaController;
import Enumerations.Department;
import Enumerations.Gender;
import Enumerations.ShirtSize;
import Enumerations.YearLevel;

/**
 *
 * @author Rave Noren Gidor-Sambo Villavicencio-Arevalo
 */
public class CouncilTest {
    public static void main(String[] args) {
        Council council = new Council();
        council.setContact("09478969902");
        council.setCoordinator(false);
        council.setDepartment(Department.SE);
        council.setEmail("rave@cpu.edu.ph");
        council.setFirstName("Rave");
        council.setGender(Gender.MALE);
        council.setId(Long.parseLong("13047966"));
        council.setInterest("Running,biking,playing computer games");
        council.setLastName("Arevalo");
        council.setPassword("123");
        council.setPayment(500);
        Shirt shirt = new Shirt();
        shirt.setClaimed(false);
        shirt.setShirtSize(ShirtSize.S.toString());
        council.setShirt(shirt);
        council.setYearLevel(YearLevel.SECOND_YEAR);
        
        CouncilJpaController cjc = new CouncilJpaController(EMFactory.getEMF());
        cjc.create(council);
       
        System.out.println("DONE");
        
//        Magic magic = new Magic();
//        magic.setMagic("323wetrsreligraeiohg");
//        
//        MagicJpaController mjc = new MagicJpaController(EMFactory.getEMF());
//        mjc.create(magic);
        
    }
}
