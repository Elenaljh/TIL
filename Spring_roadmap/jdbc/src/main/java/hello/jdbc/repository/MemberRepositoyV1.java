package hello.jdbc.repository;

import hello.jdbc.connection.DBConnectionUtil;
import hello.jdbc.domain.Member;
import lombok.extern.slf4j.Slf4j;

import java.sql.*;
import java.util.NoSuchElementException;

@Slf4j
public class MemberRepositoyV0 {

    // 저장 메서드
    public Member save(Member member) throws SQLException {
        String sql = "insert into member(member_id, money) values (?, ?)";
        //아래에서 pstmt.setXX(n, member.getXXX())를 통해서 ?를 채워줄것임

        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = getConnection(); //driver manager을 통해 connection 획득
            pstmt = con.prepareStatement(sql); //pstmt: preparedStatement
            pstmt.setString(1, member.getMemberId());
            pstmt.setInt(2, member.getMoney());
            pstmt.executeUpdate(); //만든 sql문을 db에 반영, 영향받은 row 수(int)를 반환
            return member;

        } catch (SQLException e) {
            log.error("db error", e);
            throw e;
        } finally {
            close(con, pstmt, null); //둘 다 닫아줘야한다 (con, pstmt의 선언순서의 역순으로 닫아줌)
            //외부 리소스를 쓰는거기 때문에 쓰고나서 연결 안닫으면 큰일남
        }

    }

    public Member findById(String memberId) throws SQLException {

        String sql = "select * from member where member_id = ?";

        Connection con = null;
        PreparedStatement pstmt = null;  //try-catch에서 써야해서 일부러 밖에다가 선언
        ResultSet rs = null;

        try {
            con = getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, memberId);

            rs = pstmt.executeQuery();//select 쿼리 실행, resultSet 반환
            if (rs.next()) { //rs 내부에 커서가 있는데 무조건 한번은 next해줘야 데이터에 접근가능
                Member member = new Member();
                member.setMemberId(rs.getString("member_id"));
                member.setMoney(rs.getInt("money"));
                return member;
            } else {
                //rs.next()에 데이터 없으면 예외 던짐
                throw new NoSuchElementException("member not found memberId=" + memberId);
            }
        } catch (SQLException e) {
            log.error("db error", e);
            throw e;
        } finally {
            close(con, pstmt, rs); //사용한 외부 리소스와의 연결 닫기 중요!!
        }

    }

    public void update(String memberId, int money) throws SQLException {
        String sql = "update member set money=? where member_id=?";

        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, money);
            pstmt.setString(2, memberId);
            int resultSize = pstmt.executeUpdate(); //sql문 db에 반영, 영향받은 row수 반환
            log.info("resultSize={}", resultSize);
        } catch (SQLException e) {
            log.error("db error", e);
            throw e;
        } finally {
            close(con, pstmt, null);
        }

    }

    public void delete(String memberId) throws SQLException {
        String sql = "delete from member where member_id=?";

        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, memberId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            log.error("db error", e);
            throw e;
        } finally {
            close(con, pstmt, null);
        }
    }






    /////================보조 메서드==================/////////
    //만약 pstmt.close()에서 exception 터져서 connection을 닫지 못하게 된다면 어떡함?
    //을 해결하기 위한 메서드
    private void close(Connection con, Statement stmt, ResultSet rs) {

        if (rs != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                log.info("error", e);
            }
        }

        if (stmt != null) {
            try {
                stmt.close(); //여기서 Exception 터져도
            } catch (SQLException e) {
                log.info("error", e); //여기서 예외 잡아서 로그 날림
            }
        }
        if (con != null) {
            try {
                con.close(); //따라서 프로그램이 비정상 종료되지 않으므로 con도 닫을 수 있음
            } catch (SQLException e) {
                log.info("error", e);
            }
        }
    }

    private static Connection getConnection() {
        return DBConnectionUtil.getConnection();
    }
}
