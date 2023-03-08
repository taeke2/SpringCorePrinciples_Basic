package hello.core.member;

public interface MemberService {
    void join(Member membmer);

    Member findMember(Long memberId);
}
