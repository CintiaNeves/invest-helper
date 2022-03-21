package br.com.diamond.investhelper.domain.entity;

import br.com.diamond.investhelper.domain.enums.StockType;
import lombok.Data;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@Entity
@Table(name = "STOCK",
    uniqueConstraints = @UniqueConstraint(name = "UniqueStockCode.Uk", columnNames = "COD_STOCK"))
public class Stock {

  @Id
  @Column(name = "IDT_STOCK")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "COD_STOCK", unique = true)
  private String code;

  @Column(name = "NAM_STOCK")
  private String name;

  @Column(name = "NAM_TYPE")
  private StockType stockType;

  @Column(name = "NAM_DEPARTMENT")
  private String department;

  @Column(name = "PRICE")
  private Double price;

  @CreationTimestamp
  @Column(name = "DAT_CREATE")
  private LocalDateTime datCreate;

  @UpdateTimestamp
  @Column(name = "DAT_UPDATE")
  private LocalDateTime datUpdate;
}
