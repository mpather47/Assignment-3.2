package org.example;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;

public class BaseClass {

    String className ;
    String dateCreated;
    String heirarchy;

    public BaseClass(String className, String dateCreated, String heirarchy) {
        this.className = className;
        this.dateCreated = dateCreated;
        this.heirarchy = heirarchy;
    }

    @Override

    public String toString() {
        return
                "className='" + className + '\'' +
                ", dateCreated='" + dateCreated + '\'' +
                ", heirarchy='" + heirarchy + '\'' +
                '}';
    }
}
