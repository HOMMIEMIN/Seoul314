package com.seoul314.seoul314;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class WithSeoul {

    private String title;
    private int personCount;
    private int distance;
    private Date time;
    private List<String> user;
    private List<String> readyUser;
    private Map<String, Integer> userDistance;
    private String roomState;


    public WithSeoul(){}

    public WithSeoul(String title, int personCount, int distance, Date time, List<String> user, List<String> readyUser, Map<String, Integer> userDistance, String roomState) {
        this.title = title;
        this.personCount = personCount;
        this.distance = distance;
        this.time = time;
        this.user = user;
        this.readyUser = readyUser;
        this.userDistance = userDistance;
        this.roomState = roomState;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPersonCount() {
        return personCount;
    }

    public void setPersonCount(int personCount) {
        this.personCount = personCount;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public List<String> getUser() {
        return user;
    }

    public void setUser(List<String> user) {
        this.user = user;
    }

    public List<String> getReadyUser() {
        return readyUser;
    }

    public void setReadyUser(List<String> readyUser) {
        this.readyUser = readyUser;
    }

    public Map<String, Integer> getUserDistance() {
        return userDistance;
    }

    public void setUserDistance(Map<String, Integer> userDistance) {
        this.userDistance = userDistance;
    }

    public String getRoomState() {
        return roomState;
    }

    public void setRoomState(String roomState) {
        this.roomState = roomState;
    }
}
