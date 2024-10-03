document.addEventListener("DOMContentLoaded", function () {
    // Mock dataset for file information
    const fileData = {
        photoThumbnails: [
            'https://example.com/photo1.jpg',  // Most recent photos
            'https://example.com/photo2.jpg',
        ],
        videoThumbnails: [],
        fileList: [],
        audioFiles: [],
        sharedLinks: [],
        voiceMessages: []
    };

    // update counts, which start from zero
    document.getElementById('photo-count').textContent = fileData.photoThumbnails.length;
    document.getElementById('video-count').textContent = fileData.videoThumbnails.length;
    document.getElementById('file-count').textContent = fileData.fileList.length;
    document.getElementById('audio-count').textContent = fileData.audioFiles.length;
    document.getElementById('link-count').textContent = fileData.sharedLinks.length;
    document.getElementById('voice-count').textContent = fileData.voiceMessages.length;

    // Update photo thumbnails dynamically based on available photos
    const photoContainer = document.getElementById('photo-thumbnails');
    fileData.photoThumbnails.forEach((thumbnail, index) => {
        const img = document.createElement('img');
        img.src = thumbnail;
        img.alt = `Photo ${index}`; // Photo numbering starts from zero
        img.classList.add('thumbnail'); // Apply the class for styling
        photoContainer.appendChild(img); // Append each photo thumbnail to the container
    });

    // Insert the photo-thumbnails div after the photos list item
    const photoListItem = document.querySelector('.files ul li:nth-child(1)');
    photoListItem.insertAdjacentElement('afterend', photoContainer);
});