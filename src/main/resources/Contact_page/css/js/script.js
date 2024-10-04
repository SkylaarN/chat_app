document.addEventListener("DOMContentLoaded", () => {
    const contacts = [
        { name: "John Doe", status: "Online", avatar: "john.jpg" },
        { name: "Jane Smith", status: "Offline", avatar: "jane.jpg" },
        // Add more contacts as needed
    ];

    const contactList = document.querySelector(".contact-list");

    contacts.forEach(contact => {
        const contactItem = document.createElement("li");
        contactItem.classList.add("contact-item");

        contactItem.innerHTML = `
            <img src="${contact.avatar}" alt="${contact.name}" class="contact-avatar">
            <div class="contact-info">
                <h2>${contact.name}</h2>
                <p class="status">${contact.status}</p>
            </div>
        `;

        contactList.appendChild(contactItem);
    });
});
