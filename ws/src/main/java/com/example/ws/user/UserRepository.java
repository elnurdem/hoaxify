package com.example.ws.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    //Database e veri yazmak okumak için
    // <User, Long>
    // User senin domain model objen
    // Long da objenin id sini ifade eden field tipi.

    User findByUsername(String username);
}
