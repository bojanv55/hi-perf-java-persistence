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

    //post_with_collection_list_of_strings (post_with_collection_id, list_of_strings)
    //should be SET, since LIST is not optimal
    //consider using bidirectional one-to-many association
    @ElementCollection  //generates table with one string column and FK to this entity
    private List<String> listOfStrings = new ArrayList<>();

    //post_with_collection_list_of_complex (post_with_collection_id, attrib1, attrib2, attrib3)
    //should be SET, since LIST is not optimal
    //consider using bidirectional one-to-many association
    @ElementCollection//generates table with columns from ComplexElement and FK to this entity
    private List<ComplexElement> listOfComplex = new ArrayList<>();

    public void addString(String s){
        listOfStrings.add(s);
    }

    public void addComplex(ComplexElement c){
        listOfComplex.add(c);
    }
}
