import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

function BoardEdit() {
  const { id } = useParams();
  const [board, setBoard] = useState({ boardWriter: "", boardSubject: "", boardContent: "" });
  const navigate = useNavigate();

  useEffect(() => {
    console.log(`${id}`);
    fetch(`http://localhost:8080/api/boards/${id}`)
      .then((res) => {
        if (!res.ok) throw new Error("Post not found");
        return res.json();
      })
      .then((data) => setBoard(data))
      .catch(() => navigate("/posts")); // Redirect if post not found
  }, [id, navigate]);

  const handleSubmit = (e) => {
    e.preventDefault();
    fetch(`http://localhost:8080/api/boards/${id}`, {
      method: "PUT",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(board),
    }).then(() => navigate(`/posts/${id}`)); // 잘못된 URL을 수정
  };

  const handleChange = (e) => {
    const { name, value } = e.target;
    setBoard((prevBoard) => ({ ...prevBoard, [name]: value }));
  };

  return (
    <form onSubmit={handleSubmit}>
      <h1>게시글 수정</h1>
      <input
        name="boardWriter" // 상태 객체의 키와 일치
        placeholder="작성자"
        value={board.boardWriter}
        onChange={handleChange}
      />
      <input
        name="boardSubject" // 상태 객체의 키와 일치
        placeholder="제목"
        value={board.boardSubject}
        onChange={handleChange}
      />
      <textarea
        name="boardContent" // 상태 객체의 키와 일치
        placeholder="내용"
        value={board.boardContent}
        onChange={handleChange}
      ></textarea>
      <button type="submit">수정</button>
    </form>
  );
}

export default BoardEdit;
