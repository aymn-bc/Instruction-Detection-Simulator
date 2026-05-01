package com.example.Instruction_Detection_Simulator.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class NetworkNode implements Serializable {
    @Id
    private String ip;
    private String hostname;
    @Enumerated(EnumType.STRING)
    private TypeNode type;
    @Enumerated(EnumType.STRING)
    private NodeStatus status;
    private Boolean isBlacklisted;

    @OneToMany(mappedBy = "networkNode")
    private ArrayList<TrafficLog> trafficLogs = new ArrayList<>();
}
