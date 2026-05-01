package com.example.Instruction_Detection_Simulator.Repository;

import com.example.Instruction_Detection_Simulator.Entity.Alert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertRepository extends JpaRepository<Alert, Long> {
}
