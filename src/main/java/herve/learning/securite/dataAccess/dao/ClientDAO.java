package herve.learning.securite.dataAccess.dao;

import herve.learning.securite.dataAccess.entity.ClientEntity;
import herve.learning.securite.dataAccess.repository.ClientRepository;
import herve.learning.securite.dataAccess.util.ClientProviderConverter;
import herve.learning.securite.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@Transactional
public class ClientDAO {


    @Autowired
    private ClientProviderConverter clientProviderConverter;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired

    public Set<Client> findAll() {

        Set<ClientEntity> clientEntities =  clientRepository.findAll().stream().collect(Collectors.toSet());

        return clientEntities.stream().
                    map(clientEntity -> clientProviderConverter.ClientEntityToClient(clientEntity)).
                    collect(Collectors.toSet());
    }

    public Client save(Client client) {

        ClientEntity clientEntity = clientRepository.save(clientProviderConverter.ClientToClientEntity(client));

        return clientProviderConverter.ClientEntityToClient(clientEntity);
    }
}
