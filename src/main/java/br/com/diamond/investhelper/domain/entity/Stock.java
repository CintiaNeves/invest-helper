package br.com.diamond.investhelper.domain.entity;

import br.com.diamond.investhelper.domain.entity.enums.StockType;
import lombok.Data;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@Table
public class Stock {

  @Id
  @Column(name = "IDT_STOCK")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "COD_STOCK")
  private String code;

  @Column(name = "NAM_STOCK")
  private String name;

  @Column(name = "NAM_TYPE")
  private StockType stockType;

  @Column(name = "NAM_DEPARTMENT")
  private String department;

  @CreationTimestamp
  @Column(name = "DAT_CREATE")
  private LocalDateTime datCreate;

  @UpdateTimestamp
  @Column(name = "DAT_UPDATE")
  private LocalDateTime datUpdate;
}
