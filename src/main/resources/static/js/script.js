// Charts
const ctx1 = document.getElementById('volunteerChart').getContext('2d');
const ctx2 = document.getElementById('eventChart').getContext('2d');

new Chart(ctx1, {
  type: 'pie',
  data: {
    labels: ['Health', 'Education', 'Environment'],
    datasets: [{
      label: 'Volunteer Distribution',
      data: [120, 90, 60],
      backgroundColor: ['#4caf50', '#2196f3', '#ff9800']
    }]
  }
});

new Chart(ctx2, {
  type: 'bar',
  data: {
    labels: ['Jan', 'Feb', 'Mar', 'Apr'],
    datasets: [{
      label: 'Events Created',
      data: [3, 6, 4, 7],
      backgroundColor: '#0b5ed7'
    }]
  }
});

// Calendar
document.addEventListener('DOMContentLoaded', function () {
  const calendarEl = document.getElementById('calendar');
  const calendar = new FullCalendar.Calendar(calendarEl, {
    initialView: 'dayGridMonth',
    events: [
      { title: 'Health Camp', date: '2025-04-15' },
      { title: 'Education Drive', date: '2025-04-20' },
      { title: 'Environmental Cleanup', date: '2025-04-25' }
    ]
  });
  calendar.render();
});

// Download CSV
function downloadCSV() {
  const csvContent = "data:text/csv;charset=utf-8,"
    + ["Event,Date,Status", "Health Camp,2025-04-15,Completed", "Education Drive,2025-04-20,Upcoming"].join("\n");
  const encodedUri = encodeURI(csvContent);
  const link = document.createElement("a");
  link.setAttribute("href", encodedUri);
  link.setAttribute("download", "attendance_report.csv");
  document.body.appendChild(link);
  link.click();
}
