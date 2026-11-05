import { useState } from "react";

function App() {
  const [count, setCount] = useState(0);
  function increment() {
    setCount((prevCount) => prevCount + 1);
  }
  function decrement() {
    setCount((prevCount) => prevCount - 1);
  }

  return (
    <>
      <span id="affichage">{count}</span>
      <button
        onClick={() => {
          increment();
        }}
      >
        +
      </button>
      <button onClick={decrement}>-</button>
    </>
  );
}

export default App;
