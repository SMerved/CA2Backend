package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(name = "Currency.deleteAllRows", query = "DELETE from Currency")
public class Currency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Currency() {
    }

    private String abr;
    private String full;

    public Currency(String dummyStr1, String dummyStr2) {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAbr() {
        return abr;
    }

    public void setAbr(String abr) {
        this.abr = abr;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

}

