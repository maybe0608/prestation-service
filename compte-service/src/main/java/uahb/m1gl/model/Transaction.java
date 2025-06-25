package uahb.m1gl.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private long id;
    private LocalDate dateTransaction;
    private  String type;
    private BigDecimal montant;
    @ManyToOne
    @JoinColumn(name = "compte_id")
    private Compte compte;

}
