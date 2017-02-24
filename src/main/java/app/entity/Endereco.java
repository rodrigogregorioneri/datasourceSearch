package app.entity;
import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe que representa a tabela ENDERECO
 * @generated
 */
@Entity
@Table(name = "\"ENDERECO\""
)
@XmlRootElement
public class Endereco implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1795675126l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id", insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  /**
   * @generated
   */
  @Column(name = "cidade", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String cidade;
  /**
   * @generated
   */
  @Column(name = "estado", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String estado;
  /**
   * @generated
   */
  @Column(name = "cep", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String cep;
  
  /**
   * Construtor
   * @generated
   */
  public Endereco(){
  }

  
  /**
   * Obtém id
   * @param id id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public Endereco setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém cidade
   * @param cidade cidade
   * return cidade
   * @generated
   */
  public java.lang.String getCidade(){
    return this.cidade;
  }
  
  /**
   * Define cidade
   * @param cidade cidade
   * @generated
   */
  public Endereco setCidade(java.lang.String cidade){
    this.cidade = cidade;
    return this;
  }
  
  /**
   * Obtém estado
   * @param estado estado
   * return estado
   * @generated
   */
  public java.lang.String getEstado(){
    return this.estado;
  }
  
  /**
   * Define estado
   * @param estado estado
   * @generated
   */
  public Endereco setEstado(java.lang.String estado){
    this.estado = estado;
    return this;
  }
  
  /**
   * Obtém cep
   * @param cep cep
   * return cep
   * @generated
   */
  public java.lang.String getCep(){
    return this.cep;
  }
  
  /**
   * Define cep
   * @param cep cep
   * @generated
   */
  public Endereco setCep(java.lang.String cep){
    this.cep = cep;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id == null) ? 0 : id.hashCode());

        return result;
    }
  
  /**
   * @generated
   */ 
  @Override
    public boolean equals(Object obj) {
    
      if(this == obj)
        return true;
      
      if(obj == null)
        return false;
      
      if(!(obj instanceof Endereco))
        return false;
      
      Endereco other = (Endereco)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}