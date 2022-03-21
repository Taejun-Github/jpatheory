package hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Team {
    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private String id;

    @Column(name = "TEAM_NAME")
    private String name;

//    @Column(name = "TEAM_ID")
//    private Long teamId;

    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<>();
}
