package com.example.Instruction_Detection_Simulator.Service;

import com.example.Instruction_Detection_Simulator.Entity.NetworkNode;
import com.example.Instruction_Detection_Simulator.Repository.NetworkNodeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NetworkNodeServiceImpl implements NetworkNodeService {

    private final NetworkNodeRepository networkNodeRepository;

    public NetworkNodeServiceImpl(NetworkNodeRepository networkNodeRepository) {
        this.networkNodeRepository = networkNodeRepository;
    }

    @Override
    public NetworkNode createNetworkNode(NetworkNode networkNode) {
        return networkNodeRepository.save(networkNode);
    }

    @Override
    public NetworkNode updateNetworkNode(NetworkNode networkNode) {
        return networkNodeRepository.findById(networkNode.getIp())
            .map(existingNode -> {
                existingNode.setHostname(networkNode.getHostname());
                existingNode.setMacAddress(networkNode.getMacAddress());
                existingNode.setPort(networkNode.getPort());
                return networkNodeRepository.save(existingNode);
            })
            .orElse(null);
    }

    @Override
    public void deleteNetworkNode(String ip) {
        networkNodeRepository.deleteById(ip);
    }

    @Override
    public NetworkNode getNetworkNodeByIp(String ip) {
        return networkNodeRepository.findById(ip).orElse(null);
    }

    @Override
    public List<NetworkNode> getAllNetworkNodes() {
        return networkNodeRepository.findAll();
    }
}
