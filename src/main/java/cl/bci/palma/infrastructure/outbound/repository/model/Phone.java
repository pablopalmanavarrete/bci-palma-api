package cl.bci.palma.infrastructure.outbound.repository.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "phone")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "number", nullable = false)
    private String number;

    @Column(name = "countryCode", nullable = false)
    private String countryCode;

    @Column(name = "cityCode", nullable = false)
    private String cityCode;

    @ManyToOne
    @Column(name = "user_id", nullable = false)
    private User user;
}
