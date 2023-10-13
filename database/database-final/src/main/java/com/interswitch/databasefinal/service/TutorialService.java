package com.interswitch.databasefinal.service;

import com.interswitch.databasefinal.model.Tutorial;

import java.util.List;

public interface TutorialService {

    public List<Tutorial> getTutorial();
    public Tutorial addTutorial(Tutorial tutorial);
}
