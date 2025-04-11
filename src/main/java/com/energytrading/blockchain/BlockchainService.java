package com.energytrading.blockchain;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.DefaultGasProvider;
import org.web3j.tx.gas.ContractGasProvider;

public class BlockchainService {
    private Web3j web3j;
    private ContractGasProvider gasProvider;

    public BlockchainService(String blockchainUrl) {
        this.web3j = Web3j.build(new HttpService(blockchainUrl));
        this.gasProvider = new DefaultGasProvider();
    }

    public void connect() {
        // Logic to connect to the blockchain
    }

    public void disconnect() {
        // Logic to disconnect from the blockchain
    }

    public Web3j getWeb3j() {
        return web3j;
    }

    public ContractGasProvider getGasProvider() {
        return gasProvider;
    }
}
