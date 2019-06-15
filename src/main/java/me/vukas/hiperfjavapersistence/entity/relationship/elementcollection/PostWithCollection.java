package me.vukas.hiperfjavapersistence.entity.relationship.elementcollection;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class PostWithCollection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    private List<String> listOfStrings = new ArrayList<>();

    @ElementCollection
    private List<ComplexElement> listOfComplex = new ArrayList<>();

    public void addString(String s){
        listOfStrings.add(s);
    }

    public void addComplex(ComplexElement c){
        listOfComplex.add(c);
    }
}