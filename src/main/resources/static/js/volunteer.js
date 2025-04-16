// volunteer-dashboard.js

document.getElementById('upload').addEventListener('change', function () {
  const file = this.files[0];
  if (file) {
    const reader = new FileReader();
    reader.onload = function (e) {
      document.getElementById('profilePic').src = e.target.result;
    }
    reader.readAsDataURL(file);
  }
});

// Feedback submission
const feedbackForm = document.querySelector('.feedback-form button');
feedbackForm.addEventListener('click', () => {
  const textarea = document.querySelector('.feedback-form textarea');
  if (textarea.value.trim()) {
    alert('Feedback submitted successfully!');
    textarea.value = '';
  } else {
    alert('Please enter your feedback first.');
  }
});

// Pie Chart
const pieCtx = document.getElementById('pieChart').getContext('2d');
new Chart(pieCtx, {
  type: 'pie',
  data: {
    labels: ['Attended', 'Missed'],
    datasets: [{
      label: 'Participation Stats',
      data: [75, 25],
      backgroundColor: ['#0a192f', '#c0c0c0']
    }]
  }
});

// Line Graph
const lineCtx = document.getElementById('lineGraph').getContext('2d');
new Chart(lineCtx, {
  type: 'line',
  data: {
    labels: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun'],
    datasets: [{
      label: 'Weekly Activity',
      data: [3, 2, 5, 4, 6, 1, 0],
      borderColor: '#0a192f',
      fill: false,
      tension: 0.1
    }]
  }
});
