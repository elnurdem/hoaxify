package com.example.ws.user;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name="users")
public class User {
    @Id //primary key olduğunu belirtmek için id anotasyonu ekledin
    @GeneratedValue //idnin nasıl üretileceğini belirttin bunu hibernate yapıyo
    private long id;
    @NotNull
    @UniqueUsername
    @Size(min=4, max=255)
    private String username;

    @NotNull
    @Size(min=4, max=255)
    private String displayName;

    @NotNull
    @Pattern(regexp="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$")
    private String password;


    //Requestbody ile iletilen json mesajını senin belirttiğin (@RequestBody User user) ile
    //user objesinin key'lerine yazıyor. Nasıl yazıyor?
    // Getter/setterlar ile.
    // jackson kütüphanesini kullanarak.

    //Sen şimdi burda getter setter görmüyorsun.
    //Çünkü lombok @Data ile senin için oluşturdu.
    // temiz kod görünümü sağladı.



    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", displayName='" + displayName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
