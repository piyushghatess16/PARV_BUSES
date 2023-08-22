import { Link, Switch, Route, Routes } from "react-router-dom";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import Login from "./Login";
import Signup from "./SignUp";
import AddRoute from "./Admin/AddRoute";
import DeleteRoute from "./Admin/DeleteRoute";
import AddStation from "./Admin/AddStation";
import AddBus from "./Admin/AddBus";
import DeleteBus from "./Admin/DeleteBus";
import UserHome from "./UserHome"

function Navbar() {
  var navigate = useNavigate();

  return (
    <div
      
    >
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">
          PARV BUSES
        </a>
        <button
          class="navbar-toggler"
          type="button"
          data-toggle="collapse"
          data-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent"
          aria-expanded="false"
          aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <Link to="/">
              <li class="nav-item active">
                <a class="nav-link" href="#">
                  Home <span class="sr-only">(current)</span>
                </a>
              </li>
            </Link>
            <Link to="/deletebus">
              <li class="nav-item">
                <a class="nav-link" href="#">
                Delete Bus</a>
              </li>
            </Link>

            <Link to="/addroute">
              <li class="nav-item">
                <a class="nav-link" href="#">
                 Add Route
                </a>
              </li>
            </Link>

            <Link to="/signup">
              <li class="nav-item">
                <a class="nav-link " href="#">
                  Sign Up
                </a>
              </li>
            </Link>
            <Link to="/login">
              <li class="nav-item">
                <a class="nav-link " href="#">
                  Login
                </a>
              </li>
            </Link>
          </ul>
          <form class="form-inline my-2 my-lg-0">
            <button

              class="btn btn-outline-success my-2 my-sm-0"
              type="submit">
              LogIn
            </button>
          </form>

          <li class="nav-item dropdown" style={{listStyle:"none"}}>
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Dropdown
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">My Profile</a>
          <a class="dropdown-item" href="#">Change Password</a>
          {/* <div class="dropdown-divider"></div> */}
          <a class="dropdown-item" href="#">Logout</a>
        </div>
      </li>

        </div>
      </nav>

      <Routes>
        <Route exact path="/" Component={UserHome}></Route>
        <Route exact path="/register" Component={Signup}></Route>
        <Route exact path="/addroute" Component={AddRoute}></Route>
        <Route exact path="/deletebus" Component={DeleteBus}></Route>
        <Route exact path="/login" Component={Login}></Route>


        {/* <Route exact path="/myQuotes" Component={myQuotes}></Route>
        <Route exact path="/addquote" Component={AddQuote}></Route>
        <Route exact path="/mineQuotes" Component={MineQuotes}></Route>
        <Route exact path="/" Component={SignUp}></Route> */}
      </Routes>
    </div>
  );
}

export default Navbar;
