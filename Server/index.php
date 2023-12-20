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
      </div>
    </div>
    <!--------------------------->
    <div class="filter-buttons">
      <button onclick="filterByCategory('Landscape')">Landscape</button>
      <button onclick="filterByCategory('Building')">Building</button>
      <button onclick="filterByCategory('People')">People</button>
      <!-- Add more buttons for additional filters -->
    </div>
    <!--------------------------->
    <!-- Container for Pinterest-like pins -->
    <div id="pins-container" class="container"></div>

    
  <!-- Selected pic -->
<div id="selected-image"></div>



<!-- Part 2: Add Button -->
<div class="navigation_bar">
  <div class="pint_mock_icon_container add_pin">
    <img src="./images/add.png" alt="add_pin" class="pint_mock_icon" />
  </div>
</div>

<div class="pin_container"></div>

<div class="add_pin_modal">
  <div class="add_pin_container">
    <div class="side" id="left_side">
      <div class="section1">
        <div class="pint_mock_icon_container">
          <img
            src="./images/ellipse.png"
            alt="edit"
            class="pint_mock_icon"
          />
        </div>
      </div>

      <div class="section2">
        <label for="upload_img" id="upload_img_label">
          <div class="upload_img_container">
            <div id="dotted_border">
              <div class="pint_mock_icon_container">
                <img
                  src="./images/up-arrow.png"
                  alt="upload_img"
                  class="pint_mock_icon"
                />
              </div>
              <div>Click to upload</div>
              <div>
                Recommendation: Use high-quality .jpg files less than 20MB
              </div>
            </div>
          </div>
          <input type="file" name="upload_img" id="upload_img" />
        </label>

        <div class="modals_pin">
          <div class="pin_image">
            <!-- <img src="" alt="pin_image"> -->
          </div>
        </div>
      </div>

      <div class="section3">
        <div class="save_from_site">Save From Site</div>
      </div>
    </div>

    <div class="side" id="right_side">
      <div class="section1">
        <div class="select_size">
          <select
            name="pin_size"
            id="pin_size"
            aria-label="Select Pin Size"
          >
            <option value="" disabled selected>Select</option>
            <option value="small">small</option>
            <option value="medium">medium</option>
            <option value="large">large</option>
          </select>

          <div class="save_pin">Save</div>
        </div>
      </div>

      <div class="section2">
        <input
          placeholder="Add your title"
          type="text"
          class="new_pin_input"
          id="pin_title"
        />
        <input
          placeholder="Tell everyone what your Pin is about"
          type="text"
          class="new_pin_input"
          id="pin_description"
        />
        <input
          placeholder="Add a destination link"
          type="text"
          class="new_pin_input"
          id="pin_destination"
        />
      </div>
    </div>
  </div>
</div>

<script src="./scripts/final_board.js"></script>
  </body>
</html>
