package com.gomathy.learningspring.data.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="RESERVATION")
public class Reservation {
    @Id
    @Column(name = "RESERVATION_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reservationId;

    @Column(name="ROOM_ID")
    private Long roomId;

    @Column(name="GUEST_ID")
    private Long guestId;

    @Column(name="RES_DATE")
    private Date resDate;

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(final Long roomId) {
        this.roomId = roomId;
    }

    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(final Long guestId) {
        this.guestId = guestId;
    }

    public Date getResDate() {
        return resDate;
    }

    public void setResDate(final Date resDate) {
        this.resDate = resDate;
    }
}
