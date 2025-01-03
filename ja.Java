// استماع لزر "ضربة حظ"
document.querySelector(".lucky-button").addEventListener("click", function () {
    // الحصول على النص المدخل في شريط البحث
    const query = document.querySelector(".search-bar input").value;

    // إذا كان الحقل فارغًا
    if (query.trim() === "") {
        alert("Please enter a search query.");
        return;
    }

    // توجيه المستخدم إلى أول نتيجة بحث
    const googleSearchURL = `https://www.google.com/search?q=${encodeURIComponent(query)}&btnI=I`;
    window.location.href = googleSearchURL;
});
