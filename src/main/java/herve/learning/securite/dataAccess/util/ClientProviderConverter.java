package herve.learning.securite.dataAccess.util;

import herve.learning.securite.dataAccess.entity.ClientEntity;
import herve.learning.securite.model.Client;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientProviderConverter {

    public Client ClientEntityToClient(ClientEntity clientEntity) {

        Client client = new Client(clientEntity.getId(), clientEntity.getUsername(),clientEntity.getFirstname(),
                            clientEntity.getLastname(), clientEntity.getEmail(), clientEntity.getPassword());

        return client;
    }

    public ClientEntity ClientToClientEntity(Client client) {

        ClientEntity clientEntity = new ClientEntity(client.getId(), client.getUsername(), client.getFirstname(),
                client.getLastname(), client.getEmail(), client.getPassword());

        return clientEntity;
    }
}
