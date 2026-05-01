package com.example.Instruction_Detection_Simulator.Service;

import com.example.Instruction_Detection_Simulator.Entity.NetworkNode;
import java.util.List;

public interface NetworkNodeService {
    NetworkNode createNetworkNode(NetworkNode networkNode);
    NetworkNode updateNetworkNode(NetworkNode networkNode);
    void deleteNetworkNode(String ip);
    NetworkNode getNetworkNodeByIp(String ip);
    List<NetworkNode> getAllNetworkNodes();
}
