<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Pinterest</title>

    <link rel="stylesheet" href="styles.css" />
    <link rel="stylesheet" href="./styles/normalize.css" />
    <link rel="stylesheet" href="./styles/pin_styles.css" />
    <link rel="stylesheet" href="./styles/modal_styles.css" />
    <link rel="stylesheet" href="./styles/final_board.css" />
    <link rel="stylesheet" href="./styles/styles.css" />
    <script src="scripts/script.js" defer></script>
  </head>
  <body>
    <div class="menu">
      <img draggable="false" href="index.php" class="logo" src="Images/icon.png" alt="" />
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
        </div>        </div>

        <div class="welcometext" style="text-align: center; background-color: #fff; padding: 20px; border-radius: 10px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);">
          <h1 style="color: #333;">Welcome, Minh Tran!</h1>
          <p style="color: #666; font-size: 18px; margin-top: 10px;">Thank you for joining us. We're excited to have you on board.</p>
          <p style="color: #666; font-size: 18px;">Feel free to explore our platform and discover amazing features.</p>
          <p style="color: #666; font-size: 18px;">If you have any questions, <a href="mailto:support@example.com" style="color: #3498db; text-decoration: none; font-weight: bold;">contact our support team</a>.</p>
        </div>
        
  </body>
</html>
