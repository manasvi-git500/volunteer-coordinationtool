document.addEventListener("DOMContentLoaded", () => {
    const registrations = [
      { name: "Alice", event: "Health Camp", date: "2025-05-01", time: "10:00 AM" },
      { name: "Bob", event: "Education Drive", date: "2025-05-03", time: "11:00 AM" }
    ];
  
    const attendance = [
      { name: "Alice", event: "Health Camp", status: "Attended" },
      { name: "Bob", event: "Education Drive", status: "Missed" }
    ];
  
    const assignments = [
      { name: "Alice", assignment: "Health Report", date: "2025-04-15" },
      { name: "Bob", assignment: "Education Summary", date: "2025-04-16" }
    ];
  
    const populateTable = (data, tableId, keys) => {
      const table = document.getElementById(tableId);
      data.forEach(item => {
        const row = document.createElement("tr");
        row.innerHTML = keys.map(key => `<td>${item[key]}</td>`).join("");
        table.appendChild(row);
      });
    };
  
    populateTable(registrations, "registrationTable", ["name", "event", "date", "time"]);
    populateTable(attendance, "attendanceTable", ["name", "event", "status"]);
    populateTable(assignments, "assignmentTable", ["name", "assignment", "date"]);
  });
  
  function exportReport(type) {
    alert(`Generating and downloading ${type} report...`);
    // Replace with real report export logic via backend
  }
  
  function logout() {
    window.location.href = "index.html";
  }
  