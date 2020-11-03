package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    @Autowired
    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("Entered SpeakerServiceImpl no args constructor");
    }

    public SpeakerServiceImpl (SpeakerRepository speakerRepository) {
        System.out.println("Entered SpeakerServiceImpl in SpeakerServiceImpl...");
        repository = speakerRepository;
    }

    @PostConstruct
    private void initialize() {
        System.out.println("We are called after constructors");
    }

    public List<Speaker> findAll() {
        System.out.println("Entered findAll in SpeakerServiceImpl...");
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        System.out.println("Entered setRepository in AppConfig...");
        this.repository = repository;
    }
}
