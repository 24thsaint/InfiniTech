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
package com.infinitech.objects;

import com.infinitech.dbconnectivity.Model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Rave Noren Gidor-Sambo Villavicencio-Arevalo
 */
@Entity
public class BorrowedItem extends Model implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long itemID;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date borrowDate;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date returnDate;

    public BorrowedItem borrowItem(Item item) {
        this.itemID = item.getId();
        this.borrowDate = new Date();
        this.returnDate = null;
        item.borrowItem();
        item.update();
        return this;
    }

    public void returnItem() {
        this.returnDate = new Date();
        Item item = getItem();
        item.returnItem();
        item.update();
    }

    public Item getItem() {
        try {
            return Item.getFinder().findRecordById(this.itemID);
        } catch (NoResultException e) {
            Item item = new Item();
            item.setItemName("Item record deleted");
            item.setQuantity(0);
            return item;
        }
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
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
        if (!(object instanceof BorrowedItem)) {
            return false;
        }
        BorrowedItem other = (BorrowedItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Objects.BorrowedItem[ id=" + id + " ]";
    }

}
