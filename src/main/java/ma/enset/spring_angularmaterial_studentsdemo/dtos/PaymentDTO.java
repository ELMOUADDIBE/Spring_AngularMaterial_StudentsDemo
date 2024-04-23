package ma.enset.spring_angularmaterial_studentsdemo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Entity @NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class Payment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private double amount;
    private PaymentType type;
    private PaymentStatus status;
    private String file;
    @ManyToOne
    private Student student;
}
