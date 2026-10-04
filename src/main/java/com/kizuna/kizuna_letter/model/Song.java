package com.kizuna.kizuna_letter.model;

public class Song {
    private String title;
    private String filePath;

    public Song(String title, String filePath) {
        this.title = title;
        this.filePath = filePath;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
