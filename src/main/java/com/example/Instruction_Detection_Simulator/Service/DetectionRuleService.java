package com.example.Instruction_Detection_Simulator.Service;

import com.example.Instruction_Detection_Simulator.Entity.DetectionRule;
import java.util.List;

public interface DetectionRuleService {
    DetectionRule createDetectionRule(DetectionRule detectionRule);
    DetectionRule updateDetectionRule(DetectionRule detectionRule);
    void deleteDetectionRule(Long id);
    DetectionRule getDetectionRuleById(Long id);
    List<DetectionRule> getAllDetectionRules();
}
