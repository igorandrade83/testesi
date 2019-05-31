package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CIDADE
 * @generated
 */
@Entity
@Table(name = "\"CIDADE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.cidade")
public class cidade implements Serializable {

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
  @Column(name = "nome_cid", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome_cid;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_estado", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private estado estado;

  /**
   * Construtor
   * @generated
   */
  public cidade(){
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
  public cidade setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome_cid
   * return nome_cid
   * @generated
   */
  
  public java.lang.String getNome_cid(){
    return this.nome_cid;
  }

  /**
   * Define nome_cid
   * @param nome_cid nome_cid
   * @generated
   */
  public cidade setNome_cid(java.lang.String nome_cid){
    this.nome_cid = nome_cid;
    return this;
  }

  /**
   * Obtém estado
   * return estado
   * @generated
   */
  
  public estado getEstado(){
    return this.estado;
  }

  /**
   * Define estado
   * @param estado estado
   * @generated
   */
  public cidade setEstado(estado estado){
    this.estado = estado;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    cidade object = (cidade)obj;
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
