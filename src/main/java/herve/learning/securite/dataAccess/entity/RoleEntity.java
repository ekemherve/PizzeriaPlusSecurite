package herve.learning.securite.dataAccess.entity;

import herve.learning.securite.model.RoleEnum;
import herve.learning.securite.model.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Roles")
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role", unique = true)
    @NotNull
    @Enumerated(EnumType.STRING)
    private RoleEnum role;

    @OneToMany(mappedBy = "role")
    Set<UserEntity> userEntities = new HashSet<>();

    public RoleEntity() {
    }

    public RoleEntity(RoleEnum role, Set<UserEntity> userEntities) {
        this.role = role;
        this.userEntities = userEntities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public Set<UserEntity> getUserEntities() {
        return userEntities;
    }

    public void setUserEntities(Set<UserEntity> userEntities) {
        this.userEntities = userEntities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoleEntity)) return false;
        RoleEntity that = (RoleEntity) o;
        return getRole() == that.getRole();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRole());
    }

    @Override
    public String toString() {
        return "RoleEntity{" +
                "id=" + id +
                ", role=" + role +
                '}';
    }
}
