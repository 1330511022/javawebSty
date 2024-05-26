function getNews() {
    var category = document.getElementById("newsCategory").value;
    var url = "GetNewsServlet?category=" + category;
    window.location.href = url;
}