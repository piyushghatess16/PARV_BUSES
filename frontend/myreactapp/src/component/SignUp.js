function Signup() {
  return (
    <>
      <form style={{width:"30%",left:"450px",position:"absolute",boxShadow:"10px 10px 10px 5px grey",padding:"20px",marginTop:"10px"}}>
      <div class="form-group">
          <label for="exampleInputEmail1">Firstname</label>
          <input
            type="text"
            class="form-control"
            id="firstname"
            aria-describedby="emailHelp"
            placeholder="Enter firstname"
          />
        </div>
        <div class="form-group">
          <label for="exampleInputPassword1">Lastname</label>
          <input
            type="text"
            class="form-control"
            id="lastname"
            placeholder="Enter Lastname"
          />
        </div>
        <div class="form-group">
          <label for="exampleInputPassword1">Gender</label>
          {/* <input
            type="text"
            class="form-control"
            id="lastname"
            placeholder="Enter Lastname"
          /> */}

          <select className="form-control">
            <option value="M" key="">MALE</option>
            <option value="F" key="">FEMALE</option>
            <option value="O" key="">OTHER</option>
          </select>
        </div>

        <div class="form-group">
          <label for="exampleInputPassword1">Mobile No</label>
          <input
            type="text"
            class="form-control"
            id="mobile"
            placeholder="Enter mobile"
          />
        </div>

        <div class="form-group">
          <label for="exampleInputEmail1">Email address</label>
          <input
            type="email"
            class="form-control"
            id="exampleInputEmail1"
            aria-describedby="emailHelp"
            placeholder="Enter email"
          />
        </div>
        <div class="form-group">
          <label for="exampleInputPassword1">Password</label>
          <input
            type="password"
            class="form-control"
            id="exampleInputPassword1"
            placeholder="Password"
          />
        </div>
        <div class="form-check">
          <input type="checkbox" class="form-check-input" id="exampleCheck1" />
          <label class="form-check-label" for="exampleCheck1">
            Check me out
          </label>
        </div>
        <button type="submit" class="btn btn-primary">
          Register
        </button>
      </form>
    </>
  );
}

export default Signup;
