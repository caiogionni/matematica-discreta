package com.mycompany.atvavaliativa1;
import java.time.LocalDate;

public class OrdemServ {
    private int cod;
    private String nomeCliente;
    private String modeloVeiculo;
    private String placaVeiculo;
    private String status;
    private LocalDate data;
    private double valorEst;
    private Servico servico;

    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the modeloVeiculo
     */
    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    /**
     * @param modeloVeiculo the modeloVeiculo to set
     */
    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    /**
     * @return the placaVeiculo
     */
    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    /**
     * @param placaVeiculo the placaVeiculo to set
     */
    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the data
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * @return the valorEst
     */
    public double getValorEst() {
        return valorEst;
    }

    /**
     * @param valorEst the valorEst to set
     */
    public void setValorEst(double valorEst) {
        this.valorEst = valorEst;
    }

    /**
     * @return the servico
     */
    public Servico getServico() {
        return servico;
    }

    /**
     * @param servico the servico to set
     */
    public void setServico(Servico servico) {
        this.servico = servico;
    }
    
    public OrdemServ(int cod, String nomeCliente, String modeloVeiculo, String placaVeiculo, String status, LocalDate data, double valorEst, Servico servico){
        this.cod = cod;
        this.nomeCliente = nomeCliente;
        this.modeloVeiculo = modeloVeiculo;
        this.placaVeiculo = placaVeiculo;
        this.status  = status;
        this.data = data;
        this.valorEst = valorEst;
        this.servico = servico;
    }
    
    public void CadastroOrdem(int cod, String nomeCliente, String modeloVeiculo, String placaVeiculo, String status, LocalDate data, double valorEst, Servico servico){
        this.cod = cod;
        this.nomeCliente = nomeCliente;
        this.modeloVeiculo = modeloVeiculo;
        this.placaVeiculo = placaVeiculo;
        this.status  = status;
        this.data = data;
        this.valorEst = valorEst;
        this.servico = servico;
    }   
}