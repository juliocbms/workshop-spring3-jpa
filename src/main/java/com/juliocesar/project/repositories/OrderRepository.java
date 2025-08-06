package com.juliocesar.project.repositories;

import com.juliocesar.project.entities.Order;
import com.juliocesar.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {


}
