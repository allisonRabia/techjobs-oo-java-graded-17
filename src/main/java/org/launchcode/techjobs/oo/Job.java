package org.launchcode.techjobs.oo;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class Job {

    public int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
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

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();

        return newLine + "ID: " + id + newLine +
                "Name: " + (StringUtils.isBlank(name) ? "Data not available" : name) + newLine +
                "Employer: " + (StringUtils.isBlank(employer.getValue()) ? "Data not available" : employer) + newLine +
                "Location: " + (StringUtils.isBlank(location.getValue()) ? "Data not available" : location) + newLine +
                "Position Type: " + (StringUtils.isBlank(positionType.getValue()) ? "Data not available" : positionType) + newLine +
                "Core Competency: " + (StringUtils.isBlank(coreCompetency.getValue()) ? "Data not available" : coreCompetency) + newLine;
    }
}
