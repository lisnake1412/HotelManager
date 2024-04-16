package com.management.hotel.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "room")
public class Room {
    @Id
    @Column(name = "room_id")
    private Integer room_id;
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "room_type_id", referencedColumnName = "room_type_id")
    private RoomType room_type_id;
}
