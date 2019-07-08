package com.goyarce.api.controller;

import com.goyarce.api.beans.mysql.First;
import com.goyarce.api.repositories.mysql.FirstRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class controlRouter {
    public static final Boolean DEBUG = false;

    @Autowired
    FirstRepo FirstRepo;

    @RequestMapping(method = RequestMethod.GET, value = "/first/allfirst")

    @ResponseBody
    public List<First> getAllFirsts(){
        //System.out.println("Our DataSource is = mySQL");
        Iterable<First> result = FirstRepo.findAll();
        List<First> resultList = new ArrayList<First>();
        for(First first:result){
            resultList.add(first);
            if(DEBUG) System.out.println("/first/allfirst: " + first.toString());
        }
        return resultList;
    }


}
