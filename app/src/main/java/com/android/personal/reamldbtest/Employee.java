package com.android.personal.reamldbtest;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.*;

public class Employee extends RealmObject {

    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_AGE = "age";

    @PrimaryKey
    @Required
    public String name;
    public int age;

    public RealmList<Skill> skills;
}
