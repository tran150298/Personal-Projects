<!DOCTYPE html>
  <html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="styles/newuser.css" />
    <script src="scripts/newuser.js" defer></script>
    <title>Log In</title>
  </head>
  <body>
    <div class="menu">
          <img href="index.php" draggable="false"  class="logo" src="Images/icon.png" alt="" />
          <a href="index.php" class="home">Home</a>
          <input id="one" type="text" class="search-bar" placeholder="Search" oninput="filterPins()" />
          
          <div class="icon-container">
            <img
              tabindex="1"
              draggable="false"
              class="icon bell"
              src="Images/bellicon.jfif"
              title="Notification"
              alt="Notification"
            />
            <img
              tabindex="1"
              draggable="false"
              class="icon message"
              src="Images/messicon.jfif"
              title="Message"
              alt="Message"
            />
            <a href="user1.php">
              <img
                tabindex="1"
                draggable="false"
                class="icon pp"
                src="Images/useravatar/avtar1.jpg"
                title="Your Profile"
                alt="User Avatar"
              />
            </a>
            <img
              tabindex="4"
              draggable="false"
              class="icon btn"
              src="Images/moreicon.jfif"
              title="Setting"
              alt=""
            />
    
            <!----FOCUS----->
            <div tabindex="1" class="focus-bar bell-bar">nothing</div>
            <!-------------------->
            <div tabindex="1" class="focus-bar message-bar">you are alone</div>
            <!-------------------->
            <div tabindex="1" class="focus-bar pp-bar"></div>
            <!-------------------->
            <div tabindex="1" class="focus-bar btn-bar">
              <nav class="mainmenu">
                <a href="">Currently Logged</a>
                <a href="newuser.php">Add New Account</a>
                <a href="">Setting</a>
                <a href="">Give Feedback</a>
                <a href="">Support</a>
    
            </div>
          </div>
        </div>
        <p>
          <b>It is necessary to login in Your account in order to save pictures.</b>
        </p>
      
        <form action="submit.php" method="post" onsubmit="return validate();">
          <!-- Register Form -->
          <div class="container">
            <h2>Register With Us!</h2>
            <!-- Username -->
            <div class="form-control">
              <label for="username">Username</label>
              <input type="text" id="login" name="login" value="" placeholder="Enter Username">
              <small id="smallusername">Error message</small>
            </div>
            <!-- Email -->
            <div class="form-control">
              <label for="email">Email</label>
              <input type="text" id="Email" name="email" value="" placeholder="Enter Email">
              <small id="smallemail">Error message</small>
            </div>
            <!-- Password -->
            <div class="form-control">
              <label for="password">Password</label>
              <input type="password" id="pass" name="pass" value="" placeholder="Enter Password">
              <small id="smallpassword">Error message</small>
            </div>
            <!-- Password validation -->
            <div class="form-control">
              <label for="password2">Verify Password</label>
              <input type="password" id="pass2" name="pass2" value="" placeholder="Enter Password Again">
              <small id="smallpassword2">Error message</small>
            </div>
            <input type="submit" name="button" value="Submit">
          </div>

    <!-- Login Form -->

      </section>
      <div class="login-form">
        <h5 class="formTitle2">ALREADY A MEMBER? LOGIN</h5>
        <label class="email-span2">
          <input type="text" name="UserNameLogin" placeholder="User name" />
        </label>
        <label class="email-span3">
          <input type="text" name="Password" placeholder="Password" />
        </label>
        <p>
          <input
            type="checkbox"
            class="checkBox"
            name="rememberMe"
            value="yes"
          />Remember me?
        </p>
        <div class="loginRow">
          <input type="submit" class="login" value="Login" />
        </div>
        <p class="forgotPass">Forgot Password</p>
      </div>
      </form>

      <script src="scripts/newuser.js" defer></script>
    </body>
    </html>