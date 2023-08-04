<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page import="hello.servlet.domain.member.MemberRepository" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  //request, response는 따로 안불러다줘도 사용 가능함
  MemberRepository memberRepository = MemberRepository.getInstance();
  //MemberSaveServlet.java 비즈니스 로직부분 가져옴.
  System.out.println("MemberSaveServlet.service");

  //parameter로 들어온 정보 파싱
  String username = request.getParameter("username");
  int age = Integer.parseInt(request.getParameter("age"));

  //member 객체 생성 후 리포지토리에 저장
  Member member = new Member(username, age);
  memberRepository.save(member);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
  <li>id=<%=member.getId()%></li>
  <li>username=<%=member.getUsername()%></li>
  <li>age=<%=member.getAge()%></li>
</ul>
<a href = "/index.html">메인</a>
</body>
</html>
