<!-- selectedpic.html -->
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Selected Picture</title>
    <link rel="stylesheet" href="styles/styles.css" />
    <link rel="stylesheet" href="styles/modal_styles.css" />
    <script src="scripts/copyscripts.js" defer></script>
    <script src="scripts/modal_script.js" defer></script>
    <script src="./scripts/selectedpic.js" defer></script>
  </head>
  <style>
    /* Add this to your existing CSS file or create a new one */
    #upload_img_label {
      position: relative;
      width: 100%;
      height: 100%;
      overflow: hidden;
    }

    #upload_img_label img {
      max-width: 100%;
      max-height: 100%;
      width: auto;
      height: auto;
      display: block;
      margin: auto;
    }
    .add_pin_modal {
      margin: 90px;
    }
    #deleteButton {
      justify-content: center;
      position: relative;
      margin: 5px;
    }
    .container {
      margin-top: 700px;
    }
    /* Add this to your existing CSS file or create a new one */
    .mainmenu {
      position: relative; /* Ensure it has a positioning context */
      z-index: 99999; /* Adjust the z-index value based on your needs */
    }

    .focus-bar.btn-bar {
      z-index: 9999; /* Adjust the z-index value based on your needs */
    }
  </style>
  <body>
    <div class="menu">
      <img href="index.php" class="logo" src="Images/icon.png" alt="" />
      <a href="index.php" class="home">Home</a>
      <input
        id="one"
        type="text"
        class="search-bar"
        placeholder="Search"
        oninput="filterPins()"
      />

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

    <!-- Display the selected pic -->
    <div id="selected-image"></div>

    <!-- Add button -->
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
                <div id="dotted_border"></div>
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
              <input type="file" name="upload_img" id="upload_img" />
            </label>

            <div class="modals_pin">
              <div class="pin_image">
                <!-- <img src="" alt="pin_image"> -->
              </div>
            </div>
          </div>

          <div class="section3">
            <button class="save_from_site">Edit</button>
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

              <div class="select_size">
                <!-- ... (your existing code) ... -->
                <div class="save_pin" id="savePinButton">Save</div>
                <button id="deleteButton">Delete</button>
              </div>
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
              id="pin_link"
            />
          </div>
        </div>
      </div>
    </div>

    <div id="pins-container" class="container"></div>
  </body>
</html>
