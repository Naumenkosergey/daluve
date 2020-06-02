package by.itlandia.daluve.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "utiltable")
public class UtilTable {

    @Id
    Integer id;
    String ambulance;
    String doctor;
}
