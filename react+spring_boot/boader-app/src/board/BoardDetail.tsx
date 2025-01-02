import { useEffect, useState } from "react";
import { useNavigate, useParams, Link } from "react-router-dom";

function BoardDetail() {
  const { id } = useParams();
  const [board, setBoard] = useState(null);
  const navigate = useNavigate();

  useEffect(() => {
    fetch(`http://localhost:8080/api/boards/${id}`)
      .then((res) => {
        if (!res.ok) throw new Error("Post not found");
        return res.json();
      })
      .then((data) => setBoard(data))
      .catch(() => navigate("/posts")); // Redirect if post not found
  }, [id, navigate]);

  const handleDelete = () => {
    fetch(`http://localhost:8080/api/boards/${id}`, { method: "DELETE" })
      .then(() => navigate("/posts"));
  };

  if (!board) return <p>Loading...</p>;

  return (
    <div>
      <h1>{board.boardSubject}</h1>
      <p>작성자: {board.boardWriter}</p>
      <p>{board.boardContent}</p>
      <Link to={`/posts/${id}/edit`}>수정</Link>
      <button onClick={handleDelete}>삭제</button>
      <Link to="/posts">목록으로</Link>
    </div>
  );
}

export default BoardDetail;
