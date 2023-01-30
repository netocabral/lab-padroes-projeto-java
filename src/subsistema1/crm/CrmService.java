package subsistema1.crm;

import java.util.logging.Logger;

public class CrmService {

    private static final Logger LOGGER = Logger.getLogger(CrmService.class.getName());

    private CrmService() {
        throw new IllegalStateException("Utility class");
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        LOGGER.info("Cliente salvo no sistema de CRM: " + nome + " - " + cep + " - " + cidade + " - " + estado);
    }
}

