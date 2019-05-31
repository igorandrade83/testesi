package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela DT
 * @generated
 */
@Entity
@Table(name = "\"DT\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.dt")
public class dt implements Serializable {

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
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "dataHoraFuso", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataHoraFuso;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIME)
  @Column(name = "hora", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date hora;

  /**
   * Construtor
   * @generated
   */
  public dt(){
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
  public dt setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém dataHoraFuso
   * return dataHoraFuso
   * @generated
   */
  
  public java.util.Date getDataHoraFuso(){
    return this.dataHoraFuso;
  }

  /**
   * Define dataHoraFuso
   * @param dataHoraFuso dataHoraFuso
   * @generated
   */
  public dt setDataHoraFuso(java.util.Date dataHoraFuso){
    this.dataHoraFuso = dataHoraFuso;
    return this;
  }

  /**
   * Obtém data
   * return data
   * @generated
   */
  
  public java.util.Date getData(){
    return this.data;
  }

  /**
   * Define data
   * @param data data
   * @generated
   */
  public dt setData(java.util.Date data){
    this.data = data;
    return this;
  }

  /**
   * Obtém hora
   * return hora
   * @generated
   */
  
  public java.util.Date getHora(){
    return this.hora;
  }

  /**
   * Define hora
   * @param hora hora
   * @generated
   */
  public dt setHora(java.util.Date hora){
    this.hora = hora;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    dt object = (dt)obj;
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
