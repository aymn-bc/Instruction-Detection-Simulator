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
        return trafficLogRepository.save(trafficLog);
    }

    @Override
    public TrafficLog updateTrafficLog(TrafficLog trafficLog) {
        return trafficLogRepository.findById(trafficLog.getId())
            .map(existingLog -> {
                existingLog.setSourceIp(trafficLog.getSourceIp());
                existingLog.setDestinationIp(trafficLog.getDestinationIp());
                existingLog.setSourcePort(trafficLog.getSourcePort());
                existingLog.setDestinationPort(trafficLog.getDestinationPort());
                existingLog.setProtocol(trafficLog.getProtocol());
                existingLog.setTimestamp(trafficLog.getTimestamp());
                return trafficLogRepository.save(existingLog);
            })
            .orElse(null);
    }

    @Override
    public void deleteTrafficLog(Long id) {
        trafficLogRepository.deleteById(id);
    }

    @Override
    public TrafficLog getTrafficLogById(Long id) {
        return trafficLogRepository.findById(id).orElse(null);
    }

    @Override
    public List<TrafficLog> getAllTrafficLogs() {
        return trafficLogRepository.findAll();
    }
}
