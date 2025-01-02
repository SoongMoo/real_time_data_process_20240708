
import { useState } from "react";
import { useNavigate } from "react-router-dom";

function BoardCreate() {
  const [boardWriter, setBoardWriter] = useState("");
  const [boardSubject, setBoardSubject] = useState("");
  const [boardContent, setBoardContent] = useState("");
  const navigate = useNavigate();

  const handleSubmit = (e) => {
    e.preventDefault();
    fetch("http://localhost:8080/api/boards", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ boardWriter, boardSubject, boardContent }),
    }).then(() => navigate("/posts"));
  };

  return (
    <form onSubmit={handleSubmit}>
      <h1>글쓰기</h1>
      <input
        placeholder="작성자"
        value={boardWriter}
        onChange={(e) => setBoardWriter(e.target.value)}
      />
      <input
        placeholder="제목"
        value={boardSubject}
        onChange={(e) => setBoardSubject(e.target.value)}
      />
      <textarea
        placeholder="내용"
        value={boardContent}
        onChange={(e) => setBoardContent(e.target.value)}
      ></textarea>
      <button type="submit">등록</button>
    </form>
  );
}

export default BoardCreate;