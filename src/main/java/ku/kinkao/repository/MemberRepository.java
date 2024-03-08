package ku.kinkao.repository;


import ku.kinkao.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MemberRepository extends JpaRepository<Member,Integer> {


    // SELECT * FROM Member WHERE username = ‘username in parameter’
    Member findByUsername(String username);


}
