// var modal = document.getElementsByClassName('modal');

// modal.onmousedown = function(e) {  

//   modal.style.position = 'absolute';
//   moveAt(e);
//   document.body.appendChild(modal);

//   modal.style.zIndex = 1000; 

//   function moveAt(e) {
//     modal.style.left = e.pageX - modal.offsetWidth / 2 + 'px';
//     modal.style.top = e.pageY - modal.offsetHeight / 2 + 'px';
//   }

//   document.onmousemove = function(e) {
//     moveAt(e);
//   }

//   modal.onmouseup = function() {
//     document.onmousemove = null;
//     modal.onmouseup = null;
//   }
// }