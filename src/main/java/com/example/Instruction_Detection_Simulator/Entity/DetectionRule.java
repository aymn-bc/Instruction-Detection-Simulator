package com.example.Instruction_Detection_Simulator.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class DetectionRule implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ruleName;
    private String description;
    @Enumerated(EnumType.STRING)
    private RuleType ruleType;

    private Double thresholdValue;
    @Enumerated(EnumType.STRING)
    private ESeverityLevel severityLevel;
    private Boolean isActive;

    @ManyToOne
    private TrafficLog trafficLog;
    @ManyToOne
    private Alert alert;
}
