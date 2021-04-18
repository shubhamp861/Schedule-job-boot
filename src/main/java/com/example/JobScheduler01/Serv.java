package com.example.JobScheduler01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class Serv {
    @Autowired
    private Repo repo;

    Logger logger = LoggerFactory.getLogger(Serv.class);

    //schedule methode
    @Scheduled(fixedRate = 5000)
    public void addModelToDB(){
        Model model = new Model();
        model.setName("user_"+new Random().nextInt(374483));
        repo.save(model);
        System.out.println("Hitting DB in each 5 Second__"+new Date().toString());
    }

    @Scheduled(cron = "0/15 * * * * *")
    public void fechDB(){
        List<Model> list = repo.findAll();
        System.out.println("Hitting DB in each 15 Second__ for new RECORD ???  "+new Date().toString());
        System.out.println("Result"+list.size());
        logger.info("Data : {}",list);

    }
}
