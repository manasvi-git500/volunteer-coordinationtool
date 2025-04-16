function showSection(sectionId) {
    const sections = document.querySelectorAll('.dashboard-section');
    sections.forEach(section => {
      section.style.display = 'none';
    });
  
    const target = document.getElementById(sectionId);
    if (target) {
      target.style.display = 'block';
    }
  }
  
  // Default: show attendance section
  document.addEventListener('DOMContentLoaded', () => {
    showSection('attendance');
  });
  