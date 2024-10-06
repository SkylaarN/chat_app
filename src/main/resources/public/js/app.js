
function sendMessage() {
    const messageInput = document.getElementById('messageInput');
    const chatWindow = document.getElementById('chatWindow');

    const messageText = messageInput.value.trim();


    if (messageText) {
        const messageBubble = document.createElement('div');
        messageBubble.classList.add('message-bubble', 'sent-message');
        messageBubble.textContent = messageText;

        chatWindow.appendChild(messageBubble);

        chatWindow.scrollTop = chatWindow.scrollHeight;

        messageInput.value = '';
    }
}

document.getElementById('messageInput').addEventListener('keypress', function(e) {
    if (e.key === 'Enter') {
        sendMessage();
    }
});
