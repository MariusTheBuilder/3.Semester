package org.example.backend.Models;

import java.util.UUID;
public class User {
    public UUID Id = UUID.randomUUID();
    public String Name;

    @Override
    public String toString() {
        return "User{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}
