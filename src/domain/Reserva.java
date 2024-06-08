package domain;
import java.util.Date;

public class Reserva {
    private String id;
    private Hospede hospede;
    private Quarto quarto;
    private Funcionario funcionarioReserva;
    private Funcionario funcionarioFechamento;
    private Date dataEntradaReserva;
    private Date dataSaidaReserva;
    private Date dataCheckin;
    private Date dataCheckout;
    private double valorReserva;
    private double valorPago;

    public Reserva(String id, Hospede hospede, Quarto quarto, Funcionario funcionarioReserva, Funcionario funcionarioFechamento, Date dataEntradaReserva, Date dataSaidaReserva, Date dataCheckin, Date dataCheckout, double valorReserva, double valorPago) {
        this.id = id;
        this.hospede = hospede;
        this.quarto = quarto;
        this.funcionarioReserva = funcionarioReserva;
        this.funcionarioFechamento = funcionarioFechamento;
        this.dataEntradaReserva = dataEntradaReserva;
        this.dataSaidaReserva = dataSaidaReserva;
        this.dataCheckin = dataCheckin;
        this.dataCheckout = dataCheckout;
        this.valorReserva = valorReserva;
        this.valorPago = valorPago;
    }

    public String getId(){ return this.id; }
    public void setId(String id){ this.id = id; }

    public Hospede getHospede(){ return this.hospede; }
    public void setHospede(Hospede hospede){ this.hospede = hospede; }

    public Quarto getQuarto(){ return this.quarto; }
    public void setQuarto(Quarto quarto){ this.quarto = quarto; }

    public Funcionario getFuncionarioReserva(){ return this.funcionarioReserva; }
    public void setFuncionarioReserva(Funcionario funcionarioReserva){ this.funcionarioReserva = funcionarioReserva; }

    public Funcionario getFuncionarioFechamento(){ return this.funcionarioFechamento; }
    public void setFuncionarioFechamento(Funcionario funcionarioFechamento){ this.funcionarioFechamento = funcionarioFechamento; }

    public Date getDataEntradaReserva(){ return this.dataEntradaReserva; }
    public void setDataEntradaReserva(Date dataEntradaReserva){ this.dataEntradaReserva = dataEntradaReserva; }

    public Date getDataSaidaReserva(){ return this.dataSaidaReserva; }
    public void setDataSaidaReserva(Date dataSaidaReserva){ this.dataSaidaReserva = dataSaidaReserva; }

    public Date getDataCheckin(){ return this.dataCheckin; }
    public void setDataCheckin(Date dataCheckin){ this.dataCheckin = dataCheckin; }

    public Date getDataCheckout(){ return this.dataCheckout; }
    public void setDataCheckout(Date dataCheckout){ this.dataCheckout = dataCheckout; }

    public double getValorReserva(){ return this.valorReserva; }
    public void setValorReserva(double valorReserva){ this.valorReserva = valorReserva; }

    public double getValorPago(){ return this.valorPago; }
    public void setValorPago(double valorPago){ this.valorPago = valorPago; }

    public void pagarReserva(double valor) {

    }
}
