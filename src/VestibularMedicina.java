
public class VestibularMedicina extends EstudanteDados
{
    private double mensalidadeMedicina;
    private double tempo;

    public VestibularMedicina(String nomeCompleto, String identidade, String numeroEscolar, double mensalidadeMedicina,
                              double tempo)
    {
        super(nomeCompleto, identidade, numeroEscolar);

        if (mensalidadeMedicina <= 0.0)
            throw new IllegalArgumentException("Essa variável deve ser maior que zero.");

        if (tempo <= 0.0)
            throw new IllegalArgumentException("Essa variável deve ser maior que zero.");

        this.mensalidadeMedicina = mensalidadeMedicina;
        this.tempo = tempo;
    }
    public void setMensalidadeMedicina(double mensalidadeMedicina)
    {
        if (mensalidadeMedicina <= 0.0)
            throw new IllegalArgumentException("Essa variável deve ser maior que zero.");

        this.mensalidadeMedicina = mensalidadeMedicina;
    }
    public void setTempo(double tempo)
    {
        if (tempo <= 0.0)
            throw new IllegalArgumentException("Essa variável deve ser maior que zero.");
    }
    public double getMensalidadeMedicina()
    {
        return mensalidadeMedicina;
    }
    public double getTempo()
    {
        return tempo;
    }
    public double calculadoraDeMensalidades()
    {
        if (getTempo() <= 2.5)
        {
            return getMensalidadeMedicina();
        }
        else
        {
            return getMensalidadeMedicina()*0.1 + getMensalidadeMedicina();
        }
    }
    @Override
    public String toString()
    {
        return String.format("Perfil do estudante do pré-vestibular para medicina: %s%n%s: R$%,.2f; %n", super.toString(),
                "Valor da mensalidade:", getMensalidadeMedicina());
    }
}
