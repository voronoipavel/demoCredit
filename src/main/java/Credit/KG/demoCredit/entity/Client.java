package Credit.KG.demoCredit.entity;

import Credit.KG.demoCredit.model.Status;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String login;


    private String password;
    @Column(unique=true, nullable=false)
    private String inn;

    private String fullName;

    private Status status;

    public Client() {
    }


    public Client(String login, String password, String inn, String fullName) {
        this.login = login;
        this.password = password;
        this.inn = inn;
        this.fullName = fullName;
        this.status = Status.REGISTRATION;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}