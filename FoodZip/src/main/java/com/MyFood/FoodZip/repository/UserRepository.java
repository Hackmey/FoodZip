package com.MyFood.FoodZip.repository;

import com.MyFood.FoodZip.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository {
    User findByEmail(String email);
}
