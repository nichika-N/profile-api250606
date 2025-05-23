package com.example.demo.model;

public class Profile {
    private String name;
    private String university;
    private String description;

    public Profile(String name, String university, String description) {
        this.name = name;
        this.university = university;
        this.description = description;
    }

    // データを取り出すための関数（必須）
    public String getName() { return name; }
    public String getUniversity() { return university; }
    public String getDescription() { return description; }
}