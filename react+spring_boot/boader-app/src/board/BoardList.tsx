import { Link } from "react-router-dom";
import { useEffect, useState } from "react";

function BoardList() {
  const [boards, setBoards] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/api/boards")
      .then((res) => res.json())
      .then((data) => setBoards(data));
  }, []);

  return (
    <div>
      <h1>게시글 목록</h1>
      <Link to="/posts/new">글쓰기</Link>
      <table>
        {boards.map((board) => (
            <tr>
                <td key={board.boardNum}>
                    <Link to={`/posts/${board.boardNum}`}>{board.boardNum}</Link>
                </td>
                <td key={board.boardWriter}>
                    <Link to={`/posts/${board.boardNum}`}>{board.boardWriter}</Link>
                </td>
                <td key={board.boardNum}>
                    {board.boardSubject}
                </td>
            </tr>
        ))}
      </table>
    </div>
  );
}

export default BoardList;