// Live Analytics Chart
const ctx1 = document.getElementById('liveAnalyticsChart').getContext('2d');
new Chart(ctx1, {
  type: 'pie',
  data: {
    labels: ['Active', 'Completed', 'Upcoming'],
    datasets: [{
      label: 'Live Analytics',
      data: [30, 50, 20],
      backgroundColor: ['#20c997', '#3498db', '#9b59b6'],
      borderWidth: 1
    }]
  }
});

// Volunteer Engagement Chart
const ctx2 = document.getElementById('volunteerEngagementChart').getContext('2d');
new Chart(ctx2, {
  type: 'doughnut',
  data: {
    labels: ['Highly Active', 'Moderate', 'Low'],
    datasets: [{
      label: 'Volunteer Engagement',
      data: [15, 60, 25],
      backgroundColor: ['#f1c40f', '#e67e22', '#e74c3c'],
      borderWidth: 1
    }]
  }
});
