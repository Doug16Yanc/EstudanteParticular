
public class EstudanteMilitar extends EstudanteDados

{
    private double mensalidadeMilitar;
    private double mediaMatematica;
    private double mediaFisica;
    private double mediaQuimica;

    public EstudanteMilitar(String nomeCompleto, String identidade, String numeroEscolar, double mensalidadeMilitar,
                            double mediaMatematica, double mediaFisica, double mediaQuimica)
    {
        super(nomeCompleto, identidade, numeroEscolar);

        if (mensalidadeMilitar <= 0.0)
            throw new IllegalArgumentException("Essa variável deve ser maior que zero.");
        if (mediaMatematica <= 0.0)
            throw new IllegalArgumentException("Essa variável deve ser maior que zero.");
        if (mediaFisica <= 0.0)
            throw new IllegalArgumentException("Essa variável deve ser maior que zero.");
        if (mediaQuimica <= 0.0)
            throw new IllegalArgumentException("Essa variável deve ser maior que zero.");

        this.mensalidadeMilitar = mensalidadeMilitar;
        this.mediaMatematica = mediaMatematica;
        this.mediaFisica = mediaFisica;
        this.mediaQuimica = mediaQuimica;
    }
    public void setMensalidadeMilitar(double mensalidadeMilitar)
    {
        if (mensalidadeMilitar <= 0.0)
            throw new IllegalArgumentException("Essa variável deve ser maior que zero.");
        this.mensalidadeMilitar = mensalidadeMilitar;
    }
    public void setMediaMatematica(double mediaMatematica)
    {
        if (mediaMatematica <= 0.0)
            throw new IllegalArgumentException("Essa variável deve ser maior que zero.");
        this.mediaMatematica = mediaMatematica;
    }
    public void setMediaFisica(double mediaFisica)
    {
        if (mediaFisica <= 0.0)
            throw new IllegalArgumentException("Essa variável deve ser maior que zero.");
        this.mediaFisica = mediaFisica;
    }
    public void setMediaQuimica(double mediaQuimica)
    {
        if (mediaQuimica <= 0.0)
            throw new IllegalArgumentException("Essa variável deve ser maior que zero.");
        this.mediaQuimica = mediaQuimica;
    }
    public double getMensalidadeMilitar()
    {
        return mensalidadeMilitar;
    }
    public double getMediaMatematica()
    {
        return mediaMatematica;
    }
    public double getMediaFisica()
    {
        return mediaFisica;
    }
    public double getMediaQuimica()
    {
        return mediaQuimica;
    }
    public double calculadoraMediaGeral()
    {
        return ((5*(mediaMatematica)+ 3*(mediaFisica) + 2*(mediaQuimica))/10);
    }
    public double calculadoraDeMensalidades()
    {
        if (calculadoraMediaGeral() <= 8.0)
        {
            return getMensalidadeMilitar()*0.15 + getMensalidadeMilitar();
        }
        else
        {
            return getMensalidadeMilitar() - getMensalidadeMilitar()*0.1;
        }
    }
    @Override
    public String toString()
    {
        return String.format("Perfil do estudante de pré-vestibular para instituição militar: %s%n%s: R$%,.2f; %n",
                super.toString(), "Valor da mensalidade: ", getMensalidadeMilitar());
    }
}
