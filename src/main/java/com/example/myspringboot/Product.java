package com.example.myspringboot;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
@RequiredArgsConstructor
//H@AllArgsConstructor

public class Product {
    @NonNull private Integer id;
    private String name;



    public Product(@NonNull final Integer id, final String name) {
        if (id == null) {
            throw new NullPointerException("id is marked @NonNull but is null");
        } else {
            this.id = id;
            this.name = name;
        }
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getId().equals( product.getId() ) &&
                getName().equals( product.getName() );
    }

    @Override
    public int hashCode() {
        return Objects.hash( getId(), getName() );
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


