package Credit.KG.demoCredit.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CreditRequest {
    private String login;
    private String password;
    private BigDecimal sum;
    private LocalDateTime dateCredit;

    private int percentRate;
    private int term;

    public CreditRequest(String login, String password, BigDecimal sum, int percentRate, int term) {
        this.login = login;
        this.password = password;
        this.sum = sum;
        this.percentRate = percentRate;
        this.term = term;
        this.dateCredit = LocalDateTime.now();

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public int getPercentRate() {
        return percentRate;
    }

    public void setPercentRate(int percentRate) {
        this.percentRate = percentRate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public LocalDateTime getDateCredit() {
        return dateCredit;
    }

    public void setDateCredit(LocalDateTime dateCredit) {
        this.dateCredit = dateCredit;
    }
}
