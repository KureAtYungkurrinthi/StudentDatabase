/*
 * Author: Sheng-fan Wang <wang2147@flinders.edu.au>
 * College of Science and Engineering, Flinders University
 * Copyright (C) 2023, All Rights Reserved
 */

package studentdatabase;

public enum Degree {
    science ("Science"),
    arts ("Arts"),
    medicine ("Medicine");
    private String name;

    Degree(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
