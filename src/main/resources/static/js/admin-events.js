document.addEventListener("DOMContentLoaded", () => {
    const tableBody = document.getElementById("eventTableBody");
  
    // Dummy events – replace with real data via backend/API
    const events = [
      {
        name: "Health Camp",
        date: "2025-05-01",
        time: "10:00 AM",
        venue: "City Hospital",
        category: "Health"
      },
      {
        name: "Tree Plantation Drive",
        date: "2025-05-10",
        time: "09:30 AM",
        venue: "Central Park",
        category: "Environment"
      }
    ];
  
    events.forEach(event => {
      const row = document.createElement("tr");
  
      row.innerHTML = `
        <td>${event.name}</td>
        <td>${event.date}</td>
        <td>${event.time}</td>
        <td>${event.venue}</td>
        <td>${event.category}</td>
        <td>
          <button class="action-btn">Edit</button>
          <button class="action-btn">Delete</button>
        </td>
      `;
  
      tableBody.appendChild(row);
    });
  });
  
  function showAddEventModal() {
    document.getElementById("addEventModal").style.display = "block";
  }
  
  function closeAddEventModal() {
    document.getElementById("addEventModal").style.display = "none";
  }
  
  function logout() {
    window.location.href = "index.html";
  }
  