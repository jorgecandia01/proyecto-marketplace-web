package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("TABLE_CONTACT")
public class Contact {
    private @Column("ID") @Id Long id;
    private @Column("FECHA") LocalDate fecha;
    private @Column("BODY") String body;
    private @Column("IDUSER") String idUser; //COMO LO HAGO FOREIGN KEY??
}