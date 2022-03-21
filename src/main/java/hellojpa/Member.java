package hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
// @Table(name = "Member") 테이블과 이름 같으면 안써도 됨
public class Member {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name= "USERNAME")
    private String username;

//    @ManyToOne
//    @JoinColumn(name = "TEAM_ID")
//    private Team teamId;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;
}
