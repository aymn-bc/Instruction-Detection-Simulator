package com.example.Instruction_Detection_Simulator.Service;

import com.example.Instruction_Detection_Simulator.Entity.TrafficLog;
import java.util.List;

public interface TrafficLogService {
    TrafficLog createTrafficLog(TrafficLog trafficLog);
    TrafficLog updateTrafficLog(TrafficLog trafficLog);
    void deleteTrafficLog(Long id);
    TrafficLog getTrafficLogById(Long id);
    List<TrafficLog> getAllTrafficLogs();
}
