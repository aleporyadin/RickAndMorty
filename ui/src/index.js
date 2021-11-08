import React from "react";
import ReactDOM from "react-dom";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import TableCharacter from "./TableCharacter";

ReactDOM.render(
  <BrowserRouter>
    <Routes>
      <Route path="/" element={<TableCharacter />}/>
    </Routes>
  </BrowserRouter>,

  document.getElementById("root")
);
