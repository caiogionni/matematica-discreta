package com.mycompany.atvavaliativa1;
import java.time.LocalDate;

public class Box {
    private Mecanico mecanico;
    private String tipoServico;
    private double maxCap;
    private String local; 
    private int numero;
    private OrdemServ ordemServico;
    
    /**
     * @return the mecanico
     */
    public Mecanico getMecanico() {
        return mecanico;
    }

    /**
     * @param mecanico the mecanico to set
     */
    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    /**
     * @return the tipoServico
     */
    public String getTipoServico() {
        return tipoServico;
    }

    /**
     * @param tipoServico the tipoServico to set
     */
    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    /**
     * @return the maxCap
     */
    public double getMaxCap() {
        return maxCap;
    }

    /**
     * @param maxCap the maxCap to set
     */
    public void setMaxCap(double maxCap) {
        this.maxCap = maxCap;
    }

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the ordemServico
     */
    public OrdemServ getOrdemServico() {
        return ordemServico;
    }

    /**
     * @param ordemServico the ordemServico to set
     */
    public void setOrdemServico(OrdemServ ordemServico) {
        this.ordemServico = ordemServico;
    }
    
    public Box(Mecanico mecanico, String tipoServico, double maxCap, String local, int numero, OrdemServ ordemServico){
        
    this.mecanico = mecanico;
    this.tipoServico = tipoServico;
    this.maxCap = maxCap;
    this.local = local;
    this.numero = numero;
    this.ordemServico = ordemServico;
    }
}
