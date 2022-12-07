package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
  private String nome;
  private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
  private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

  public void inscreverBootcamp(Bootcamp bootcamp){}
  
  public void progredir(){}

  public void calcularTotalXp(){}

  public String getNome(){
    return nome;
   }
  
    public void setNome(String nome){
      this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos(){
      return conteudoInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos){
      this.conteudoInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos(){
      return conteudoConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos){
      this.conteudoConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o){
      if(this == o) return true;
      if(o == null || getClass() != o.getClass()) return false;
      Dev dev = (Dev) o;
      return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscritos, dev.conteudoInscritos) && Objects.equals(conteudoConcluidos, dev.conteudoConcluidos);
    }

    @Override
    public int hashCode(){
      return Objects.hash(nome, conteudoInscritos, conteudoConcluidos);
    }
}
