package hello.helloSpring.repository;

import hello.helloSpring.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    // 회원 저장
    Member save(Member member);

    // id로 찾기
    Optional<Member> findById(Long id);

    // 이름으로 찾기
    Optional<Member> findByName(String name);

    // 회원정보 다 가져오기
    List<Member> findAll();
}
