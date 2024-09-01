package Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_REL_TUTOR_DISPONIBILIDADE")
public class TutorDisponibilidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MONITOR")
    private Long id;

    @Column(name = "ID_DISPONIBILIDADE")
    private Long id_disp;
}
