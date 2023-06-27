
public class EstudanteGeral extends EstudanteDados
{
    private double mensalidadeComum;

    public EstudanteGeral(String nomeCompleto, String identidade, String numeroEscolar, double mensalidadeComum)
    {
        super(nomeCompleto, identidade, numeroEscolar);

        if (mensalidadeComum < 0.0)
            throw new IllegalArgumentException("Essa variável deve ser maior que zero.");

        this.mensalidadeComum = mensalidadeComum;
    }
    public void setMensalidadeComum(double mensalidadeComum)
    {
        if (mensalidadeComum < 0.0)
            throw new IllegalArgumentException("Essa variável deve ser maior que zero.");

        this.mensalidadeComum = mensalidadeComum;
    }
    public double getMensalidadeComum()
    {
        return mensalidadeComum;
    }
    public double calculadoraDeMensalidades()
    {
        return getMensalidadeComum();
    }
    @Override
    public String toString()
    {
        return String.format("Perfil do estudante: %s%n%s: R$%.2f" ,super.toString(), "Valor da mensalidade do estudante:",
                getMensalidadeComum());
    }
}
