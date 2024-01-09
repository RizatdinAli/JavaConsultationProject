package ru.innopolis.java.homework09;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Race {
    private int length;
    private String route;
    private int prizePool;
    private List<Car> participants;

    public Race(int length, String route, int prizePool, List<Car> participants) {
        this.length = length;
        this.route = route;
        this.prizePool = prizePool;
        this.participants = participants;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getPrizePool() {
        return prizePool;
    }

    public void setPrizePool(int prizePool) {
        this.prizePool = prizePool;
    }

    public List<Car> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Car> participants) {
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "Race{" +
                "length=" + length +
                ", route='" + route + '\'' +
                ", prizePool=" + prizePool +
                ", participants=" + participants +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Race race = (Race) o;
        return length == race.length && prizePool == race.prizePool && Objects.equals(route, race.route) && Objects.equals(participants, race.participants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, route, prizePool, participants);
    }
}

