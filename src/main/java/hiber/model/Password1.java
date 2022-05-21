package hiber.model;

import com.testdata.onetoone.model.Owner;

import javax.persistence.*;

@Entity
@Table(name = "password2")
public class Password1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "seria")
    private String seria;

    @Column(name = "number")
    private String number;

    @OneToOne(mappedBy = "password2", cascade = CascadeType.ALL)
    private User1 user1;

    public User1 getUser1() {
        return user1;
    }

    public void setUser1(User1 user1) {
        this.user1 = user1;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Password1{" +
                "id=" + id +
                ", seria='" + seria + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeria() {
        return seria;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
