// Minh Thong Tran 041058827
// script.js

// Function to shuffle an array using Fisher-Yates algorithm
function shuffleArray(array) {
    for (let i = array.length - 1; i > 0; i--) {
        const j = Math.floor(Math.random() * (i + 1));
        [array[i], array[j]] = [array[j], array[i]];
    }
  }
  
  // Sample data representing information about each pin
  const pinsData = [
    {
      imageName: '1.jpg',
      content: 'lamp ',
      userProfileImageName: ' pic 1',
      link: 'google.com',
      id:'1',
      alt: 'line pen light',
      navigateIconName: 'navigateicon.png'
    },{
        imageName: '2.jpg',
        content: 'Beautiful Landscape',
        userProfileImageName: 'user1.jpg',
        link: 'website.com',
        id:'2',
        alt: 'line pen',
        navigateIconName: 'navigateicon.png'
      },{
        imageName: '3.jpg',
        content: 'avtar2',
        userProfileImageName: '  ',
        link: 'example',
        id:'3',
        alt: 'art line pen',
        navigateIconName: 'navigateicon.png'  
      }, {
        imageName: '4.jpg',
        content: 'Beautiful Landscape',
        userProfileImageName: '  ',
        link: 'website.com',
        id:'4',
        alt: 'art line pen',
        navigateIconName: 'navigateicon.png'
      },{
          imageName: '5.jpg',
          content: 'Beautiful Landscape',
          userProfileImageName: 'user1.jpg',
          link: 'webs.com',
          id:'5',
          alt: 'art line pen',
          navigateIconName: 'navigateicon.png'
        },{
          imageName: '6.jpg',
          content: 'avtar2',
          userProfileImageName: '  ',
          link: 'example',
          id:'6',
          alt: 'art building line pen',
          navigateIconName: 'navigateicon.png'  
        }, {
          imageName: '7.jpg',
          content: 'Beautiful Landscape',
          userProfileImageName: '  ',
          link: 'website.com',
          id:'7',
          alt: 'building art line pen',
          navigateIconName: 'navigateicon.png'
        },{
            imageName: '8.jpg',
            content: 'Beautiful Landscape',
            userProfileImageName: 'user1.jpg',
            link: '',
            id:'8',
            alt: 'landscape line pen',
            navigateIconName: 'navigateicon.png'
          }, {
            imageName: '9.jpg',
            content: 'Beautiful Landscape',
            userProfileImageName: '',
            link: 'website.com',
            id:'9',
            alt: 'building art line pen',
            navigateIconName: 'navigateicon.png'
          },{
              imageName: '10.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'10',
              alt: 'landscape muontain line pen',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '11.png',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'11',
              alt: 'galaxy water color',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '12.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'12',
              alt: 'animal water color',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '13.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'13',
              alt: 'galaxy water color',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '14.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'14',
              alt: 'brush',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '15.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'15',
              alt: 'water color beach',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '16.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'16',
              alt: 'building landscape line pen',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '17.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'17',
              alt: 'landscape water color',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '18.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'18',
              alt: 'landscape line pen building',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '19.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'19',
              alt: 'marker building landscape line pen',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '20.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'20',
              alt: 'building marker ',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '21.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'21',
              alt: 'building marker ',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '22.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',id:'22',
              alt: 'building marker ',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '23.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'23',
              alt: 'building marker ',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '24.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'24',
              alt: 'building marker ',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '25.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'25',
              alt: 'building marker ',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '30.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'26',
              alt: 'building marker ',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '31.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'27',
              alt: 'building marker ',
              navigateIconName: 'navigateicon.png'
            },
            {
              imageName: '32.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'28',
              alt: 'landscape line pen',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '34.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'29',
              alt: ' line pen people',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: 'avtar1.jpg',
              content: 'hehehehehe',
              userProfileImageName: 'user1.jpg',
              link: 'pinterest.com',
              id:'30',
              alt: 'dog people',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '26.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'31',
              alt: 'building landscape',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '27.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'32',
              alt: 'line pen',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '28.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'33',
              alt: 'landscape people water color tree',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '29.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'34',
              alt: 'tree water color landscape',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '32.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'35',
              alt: 'building line pen',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '35.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'36',
              alt: 'tree line pen',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '36.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'37',
              alt: 'tree line pen landscape',
              navigateIconName: 'navigateicon.png'
            },{
              imageName: '37.jpg',
              content: 'Beautiful Landscape',
              userProfileImageName: 'user1.jpg',
              link: '',
              id:'38',
              alt: 'tree landscape line pen',
              navigateIconName: 'navigateicon.png'
            }
  ];
  
  // Shuffle the array
  // shuffleArray(pinsData);
  
  // Now pinsData is in a random order
  console.log(pinsData);
  
  
  // ...
  function createPin(pinData, index) {
    const pinElement = document.createElement('div');
    const pinId = `pin${index}`;
    pinElement.id = pinId; // Set pinId as the id attribute
    pinElement.classList.add('window');
    
  
    // Add link to selectedpic.html with query parameters for the clicked picture
    const selectedPicLink = `selectedpic.php?imageName=${pinData.imageName}&content=${pinData.content}&userProfileImageName=${pinData.userProfileImageName}&link=${pinData.link}&alt=${pinData.alt}&pinId=${pinId}`;
  
    pinElement.innerHTML = `
    <a href="${selectedPicLink}">
      <img class="foto" src="images/drawings/${pinData.imageName}" alt="${pinData.alt}" />
    </a>
    <p class="content">${pinData.content}</p>
    <img class="user" src="images/${pinData.userProfileImageName}" alt="${pinData.alt}" />
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
        </div>
      </div>
    </div>
  `;
  
  
  document.getElementById('pins-container').appendChild(pinElement);
    
    // Add click event listener to the created pin
    pinElement.addEventListener('click', function () {
      window.location.href = selectedPicLink; // Redirect to the selectedpic.html page
    });
  
    // Add click event listener for the Edit button in the top-bar
    pinElement.querySelector('.hover-zone .top-bar p').addEventListener('click', function (event) {
      event.stopPropagation();
      console.log("Edit Clicked for Pin:", index);
      editPin(index); // Pass the correct index here
  });
  
    
  
    // pinsData.forEach((pinData, index) => createPin(pinData, index));
    // editPin();
    // updatePinContent();
  }
  
  
  // editPin();
  // updatePinContent();
  
  // Loop through the pins data and create each pin
  pinsData.forEach((pinData, index) => createPin(pinData, index));
  // editPin();
  // updatePinContent();
  
  
  
  
  // Function to filter pins based on the search input
  function filterPins() {
    const filterValue = document.getElementById("one").value.toLowerCase();
    const pins = document.querySelectorAll(".window");
  
    pins.forEach(function (pin) {
        const altText = pin.querySelector('.user').alt.toLowerCase();
        if (altText.includes(filterValue) || filterValue === "") {
            pin.style.display = "block";
        } else {
            pin.style.display = "none";
        }
    });
  }
  
  
  
  // JS to make filters buttons work
  function filterByCategory(category) {
    const pins = document.querySelectorAll('.window');
  
    pins.forEach(function (pin) {
      const altText = pin.querySelector('.user').alt.toLowerCase();
      const pinCategory = getCategoryFromAlt(altText);
  
      if (category.toLowerCase() === pinCategory.toLowerCase() || category.toLowerCase() === 'all') {
        pin.style.display = 'block';
      } else {
        pin.style.display = 'none';
      }
    });
  }
  
  function getCategoryFromAlt(altText) {
    // Logic to extract the category from alt text.
    // Modify this based on how your alt text is structured.
    // For example, if alt text is "Landscape - Image Description", you can extract "Landscape".
    const categories = ['Landscape', 'Building', 'People']; // Add more categories as needed
  
    for (const category of categories) {
      if (altText.includes(category.toLowerCase())) {
        return category;
      }
    }
  
    return 'Other';
  }
  
  
  
  
  
  
  