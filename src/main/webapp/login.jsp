<%@ page import="java.util.Date"%>
<html>
<body>
<h2>Utilisateur</h2>
<form action="./target_test" method="post">
    <div>
        <label for="nom">Nom :</label>
        <input type="text" id="nom" name="nom">
    </div>
    <div>
        <label for="prenom">Prenom</label>
        <input type="text" id="prenom" name="prenom">
    </div>
<div class="button">
        <button type="submit">Envoyer les donnees</button>
    </div>
</form>


</body>
</html>