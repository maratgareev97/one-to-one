package hiber.model;

import com.testdata.onetoone.model.Car;

import javax.persistence.*;

@Entity
@Table(name = "user1")
public class User1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="password2_id",referencedColumnName = "id")
    private Password1 password2;

    public User1(String name, Password1 password1) {
        this.name = name;
        this.password2 = password1;
    }

    public Password1 getPassword1() {
        return password2;
    }

    public void setPassword1(Password1 password1) {
        this.password2 = password1;
    }

    public User1() {
    }

    public User1(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostPersist
    public void postPersist() {}
}
