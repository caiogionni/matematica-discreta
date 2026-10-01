package com.mycompany.atvavaliativa1;
import java.time.LocalDate;

public class Mecanico {
    private String nome;
    private String cpf;
    private String esp;
    private String telefone;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the Especialidade
     */
    public String getEsp() {
        return esp;
    }

    /**
     * @param esp
     * @param Especialidade the Especialidade to set
     */
    public void setEsp(String esp) {
        this.esp = esp;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public Mecanico(String nome, String cpf, String esp, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.esp = esp;
        this.telefone = telefone;
    }
    
    public void AssociarBox(){
        
    }
}
