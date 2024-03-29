package com.coddigger.cct.model;

import javax.persistence.*;

@Entity
@Table(name = "reserves")
public class DAOReserve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int roomid;

    @Column
    private String createdby;

    @Column
    private int fromdate;

    @Column
    private int todate;

    @Column
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRoomid() {
        return roomid;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public int getFromdate() {
        return fromdate;
    }

    public void setFromdate(int fromdate) {
        this.fromdate = fromdate;
    }

    public int getTodate() {
        return todate;
    }

    public void setTodate(int todate) {
        this.todate = todate;
    }
}
