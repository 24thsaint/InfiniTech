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

import DatabaseConnectivity.Model;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author Rave Noren Gidor-Sambo Villavicencio-Arevalo
 */
@Entity
public class Fund extends Model implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Transient
    private static Fund fundInstance;
    private double totalFunds;
    private boolean firstRun = true;

    protected Fund() {
    }

    public static Fund getInstance() {
        if (fundInstance == null) {
            fundInstance = new Fund();            
        }
        return fundInstance;
    }

    public void add(double amount) {
        totalFunds += amount;      
        if (firstRun==true) {
            firstRun = false;
            save();
        } else {
            update();
        }        
    }

    public void deduct(double amount) {
        totalFunds -= amount;
        update();
    }

    public double getFund() {
        return totalFunds;
    }

    
}