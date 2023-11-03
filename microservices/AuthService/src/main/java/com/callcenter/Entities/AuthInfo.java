package com.callcenter.Entities;


import com.callcenter.Entities.Constant.InitializedValueConventions;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "auth_info")
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
public class AuthInfo implements UserDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long user_id;
    private String user_phone;
    private String password;
    private Integer user_role;
    private Integer user_status;

    public AuthInfo() {
        this.user_id = InitializedValueConventions.NON_VALUE_INITIALIZED_LONG;
        this.user_phone = InitializedValueConventions.NON_VALUE_INITIALIZED_STRING;
        this.password = InitializedValueConventions.NON_VALUE_INITIALIZED_STRING;
        this.user_role = InitializedValueConventions.NON_VALUE_INITIALIZED_INTEGER;
        this.user_status = InitializedValueConventions.NON_VALUE_INITIALIZED_INTEGER;
    }

    public AuthInfo(Long user_id, String user_phone, String password, Integer user_role, Integer user_status) {
        this.user_id = user_id;
        this.user_phone = user_phone;
        this.password = password;
        this.user_role = user_role;
        this.user_status = user_status;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUser_role() {
        return user_role;
    }

    public void setUser_role(Integer user_role) {
        this.user_role = user_role;
    }

    public Integer getUser_status() {
        return user_status;
    }

    public void setUser_status(Integer user_status) {
        this.user_status = user_status;
    }

    @Override
    public String toString() {
        return "AuthInfo{" +
                "user_id=" + user_id +
                ", user_phone='" + user_phone + '\'' +
                ", password='" + password + '\'' +
                ", user_role=" + user_role +
                ", user_status=" + user_status +
                '}';
    }


    //this method should return the list of roles,
    //if the table of user in the database doesn't have ROLE attribute for each record
    //you should provide/create it

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities()
    {
        return List.of(new SimpleGrantedAuthority(user_role.toString()));
    }

    @Override
    public String getUsername() {
        return user_phone;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
