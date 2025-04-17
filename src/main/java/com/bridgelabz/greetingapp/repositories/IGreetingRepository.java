package com.bridgelabz.greetingapp.repositories;

import com.bridgelabz.greetingapp.models.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGreetingRepository extends JpaRepository<Greeting,Long> {

}
