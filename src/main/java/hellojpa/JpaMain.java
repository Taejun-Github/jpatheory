package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
//            Member member = new Member();
//
//            member.setId(2L);
//            member.setName("A");
//
//            em.persist(member);

//            Member findMember = em.find(Member.class, 1L);
//
//            System.out.println(findMember.getId());
//            System.out.println(findMember.getName());

//            Member findMember = em.find(Member.class, 1L);
//            findMember.setName("Test");

            Team team = new Team();
            team.setName("TeamA");
            em.persist(team);

//            Member member = new Member();
//            member.setUsername("member1");
//            member.setTeamId(member.getTeamId());
//            em.persist(member);
//
//            Member member1 = em.find(Member.class, member.getId());


            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
