package com.mvcproject.member.controller.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvcproject.member.controller.model.vo.Member;

@Repository	// @Controller와 비슷함, dao위에 만들어줘야함 쓰면 클래스를 자동으로 생성해줌
public class MemberDAO {

	@Autowired	// 무조건 붙여줘야함. 안쓰면 불러오기만하고 쓴다고는 안하는 것임. DB정보가 있으면 넣어주라는 뜻.
	private SqlSessionTemplate sqlSession;	// DB접속기능. root-context.xml에서 확인 가능
	/* 이를 통해 member-mapper.xml에서 
	<select id="selectMemberAll" resultMap="resultMember">
		SELECT * FROM MEMBER
	</select>
	을 실행할 수 있음.	 */
	
	// 생성자가 필요할 수도 있으니 일단 넣어줌.
	public MemberDAO() {
		
	}
	
	// member-mapper.xml에 있던 sql문 실행한 id를 받아옴.
	public List<Member> selectMemberAll() throws Exception {
		// select * from Member 이기때문에 selectOne이 아니고 selectList를 사용함.
		// member-mapper.xml에서 namespace확인하고, sql문 사용한 id를 가져옴
		// list기 때문에 list 객체 생성 = sqlSession.selectList(namespace이름.sql문 id);
		List<Member> memberList = sqlSession.selectList("Member.selectMemberAll");
		return memberList;
	}
	
	// id 받아오기
	public Member selectMember(String userid) throws Exception {
		// 하나만 갖고오는거니까 selectOne을 씀
		Member member = sqlSession.selectOne("Member.selectMember", userid);
		return member;
		
	}
	
	// delete, insert, update는 int로 반환값 해야함!!!
	// 회원 삭제
	public int deleteMember(Member member) throws Exception {
		int cnt = sqlSession.delete("Member.deleteMember", member);
		return cnt;
	}
	
	// 회원 생성
	public int insertMember(Member member) throws Exception {
		int cnt = sqlSession.insert("Member.insertMember", member);
		return cnt;
	}
	
	// 회원 수정
	public int updateMember(Member member) throws Exception {
		int cnt = sqlSession.update("Member.updateMember", member);
		return cnt;
	}
	
	
}
