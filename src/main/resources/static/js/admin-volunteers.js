document.addEventListener("DOMContentLoaded", () => {
    const tableBody = document.getElementById("volunteerTableBody");
  
    // Simulated volunteer data – replace with API call in production
    const volunteers = [
      {
        name: "John Doe",
        email: "john@example.com",
        role: "Volunteer",
        status: "Active",
        events: 4
      },
      {
        name: "Jane Smith",
        email: "jane@example.com",
        role: "Volunteer",
        status: "Inactive",
        events: 2
      }
    ];
  
    volunteers.forEach(vol => {
      const row = document.createElement("tr");
  
      row.innerHTML = `
        <td>${vol.name}</td>
        <td>${vol.email}</td>
        <td>${vol.role}</td>
        <td>${vol.status}</td>
        <td>${vol.events}</td>
      `;
  
      tableBody.appendChild(row);
    });
  });
  
  function logout() {
    window.location.href = "index.html";
  }
  