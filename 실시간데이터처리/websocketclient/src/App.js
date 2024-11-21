// src/App.js

import React, { useEffect, useState } from 'react';
import './App.css';

function App() {
  const [stockData, setStockData] = useState([]);
  const [cumulativeVolume, setCumulativeVolume] = useState(0);
  const [ws, setWs] = useState(null);

  useEffect(() => {
    // WebSocket 서버에 연결
    const socket = new WebSocket('ws://localhost:8080');

    socket.onopen = () => {
      console.log('Connected to WebSocket server');
      setWs(socket);
    };

    socket.onmessage = (event) => {
      const data = JSON.parse(event.data);

      // 최근 데이터 10개만 유지
      setStockData(prevData => [data, ...prevData].slice(0, 10));

      // 누적 거래량 업데이트
      setCumulativeVolume(data.cumulativeVolume);
    };

    socket.onclose = () => {
      console.log('Disconnected from WebSocket server');
    };

    socket.onerror = (error) => {
      console.error('WebSocket error:', error);
    };

    return () => {
      socket.close();
    };
  }, []);

    // 숫자 포맷 함수
  const formatNumber = (number) => {
      return number.toLocaleString();
  };

   // 시간 포맷 함수
   const formatTime = (time) => {
    const hours = time.slice(0, 2);
    const minutes = time.slice(2, 4);
    const seconds = time.slice(4, 6);
    return `${hours}:${minutes}:${seconds}`;
  };

  const formatDate = () => {
    const today = new Date();
    const year = today.getFullYear();
    const month = String(today.getMonth() + 1).padStart(2, '0');
    const day = String(today.getDate()).padStart(2, '0');
    return `${year}-${month}-${day}`;
  };

  return (
    <div className="App">
      <h1>Real-time Stock Data</h1>
      <h2>날짜 : {formatDate()}</h2> {/* 오늘의 날짜 표시 */}
      <h2>삼성전자 누적 거래량: {formatNumber(cumulativeVolume)}</h2>
      <table className="stock-table">
        <thead>
          <tr>
            <th>거래시간</th>
            <th>주식코드</th>
            <th>거래금액</th>
            <th>거래량</th>
          </tr>
        </thead>
        <tbody>
          {stockData.map((stock, index) => (
            <tr key={index}>
              <td>{formatTime(stock.timestamp)}</td>
              <td>{stock.symbol}</td>
              <td>{formatNumber(stock.price)}</td>
              <td>{formatNumber(stock.volume)}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default App;
