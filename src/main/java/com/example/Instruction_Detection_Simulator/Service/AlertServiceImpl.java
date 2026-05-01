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
    }

    @Override
    public Alert updateAlert(Alert alert) {
    }

    @Override
    public void deleteAlert(Long id) {
    }

    @Override
    public Alert getAlertById(Long id) {
    }

    @Override
    public List<Alert> getAllAlerts() {
    }
}
