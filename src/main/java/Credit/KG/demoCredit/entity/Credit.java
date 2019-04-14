package Credit.KG.demoCredit.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "credits")

public class Credit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    private BigDecimal sum;
    private Integer percentRate;
    private Integer term;
    private LocalDateTime dateCredit;
    private BigDecimal percentMonthly;
    private LocalDateTime datePercent;


    public Credit() {

    }

    public Credit(Client client, BigDecimal sum, Integer percentRate, Integer term, BigDecimal percentMonthly,LocalDateTime dateCredit, LocalDateTime datePercent) {
        this.client = client;
        this.sum = sum;
        this.percentRate = percentRate;
        this.term = term;
        this.dateCredit = dateCredit;
        this.percentMonthly = percentMonthly;
        this.datePercent = datePercent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public Integer getPercentRate() {
        return percentRate;
    }

    public void setPercentRate(Integer percentRate) {
        this.percentRate = percentRate;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public LocalDateTime getDateCredit() {
        return dateCredit;
    }

    public void setDateCredit(LocalDateTime dateCredit) {
        this.dateCredit = dateCredit;
    }

    public BigDecimal getPercentMonthly() {
        return percentMonthly;
    }

    public void setPercentMonthly(BigDecimal percentMonthly) {
        this.percentMonthly = percentMonthly;
    }

    public LocalDateTime getDatePercent() {
        return datePercent;
    }

    public void setDatePercent(LocalDateTime datePercent) {
        this.datePercent = datePercent;
    }
}
