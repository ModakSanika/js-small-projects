package com.Sanika_Modak.assignment.employees;

/**
 * Represents a developer with an additional programming language attribute.
 */
public class Developer extends Employee {
    private String programmingLanguage;

    /**
     * Gets the programming language of the developer.
     * @return the programming language of the developer
     */
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
