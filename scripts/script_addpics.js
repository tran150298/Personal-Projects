// Minh Thong Tran 041058827
// script.js

// Sample data representing information about each pin
const pinsData = [
    {
      imageName: 'avtar1.jpg',
      content: 'Beautiful Landscape',
      userProfileImageName: '',
      link: 'website.com',
      shareIconName: 'shareicon.png',
      navigateIconName: 'navigateicon.png'
    },{
        imageName: 'icon.png',
        content: 'Beautiful Landscape',
        userProfileImageName: 'user1.jpg',
        link: 'websiteeeeee.com',
        shareIconName: 'shareicon.png',
        navigateIconName: 'navigateicon.png'
      },{
        imageName: '222.png',
        content: 'avtar2',
        userProfileImageName: '',
        link: 'example',
        shareIconName: 'shareicon.png',
        navigateIconName: 'navigateicon.png'
      }
  ];
  
  // Function to create and append a pin to the container
  function createPin(pinData) {
    const pinElement = document.createElement('div');
    pinElement.classList.add('window');
  
    pinElement.innerHTML = `
        <img alt="${pinData.content}" class="foto" src="images/drawings/${pinData.imageName}" />
        <p class="content">${pinData.content}</p>
        <img class="user" src="images/${pinData.userProfileImageName}" alt="" />
        <a class="username" href="${pinData.link}"></a>
  
        <div class="hover-zone">
          <div class="top-bar">
            <p>Profile ⌵</p>
            <a>Save</a>
          </div>
          <div class="bottom-bar">
            <a>↗ ${pinData.link}</a>
            <div class="radius-ico">
              <img alt="" draggable="false" src="Images/shareicon.png" />
              <img alt="" draggable="false" src="Images/navigateicon.png" />
              />
          </div>
        </div>
      `;
  
    document.getElementById('pins-container').appendChild(pinElement);
  }
  
  // Loop through the pins data and create each pin
  pinsData.forEach(createPin);
  