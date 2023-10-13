package com.interswitch.databasefinal.service.impl;

import com.interswitch.databasefinal.model.Tutorial;
import com.interswitch.databasefinal.repository.TutorialRepository;
import com.interswitch.databasefinal.service.TutorialService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TutorialServiceImpl implements TutorialService {

    private final TutorialRepository tutorialRepository;

    @Override
    public List<Tutorial> getTutorial(){
        return tutorialRepository.findAll();
    }

    @Override
    public Tutorial addTutorial(Tutorial tutorial){
        return tutorialRepository.save(tutorial);
    }
}
