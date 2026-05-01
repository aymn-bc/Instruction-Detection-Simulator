package com.example.Instruction_Detection_Simulator.Service;

import com.example.Instruction_Detection_Simulator.Entity.DetectionRule;
import com.example.Instruction_Detection_Simulator.Repository.DetectionRuleRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DetectionRuleServiceImpl implements DetectionRuleService {

    private final DetectionRuleRepository detectionRuleRepository;

    public DetectionRuleServiceImpl(DetectionRuleRepository detectionRuleRepository) {
        this.detectionRuleRepository = detectionRuleRepository;
    }

    @Override
    public DetectionRule createDetectionRule(DetectionRule detectionRule) {
    }

    @Override
    public DetectionRule updateDetectionRule(DetectionRule detectionRule) {
    }

    @Override
    public void deleteDetectionRule(Long id) {
    }

    @Override
    public DetectionRule getDetectionRuleById(Long id) {
    }

    @Override
    public List<DetectionRule> getAllDetectionRules() {
    }
}
