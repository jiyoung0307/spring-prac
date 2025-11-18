package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;
// 기능
public interface MemberRepository {

    Member save(Member member); // 회원 저장

    Optional<Member> findById(Long id); // id 반환

    Optional<Member> findByName(String name);   // 이름 반환

    List<Member> findAll(); // 지금까지 저장된 모든 회원 리스트 반환
}
