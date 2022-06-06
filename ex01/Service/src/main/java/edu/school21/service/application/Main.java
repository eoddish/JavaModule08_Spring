package edu.school21.service.application;

import edu.school21.service.models.User;
import edu.school21.service.repositories.UsersRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        UsersRepository usersRepository = context.getBean("usersRepositoryJdbc", UsersRepository.class);
        User alice = new User(1L, "alice@school21.ru");
        usersRepository.save(alice);
        List<User> list = usersRepository.findAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + " " + list.get(i).getEmail());
        }

        System.out.println("---------------------------------");

        usersRepository = context.getBean("usersRepositoryJdbcTemplate", UsersRepository.class);
        User bob = new User(2L, "bob@school21.ru");
        usersRepository.save(bob);
        alice.setEmail("alice@student.com");
        usersRepository.update(alice);
        list = usersRepository.findAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + " " + list.get(i).getEmail());
        }

        usersRepository = context.getBean("usersRepositoryJdbc", UsersRepository.class);
        User userFound = (User) usersRepository.findById(1L);
        System.out.println("Found user by id: " + userFound.getId() + " " + userFound.getEmail());


    }
}
