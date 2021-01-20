<html>

<head>
<jsp:include page="styling.jsp" />
</head>

<body>
    <section class= "sectionFreek">
        <div class="container text-center">
            <h2 style="color:white"><span>Welkom to </span><em>THE</em><span><br />Freek Fonk Game!<br /></span></h2></div>
            <div class="play"><a name="settingsLink" class="block" role="button" href="#">Play now!</a></div>
    </section>

    <script>
        <jsp:useBean id = "pages" class = "com.springboot.freekfonk.config.PageStructure"></jsp:useBean>
        <jsp:include page="utilsJs.jsp"/>
        document.getElementsByName("settingsLink").forEach(function (e) {
            e.setAttribute("href", "<jsp:getProperty name="pages"
                                                property="settings" />");
        })
    </script>
</body>

</html>