package com.lessons;

import jdk.packager.services.userjvmoptions.PreferencesUserJvmOptions;

public class ClassRoom {


    private Pupil pupil;

    public ClassRoom(Pupil pupil) {

        this.pupil = pupil;
    }

    public Pupil getPupil() {
        return pupil;
    }

    public void setPupil(Pupil pupil) {

        this.pupil = pupil;
    }

}
