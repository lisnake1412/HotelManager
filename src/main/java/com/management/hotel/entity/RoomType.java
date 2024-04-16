package com.management.hotel.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "room")
public class RoomType {
    @Id
    @Column(name = "room_type_id")
    private Integer room_type_id;

    @Column(name = "description")
    private String name;
}
