package com.cognitiveradio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cognitiveradio.entities.*;

@Repository
public interface InformationRepository extends JpaRepository<Information, Integer> {
}
