package com.heysanjeet.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tutorials")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private boolean published;

    public Tutorial(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }
}
