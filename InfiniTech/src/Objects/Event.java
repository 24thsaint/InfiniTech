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

import DatabaseConnectivity.Finder;
import DatabaseConnectivity.Model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Rave Noren Gidor-Sambo Villavicencio-Arevalo
 */
@Entity
public class Event extends Model implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String eventName;
    @ElementCollection(targetClass = String.class)
    private List<String> keywords = new ArrayList<>();
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Student> students = new ArrayList<>();
    @Transient
    private static final Finder<Event> finder = new Finder<>(Event.class.getSimpleName());

    public static Finder<Event> getFinder() {
        return finder;
    }

    public static void delete(Event e) {
        EntityManager em = null;
        try {
            em = Model.getEntityManager();
            em.getTransaction().begin();
            Event event = null;
            try {
                event = em.getReference(Event.class, e.getId());
                event.getId();
            } catch (EntityNotFoundException enfe) {
                System.out.println(enfe.getMessage());
            }
            em.remove(event);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void categorizeStudentByKeyword(Student student, String keyword) {
        for (String s : keywords) {
            if (s.equalsIgnoreCase(keyword)) {
                this.students.add(student);
                return;
            }
        }
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void addKeyword(String keyword) {
        this.keywords.add(keyword);
    }

    public boolean removeKeyword(String keyword) {
        if (this.keywords.contains(keyword)) {
            this.keywords.remove(keyword);
            return true;
        } else {
            return false;
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Event)) {
            return false;
        }
        Event other = (Event) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Objects.Event[ id=" + id + " ]";
    }

}
