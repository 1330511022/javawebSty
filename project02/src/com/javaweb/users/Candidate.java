package com.javaweb.users;

public class Candidate {//预选选手
    private String name;//姓名
    private String specialty;//特长
    private int votes;//票数

    public Candidate(String name, String specialty, int votes) {
        this.name = name;
        this.specialty = specialty;
        this.votes = votes;
    }

    public Candidate() {
    }

    public Candidate(String name, int votes) {
        System.out.println("Creating candidate with name: " + name + ", votes: " + votes);
        this.name = name;
        this.votes = votes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }
}
