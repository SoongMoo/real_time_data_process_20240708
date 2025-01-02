import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import BoardList from "./board/BoardList";
import BoardCreate from "./board/BoardCreate";
import BoardDetail from "./board/BoardDetail";
import BoardEdit from "./board/BoardEdit";

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/posts" element={<BoardList />} />
        <Route path="/posts/new" element={<BoardCreate />} />
        <Route path="/posts/:id" element={<BoardDetail />} />
        <Route path="/posts/:id/edit" element={<BoardEdit />} />
      </Routes>
    </Router>
  );
}

export default App;
