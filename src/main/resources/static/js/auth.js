document.getElementById("loginForm")?.addEventListener("submit", function (e) {
    e.preventDefault();
    // You can replace with your Spring Boot login logic
    alert("Login successful!");
  });
  
  document.getElementById("signupForm")?.addEventListener("submit", function (e) {
    e.preventDefault();
    const inputs = this.querySelectorAll("input");
    const password = inputs[2].value;
    const confirmPassword = inputs[3].value;
  
    if (password !== confirmPassword) {
      alert("Passwords do not match!");
      return;
    }
  
    // You can replace with your Spring Boot signup logic
    alert("Signup successful!");
  });
  