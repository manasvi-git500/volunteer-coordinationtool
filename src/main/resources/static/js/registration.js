document.getElementById('volunteerForm').addEventListener('submit', function (e) {
    e.preventDefault();
    
    // Get values
    const name = document.getElementById('name').value.trim();
    const email = document.getElementById('email').value.trim();
    const phone = document.getElementById('phone').value.trim();
    const skills = document.getElementById('skills').value.trim();
    const availability = document.getElementById('availability').value.trim();
  
    // For now, just alert the submission (you can later send this to a backend)
    alert(`Thank you, ${name}! Your registration is received.`);
    
    // Optionally reset the form
    this.reset();
  });
  