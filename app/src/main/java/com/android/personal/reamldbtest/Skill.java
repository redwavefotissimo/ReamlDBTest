package com.android.personal.reamldbtest;

import io.realm.RealmObject;
import io.realm.annotations.*;

public class Skill extends RealmObject {
    public static final String PROPERTY_SKILL = "skillName";

    @PrimaryKey
    @Required
    public String skillName;
}
