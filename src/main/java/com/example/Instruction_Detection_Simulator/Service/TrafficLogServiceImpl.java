package com.example.Instruction_Detection_Simulator.Service;

import com.example.Instruction_Detection_Simulator.Entity.TrafficLog;
import com.example.Instruction_Detection_Simulator.Repository.TrafficLogRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TrafficLogServiceImpl implements TrafficLogService {

    private final TrafficLogRepository trafficLogRepository;

    public TrafficLogServiceImpl(TrafficLogRepository trafficLogRepository) {
        this.trafficLogRepository = trafficLogRepository;
    }

    @Override
    public TrafficLog createTrafficLog(TrafficLog trafficLog) {
    }

    @Override
    public TrafficLog updateTrafficLog(TrafficLog trafficLog) {
    }

    @Override
    public void deleteTrafficLog(Long id) {
    }

    @Override
    public TrafficLog getTrafficLogById(Long id) {
    }

    @Override
    public List<TrafficLog> getAllTrafficLogs() {
    }
}
