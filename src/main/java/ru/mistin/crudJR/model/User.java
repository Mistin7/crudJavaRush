package ru.mistin.crudJR.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by chekuninalexey on 24.06.17.
 */

@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name="users_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="users_name")
    private String name;

    @Column(name="users_age")
    private int age;

    @Column(name="users_isAdmin")
    private boolean admin;

    @Column(name = "users_createdDate")
    private Timestamp createDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", admin=" + admin +
                ", createDate=" + createDate +
                '}';
    }
}
