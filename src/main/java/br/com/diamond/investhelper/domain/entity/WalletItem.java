package br.com.diamond.investhelper.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "WALLET_ITEM")
public class WalletItem {

  @Id
  @Column(name = "IDT_WALLET_ITEM")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToOne
  @JoinColumn(name = "IDT_STOCK")
  private Stock stock;

  @Column(name = "NUM_NOTE", nullable = false)
  private Integer note;

  @Column(name = "NUM_QUANTITY", nullable = false)
  private Long quantity;

  @Column(name = "DAT_LAST_UPDATE_NOTE", nullable = false)
  private LocalDateTime lastUpdateNote;

  @CreationTimestamp
  @Column(name = "DAT_CREATE")
  private LocalDateTime datCreate;

  @UpdateTimestamp
  @Column(name = "DAT_UPDATE")
  private LocalDateTime datUpdate;
}
