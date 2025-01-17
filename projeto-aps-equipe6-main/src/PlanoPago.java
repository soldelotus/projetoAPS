import java.util.Date;;

public class PlanoPago extends Planos {
    private String tipo_pagamento; 
    private Date data_Renovacao;

    public PlanoPago (String nome_plano, double preco, Date dataInicioPlano, Date dataTerminoPlano, String tipo_pagamento, Date data_Renovacao){
        super("Pago", 20, dataInicioPlano, dataTerminoPlano);
        this.tipo_pagamento =tipo_pagamento;
        this.data_Renovacao = data_Renovacao;
    }

    public String getTipo_pagamento() {
        return tipo_pagamento;
    }
    public Date getData_Renovacao() {
        return data_Renovacao;
    }
    public void setTipo_pagamento(String tipo_pagamento) {
        this.tipo_pagamento = tipo_pagamento;
    }
    public void setData_Renovacao(Date data_Renovacao) {
        this.data_Renovacao = data_Renovacao;
    }
}
