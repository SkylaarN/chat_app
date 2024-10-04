// Function to send the message
function sendMessage() {
    const messageInput = document.getElementById('messageInput');
    const chatWindow = document.getElementById('chatWindow');
    const messageText = messageInput.value.trim();

    // Check if message is not empty
    if (messageText !== '') {
        // Create a new div for the message
        const messageBubble = document.createElement('div');
        messageBubble.classList.add('message-bubble', 'sent-message');

        // Add the message text to the bubble
        messageBubble.textContent = messageText;

        // Append the bubble to the chat window
        chatWindow.appendChild(messageBubble);

        // Scroll to the bottom of the chat window
        chatWindow.scrollTop = chatWindow.scrollHeight;

        // Clear the input field
        messageInput.value = '';
    }
}

// Allow pressing Enter to send message
document.getElementById('messageInput').addEventListener('keypress', function(e) {
    if (e.key === 'Enter') {
        sendMessage();
    }
});
