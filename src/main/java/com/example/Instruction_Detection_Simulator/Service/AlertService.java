package com.example.Instruction_Detection_Simulator.Service;

import com.example.Instruction_Detection_Simulator.Entity.Alert;
import java.util.List;

public interface AlertService {
    Alert createAlert(Alert alert);
    Alert updateAlert(Alert alert);
    void deleteAlert(Long id);
    Alert getAlertById(Long id);
    List<Alert> getAllAlerts();
}
