<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="styles/newuser.css" />
  <script src="scripts/newuser.js" defer></script>
  <title>Register success</title>
</head>
<body>
<section>

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
        </nav>
      </div>
    </div>
  </div>
  
  <nav>
    <h1>Welcome.</h1>
    <h2>Registration complete successfully</h2>
    <h3>Please check your registered email for email verification.</h3>
  </nav>


  <?php
extract($_REQUEST);
$file = fopen("data.txt", "a");

fwrite($file, "User Name : ");
fwrite($file, isset($login) ? $login . "\n" : "N/A\n");

fwrite($file, "Email : ");
fwrite($file, isset($email) ? $email . "\n" : "N/A\n");

fwrite($file, "Password : ");
fwrite($file, $pass ?? "N/A" . "\n");  // Use $pass directly or "N/A" if it's not set

fwrite($file, "--------------------\n");
fwrite($file, "====================\n");



fclose($file);
?>




</section>

</body>
</html>