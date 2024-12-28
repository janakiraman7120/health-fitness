package com.health.fitness;

import com.health.fitness.entity.User;
import com.health.fitness.entity.Workout;
import com.health.fitness.repository.UserRepository;
import com.health.fitness.repository.WorkoutRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class HealthFitnessApp {
    public static void main(String[] args) {
        SpringApplication.run(HealthFitnessApp.class, args);
    }

    @Bean
    public CommandLineRunner initData(UserRepository userRepository, WorkoutRepository workoutRepository) {
        return args -> {
            // Saving a User Object in MySQL DB
            System.out.println("entered for saving new user");
            User user1 = new User("janaki", "janakiraman", "gurivindala", "janakiraman7120@gmail.com", "password");
            userRepository.saveAndFlush(user1);
            User user2 = new User("alex", "alex", "ferguson", "alexf@gmail.com", "password1");
            userRepository.saveAndFlush(user2);
            System.out.println("completed for saving new user");

            //Retrieve user object from MySQL DB
            System.out.println("entered for retrieving user object");
            List<User> userList = userRepository.findAll();
            System.out.println("Users List from DB is  "+userList.size());


            //Saving workout object in MySQL DB
            System.out.println("entered for saving new workout");
            Workout workout1 = new Workout("Morning Run", "Running", 30, 1);
            workoutRepository.saveAndFlush(workout1);
            Workout workout2 = new Workout("Morning jog", "Jogging", 45, 2);
            workoutRepository.saveAndFlush(workout2);
            System.out.println("completed for saving new workout");

            //Retrieve user object from MySQL DB
            System.out.println("entered for retrieving workout object");
            List<Workout> workoutList = workoutRepository.findAll();
            System.out.println("workouts List from DB is "+workoutList.size());
        };
    }
}



