<%@ page import="java.util.Date"%>
<html>
<body>
<h2>Utilisateur</h2>
<form action="./target_test" method="post">
    <div>
        <label for="name">Nom :</label>
        <input type="text" id="name" name="user_name">
    </div>
    <div>
        <label for="prenom">Prenom</label>
        <input type="text" id="mail" name="user_mail">
    </div>
<div class="button">
        <button type="submit">Envoyer les donnees</button>
    </div>
</form>


</body>
</html>