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
    }

    @Override
    public NetworkNode updateNetworkNode(NetworkNode networkNode) {
    }

    @Override
    public void deleteNetworkNode(String ip) {
    }

    @Override
    public NetworkNode getNetworkNodeByIp(String ip) {
    }

    @Override
    public List<NetworkNode> getAllNetworkNodes() {
    }
}
