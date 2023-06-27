public class EstudanteBolsista extends EstudanteDados
{
    private double numeroDeIngresso;

    public EstudanteBolsista(String nomeCompleto, String identidade, String numeroEscolar, double numeroDeIngresso)
    {
        super(nomeCompleto, identidade, numeroEscolar);

        if (numeroDeIngresso <= 0.0)
            throw new IllegalArgumentException("Essa variável deve ser maior que zero.");

        this.numeroDeIngresso = numeroDeIngresso;
    }
    public void setNumeroDeIngresso(double numeroDeIngresso)
    {
        if (numeroDeIngresso <= 0.0)
            throw new IllegalArgumentException("Essa variável deve ser maior que zero.");

        this.numeroDeIngresso = numeroDeIngresso;
    }
    public double getNumeroDeIngresso()
    {
        return numeroDeIngresso;
    }
    public double calculadoraDeMensalidades()
    {
        return getNumeroDeIngresso();
    }

    @Override
    public String toString()
    {
        return String.format("Perfil do estudante bolsista: %s%n%s %.2f", super.toString(), "Modalidade de ingresso:", getNumeroDeIngresso());
    }
}

