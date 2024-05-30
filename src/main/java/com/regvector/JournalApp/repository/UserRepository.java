package com.regvector.JournalApp.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.regvector.JournalApp.entity.User;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository  extends JpaRepository<User, String> {

    public Optional<User> findByEmail(String email);

}
