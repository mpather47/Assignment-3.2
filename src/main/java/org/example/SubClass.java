package org.example;

public class SubClass {

    BaseClass heirarchy ;

    public SubClass( BaseClass heirarchy) {

        this.heirarchy = heirarchy;
    }

    @Override
    public String toString() {
        return  heirarchy +"";
    }
}
