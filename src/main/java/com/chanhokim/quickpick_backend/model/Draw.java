package com.chanhokim.quickpick_backend.model;

import java.util.List;

public class Draw {
    private String date;
    private List<Integer> numbers;

    // getters and setters
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public List<Integer> getNumbers() { return numbers; }
    public void setNumbers(List<Integer> numbers) { this.numbers = numbers; }
}
