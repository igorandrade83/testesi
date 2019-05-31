package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ESTADO
 * @generated
 */
@Entity
@Table(name = "\"ESTADO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.estado")
public class estado implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "nome_est", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome_est;

  /**
   * Construtor
   * @generated
   */
  public estado(){
  }


  /**
   * Obtém id
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
  public estado setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome_est
   * return nome_est
   * @generated
   */
  
  public java.lang.String getNome_est(){
    return this.nome_est;
  }

  /**
   * Define nome_est
   * @param nome_est nome_est
   * @generated
   */
  public estado setNome_est(java.lang.String nome_est){
    this.nome_est = nome_est;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    estado object = (estado)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
