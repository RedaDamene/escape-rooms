package org.sebsy.demo.escaperooms.controller;

import jdk.jfr.Name;
import org.sebsy.demo.escaperooms.bll.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("room2")
public class EscapeRoom2Controller {
    @Autowired
    private RoomService roomService;

    public EscapeRoom2Controller(RoomService roomService) {
        this.roomService = roomService;
    }

    public void entreeSalle2() {
        System.out.println(roomService.entreeSalle());
    }

}
