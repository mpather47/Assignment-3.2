package org.example;

import org.junit.jupiter.api.BeforeAll;

public class SubClass {

    BaseClass heirarchy ;

    public SubClass( BaseClass heirarchy) {

        this.heirarchy = heirarchy;
    }

    @Override
    public String toString() {
        return
                heirarchy +"";
    }
}
