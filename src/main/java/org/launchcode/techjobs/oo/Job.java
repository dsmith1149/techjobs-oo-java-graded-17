package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job extends JobField {
    private final int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {

        String idValue = (getId() > 0) ? String.valueOf(getId()) : "Data not available";
        String nameValue = (name != null && !name.trim().isEmpty()) ? name : "Data not available";
        String employerValue = (employer != null && !employer.getValue().trim().isEmpty()) ? employer.getValue() : "Data not available";
        String locationValue = (location != null && !location.getValue().trim().isEmpty()) ? location.getValue() : "Data not available";
        String positionTypeValue = (positionType != null && !positionType.getValue().trim().isEmpty()) ? positionType.getValue() : "Data not available";
        String coreCompetencyValue = (coreCompetency != null && !coreCompetency.getValue().trim().isEmpty()) ? coreCompetency.getValue() : "Data not available";

        return System.lineSeparator() +
                "ID: " + idValue + System.lineSeparator() +
                "Name: " + nameValue + System.lineSeparator() +
                "Employer: " + employerValue + System.lineSeparator() +
                "Location: " + locationValue + System.lineSeparator() +
                "Position Type: " + positionTypeValue + System.lineSeparator() +
                "Core Competency: " + coreCompetencyValue + System.lineSeparator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

}