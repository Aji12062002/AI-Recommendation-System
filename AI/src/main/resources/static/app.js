window.onload = function() {
  fetch('/api/recommendations?userId=1')
    .then(response => response.json())
    .then(data => {
      const list = document.getElementById('recommendations');
      data.forEach(product => {
        const li = document.createElement('li');
        li.textContent = product.name;
        list.appendChild(li);
      });
    })
    .catch(err => console.error('Error fetching recommendations:', err));
};
