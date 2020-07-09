<html>
<body>
<h2>target test </h2>
<!--affichage des valeurs recupérées dans le servlet-->
<%= request.getParameter("nom") %>
<%= request.getParameter("prenom") %>

<!--lecture de l heure de connexion-->
    <%= request.getAttribute("login_time") %>
</body>
</html>
