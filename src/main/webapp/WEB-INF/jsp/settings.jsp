<html>

<head>
    <jsp:include page="styling.jsp" />
</head>

<body>
    <section class="sectionJungle">
        <div class="center">
            <div style="font-size:68;  text-align: center;" class ="square">
                <select id="select" class="form-select form-select-lg mb-3" aria-label=".form-select-lg example" placeholder>
                        <option value="" selected>Number of players:</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                    </select>
                <div style = "position: relative; top: 10%;"><font color="red">${errorMessage}</font><h3 style="font-size:68" id="number"></h3> Adventurers
                </div>
                <div class="play" style = "position: relative; top: 25%; hover: none"><a id= "startbtn" class="block2" role="button" href="http://localhost:8080/settings">Start!</a></div>
            </div>
        </div>
    </section>
    <script>
    function hideStart() {
        var numberOfPlayers = document.getElementById("select").value;
        document.getElementById("number").innerHTML= numberOfPlayers;
        if (numberOfPlayers) {
            document.getElementById("startbtn").setAttribute("style", "display:inherit")
        } else {
            document.getElementById("startbtn").setAttribute("style", "display:none")
        }
    }
    hideStart();
    document.getElementById("select").addEventListener("change", function() {
        hideStart();
    });
    </script>
</body>

</html>