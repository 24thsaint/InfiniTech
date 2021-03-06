package com.infinitech.interfaces;

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
import java.util.List;

/**
 *
 * @author Rave Noren Gidor-Sambo Villavicencio-Arevalo
 * @param <T>
 */
public interface SearchBehavior<T> {

    public List<T> findAll();

    public T findRecordById(Long id);

    public T findRecordByField(String field, String key);

    public List<T> findAllRecordsByField(String field, String key);
    
}
