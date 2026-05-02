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
        return detectionRuleRepository.save(detectionRule);
    }

    @Override
    public DetectionRule updateDetectionRule(DetectionRule detectionRule) {
        return detectionRuleRepository.findById(detectionRule.getId())
            .map(existingRule -> {
                existingRule.setRuleName(detectionRule.getRuleName());
                existingRule.setDescription(detectionRule.getDescription());
                existingRule.setRuleType(detectionRule.getRuleType());
                existingRule.setThresholdValue(detectionRule.getThresholdValue());
                existingRule.setSeverityLevel(detectionRule.getSeverityLevel());
                existingRule.setIsActive(detectionRule.getIsActive());
                existingRule.setTrafficLog(detectionRule.getTrafficLog());
                existingRule.setAlert(detectionRule.getAlert());
                return detectionRuleRepository.save(existingRule);
            })
            .orElse(null);
    }

    @Override
    public void deleteDetectionRule(Long id) {
        detectionRuleRepository.deleteById(id);
    }

    @Override
    public DetectionRule getDetectionRuleById(Long id) {
        return detectionRuleRepository.findById(id).orElse(null);
    }

    @Override
    public List<DetectionRule> getAllDetectionRules() {
        return detectionRuleRepository.findAll();
    }
}
