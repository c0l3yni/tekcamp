import react, { useState } from "react";



function ProductPage () {
  const [message, setMessage] = useState("");

  function onInputChange(event) {
    setMessage(event.target.value);
  }

  function onFormSubmit(event) {
    event.preventDefault();
    setMessage("");
  }

  return (
    <div>
      <form onSubmit={onFormSubmit}>
        <label>
        <input
          className="input"
          type="text"
          onChange={onInputChange}
          value={message}
        />
        </label>
        <button className="input-button" type="submit">
          Search
        </button>
      </form>
    </div>
  )
}
export default ProductPage;