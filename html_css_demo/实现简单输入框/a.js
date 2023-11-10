window.onload = function() {
  const inputEl = document.querySelector('input');
  inputEl.addEventListener('change', function(e) {
    const inputValue = e.target.value;//传递来的String类型的
    alert(inputValue);
  });
};
/*我们首先使用 window.onload 事件监听器等待 DOM 树和其他资源加载完成后执行脚本。
通过 querySelector() 方法获取第一个出现的输入框元素，
并对其添加了一个 change 事件监听器。
当输入框的值发生改变时，这个监听器会执行其中的回调函数，
将输入的值（即用户输入的内容）作为参数传递给 alert() 函数，
从而实现了将输入内容在页面中弹出的功能。
注意，使用 change 事件监听器，这会在用户离开输入框时触发。如果需要在用户每次输入时立即反馈，可以考虑使用 input 事件监听器*/