<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    
    <head>
        <meta charset="utf-8" name="sabi">
        <!-- css -->
        <link rel="stylesheet"  href="bootstrap/css/bootstrap-grid.min.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        
        <title>page authentification</title>
    </head>
    <body>
        <div class="container-fluid grid">
            <div class="container_description">
            
            </div>
            <div class="container_identification">
                <form class="user" method="post" action="">
                    
                        <label for="mail">Mail</label>
                        <input type="text" name="mail" id="mail">
                        <br/>
                        <label for="pass">Mot de passe</label>
                        <input type="text" name="pass" id="pass">
                        <br/>
                    
                </form>
            </div>
        </div>
    
        <!-- script -->
        <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="javaScript/app.js"></script>
    </body>
</html>