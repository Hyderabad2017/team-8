<!DOCTYPE html>
<html>
<body>

<?php
include("connect.php");
$email=$_GET['username'];
$pass=$_GET['password'];
$query="SELECT name from donor where email='".$email."' AND password='".$pass."'";
$strsql=mysqli_query($db,$query);
$results=mysqli_fetch_array($strsql);
    if(count($results)>=1){
        
        echo "<result>'loginsuccess'</result>";
    }
?> 

</body>
</html>