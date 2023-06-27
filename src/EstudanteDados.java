public abstract class EstudanteDados
{
        private final String nomeCompleto;
        private final String identidade;
        private final String numeroEscolar;

        public EstudanteDados(String nomeCompleto, String identidade, String numeroEscolar)
        {
            this.nomeCompleto = nomeCompleto;
            this.identidade = identidade;
            this.numeroEscolar = numeroEscolar;
        }
        public String getNomeCompleto()
        {
            return nomeCompleto;
        }
        public String getIdentidade()
        {
            return identidade;
        }
        public String getNumeroEscolar()
        {
            return numeroEscolar;
        }
        @Override
        public String toString()
        {
            return String.format("%s  %s  %s", getNomeCompleto(), getIdentidade(), getNumeroEscolar());
        }
        public abstract double calculadoraDeMensalidades();

}


