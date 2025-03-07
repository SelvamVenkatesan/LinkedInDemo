package model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user_profile")
public class UserProfileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String educationDetails;
    private String domain;
    private String experience;
    private String companyName;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
