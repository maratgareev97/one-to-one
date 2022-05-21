package com.testdata.onetoone.controller;

import com.testdata.onetoone.config.DatabaseConfig;
import org.hibernate.Session;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/remind")
public class ReminderController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getReminder(ModelMap model){
        System.out.println("!!!!!!!!");


//        UserService userService = context.getBean(UserService.class);


//            try (Session session = Util.getSessionFactory().openSession()) {
//                transaction = session.beginTransaction();
//
//                User user = new User(name, lastName, age);
//                session.save(user);
//                transaction.commit();
//            } catch (Exception e) {
//                if (transaction != null) {
//                    transaction.rollback();
//                }
//            }



        return "My reminder";
    }
}
