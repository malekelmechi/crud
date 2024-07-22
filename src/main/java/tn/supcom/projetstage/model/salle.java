package tn.supcom.projetstage.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    Long id ;
    int size ;
}









