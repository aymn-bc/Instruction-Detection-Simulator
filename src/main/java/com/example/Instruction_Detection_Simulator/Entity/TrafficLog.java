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
public class TrafficLog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sourceIp;
    private String destinationIp;
    private LocalDateTime timestamp;

    private Integer packetSize;
    @Enumerated(EnumType.STRING)
    private TypeProtocol protocol;

    private Integer requestCount;

    @ManyToOne
    private NetworkNode networkNode;
    @OneToMany(mappedBy = "trafficLog")
    private ArrayList<DetectionRule> detectionRule = new ArrayList<>();
}
