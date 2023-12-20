// Minh Thong Tran 041058827
// Selectedpic.js
document.addEventListener('DOMContentLoaded', function () {
    const uploadImgLabel = document.getElementById('upload_img_label');
    const deleteButton = document.getElementById('deleteButton');

    // Function to get query parameters from URL
    function getQueryParam(name) {
        const urlParams = new URLSearchParams(window.location.search);
        return urlParams.get(name);
    }

    // Create an img element and set its source based on the selected image
    const img = document.createElement('img');
    img.src = `images/drawings/${getQueryParam('imageName')}`;
    img.alt = getQueryParam('alt');

    // Append the image to the upload_img_label container
    uploadImgLabel.innerHTML = ''; // Clear previous content
    uploadImgLabel.appendChild(img);

    // Check if the Delete button exists
    if (deleteButton) {
        // Add event listener for the Delete button
        deleteButton.addEventListener('click', function () {
            // Display a confirmation pop-up
            const isConfirmed = confirm('Are you sure you want to delete this image?');

            // If the user confirms, proceed with the deletion
            if (isConfirmed) {
                deleteImage();
            }
        });
    }

    // Function to delete the image
    function deleteImage() {
        // Display a "Delete success" pop-up
        alert('Delete success');

        // Hide the displayed image
        img.style.display = 'none';
    }



    // Add event listener for the Edit button
    const editButton = document.querySelector('.save_from_site');
    if (editButton) {
        editButton.addEventListener('click', editPin);
    }

   // Modify the editPin function to use the pinId directly
   function editPin() {
    const updatedPin = {
        UserProfileImageName: document.getElementById('pin_title').value,
        content: document.getElementById('pin_description').value,
        Link: document.getElementById('pin_link').value,
    };

    // Log the updated pinData (for testing)
    console.log(updatedPin);

    // Get the pinId from the query parameter
    const pinId = getQueryParam('pinId');

    // Find the pin in pinsData based on pinId
    const pinToUpdate = pinsData.find(pin => `pin${pin.id}` === pinId);

    // Update the pinData with the edited values
    pinToUpdate.userProfileImageName = updatedPin.UserProfileImageName;
    pinToUpdate.content = updatedPin.content;
    pinToUpdate.link = updatedPin.Link;

    // Update the displayed content on the page
    updatePinContent(pinToUpdate);

    // Display a "Edit success" pop-up notification
    alert('Edit success');
}


// Function to update the displayed pin content
function updatePinContent(pinToUpdate) {
    const pinId = `pin${pinToUpdate.id}`;
    const pinElement = document.getElementById(pinId);

    // Update the title content
    pinElement.querySelector('.user').alt = pinToUpdate.userProfileImageName;

    // Update the content
    pinElement.querySelector('.content').textContent = pinToUpdate.content;

    // Update the link
    pinElement.querySelector('.bottom-bar a').textContent = `↗ ${pinToUpdate.link}`;
}
});
