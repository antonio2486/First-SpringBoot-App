package com.pluralsight.demo.respositories;

import com.pluralsight.demo.models.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
