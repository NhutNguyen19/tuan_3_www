package vn.edu.iuh.fit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    @NotNull
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Size(max = 225)
    @Column(name = "NAME", length = 225)
    private String name;

    @Size(max = 225)
    @Column(name = "EMAIL", length = 225)
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}