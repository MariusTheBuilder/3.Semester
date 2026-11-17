import { useEffect, useState } from "react";

function App() {

  const [message, setMessage] = useState("Loading...");

  useEffect(() => {
    fetch("http://localhost:8080/api/hello")
        .then(res => res.text())
        .then(data => setMessage(data));
  }, []);

  return (
      <div>
        <p>{message}</p>
      </div>
  );
}

export default App;