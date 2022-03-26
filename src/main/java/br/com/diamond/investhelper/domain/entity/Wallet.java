package br.com.diamond.investhelper.domain.entity;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "WALLET")
public class Wallet {

  @Id
  @Column(name = "IDT_WALLET")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "NAM_WALLET", nullable = false)
  private String name;

  @JoinColumn(name = "IDT_WALLET")
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<WalletItem> walletItemSet;

  @CreationTimestamp
  @Column(name = "DAT_CREATE")
  private LocalDateTime datCreate;

  @UpdateTimestamp
  @Column(name = "DAT_UPDATE")
  private LocalDateTime datUpdate;
}
