package io.turntabl;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ClientRegister {
    private List<Client> clientList;

    public ClientRegister(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<String> getGoldClientNames(){
        List<String> goldClientName = clientList.stream()
                .filter(client -> client.getServiceLevel().equals(ServiceLevel.Gold))
                .map(client -> client.getName())
                .collect(toList());
        return goldClientName;
    }

    public Optional<Client> getClientNameByID(Integer id){
        Optional<Client> clientName = clientList.stream()
                .filter(client -> client.getId().equals(id))
                .findFirst();
        if (clientName.isPresent()){
            return Optional.of(clientName.get());
        }else{
            return Optional.empty();
        }
    }

    public Map<ServiceLevel, Long> countServiceLevel(){
        Map<ServiceLevel, Long> countingService =  clientList.stream()
                .map(client -> client.getServiceLevel())
                .collect(groupingBy(Function.identity(), counting()));
        return countingService;
    }


}
