package com.example.Instruction_Detection_Simulator.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Alert implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime detectedAt;
    @Enumerated(EnumType.STRING)
    private ESeverityLevel severity;
    private String description;
    @Enumerated(EnumType.STRING)
    private AlertStatus status;

    @OneToMany
    private ArrayList<DetectionRule> detectionRule = new ArrayList<>();
}
