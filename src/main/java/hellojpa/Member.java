package hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
// @Table(name = "Member") 테이블과 이름 같으면 안써도 됨
public class Member {

    @Id
    private Long id;
    private String name;


}
