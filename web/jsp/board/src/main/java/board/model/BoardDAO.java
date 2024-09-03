package board.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	String jdbcURL; // 오라클 주소
	String jdbcDriver; // 오라클에 접속하기 위한 API
	Connection con; // 오라클 접속정보
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	public BoardDAO() {
		jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
		jdbcDriver = "oracle.jdbc.driver.OracleDriver";
	}

	public Connection getConnection() {
		Connection co = null;
		try {
			Class.forName(jdbcDriver);
			co = DriverManager.getConnection(jdbcURL, "miso", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return co;
	}

	public void boardInsert(BoardDTO dto) {
		con = getConnection();
		String boardNum = " select nvl(max(BOARD_NUM ),0) + 1 from board";
		sql = " insert into board(BOARD_NUM,BOARD_WRITER,BOARD_SUBJECT, BOARD_CONTENT )";
		sql += " values ( ( " + boardNum + " ), ?, ?, ?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getBoardWriter());
			pstmt.setString(2, dto.getBoardSubject());
			pstmt.setString(3, dto.getBoardContent());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개행이(가) 삽입되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	public List<BoardDTO> boardSelectAll() {
		con = getConnection();
		sql = " select board_num, board_writer, board_subject, ";
		/// 1 2 3
		sql += "        board_content ";
		// 4
		sql += " from board ";
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setBoardNum(rs.getInt("board_num"));
				dto.setBoardWriter(rs.getString("board_writer"));
				dto.setBoardSubject(rs.getString(3));
				dto.setBoardContent(rs.getString(4));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

	public BoardDTO boardSelectOne(int boardNum) {
		BoardDTO dto = null;
		con = getConnection();
		sql = " select board_num, board_writer, board_subject, board_content ";
		sql += " from board where board_num = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, boardNum);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dto = new BoardDTO();
				dto.setBoardNum(rs.getInt("board_num"));
				dto.setBoardSubject(rs.getString("board_subject"));
				dto.setBoardContent(rs.getString("board_content"));
				dto.setBoardWriter(rs.getString("board_writer"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return dto;
	}

	public void boardUpdate(BoardDTO dto) {
		con = getConnection();
		sql = " update board ";
		sql += " set board_writer = ? , board_subject = ?, board_content = ? ";
		sql += " where board_num = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getBoardWriter());
			pstmt.setString(2, dto.getBoardSubject());
			pstmt.setString(3, dto.getBoardContent());
			pstmt.setInt(4, dto.getBoardNum());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 수정되었습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}
	public void boardDelete(int boardNum) {
		con = getConnection();
		sql = " delete from board where board_num = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, boardNum);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개행이(가) 삭제되었습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}finally { close(); }
	}
	public void close() {
		if (rs != null)
			try {
				rs.close();
			} catch (Exception e) {
			}
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (Exception e) {
			}
		if (con != null)
			try {
				con.close();
			} catch (Exception e) {
			}
	}
}
