package com.zy.tboot.databse;


import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User,Long>{

       User findByName(String name);
       User deleteById(int id);
}
