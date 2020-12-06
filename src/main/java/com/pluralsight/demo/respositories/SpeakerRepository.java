package com.pluralsight.demo.respositories;

import com.pluralsight.demo.models.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long>{

}
