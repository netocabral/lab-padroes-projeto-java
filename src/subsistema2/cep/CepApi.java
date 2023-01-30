package subsistema2.cep;

public class CepApi {

    private static CepApi INSTANCE = null;

    private CepApi() {
    }

    public static CepApi getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CepApi();
        }
        return INSTANCE;
    }

    public CidadeEstado recuperarCidadeEstado(String cep) {
        return new CidadeEstado("Araraquara", "SP");
    }

    public static class CidadeEstado {
        private String cidade;
        private String estado;

        public CidadeEstado(String cidade, String estado) {
            this.cidade = cidade;
            this.estado = estado;
        }

        public String getCidade() {
            return cidade;
        }

        public String getEstado() {
            return estado;
        }
    }
}

