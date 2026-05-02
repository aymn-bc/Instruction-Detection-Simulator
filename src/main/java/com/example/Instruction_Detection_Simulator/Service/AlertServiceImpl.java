package com.example.Instruction_Detection_Simulator.Service;

import com.example.Instruction_Detection_Simulator.Entity.Alert;
import com.example.Instruction_Detection_Simulator.Repository.AlertRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlertServiceImpl implements AlertService {

    private final AlertRepository alertRepository;

    public AlertServiceImpl(AlertRepository alertRepository) {
        this.alertRepository = alertRepository;
    }

    @Override
    public Alert createAlert(Alert alert) {
        return alertRepository.save(alert);
    }

    @Override
    public Alert updateAlert(Alert alert) {
        return alertRepository.findById(alert.getId())
            .map(existingAlert -> {
                existingAlert.setAlertName(alert.getAlertName());
                existingAlert.setDescription(alert.getDescription());
                existingAlert.setSeverityLevel(alert.getSeverityLevel());
                existingAlert.setIsActive(alert.getIsActive());
                return alertRepository.save(existingAlert);
            })
            .orElse(null);
    }

    @Override
    public void deleteAlert(Long id) {
        alertRepository.deleteById(id);
    }

    @Override
    public Alert getAlertById(Long id) {
        return alertRepository.findById(id).orElse(null);
    }

    @Override
    public List<Alert> getAllAlerts() {
        return alertRepository.findAll();
    }
}
