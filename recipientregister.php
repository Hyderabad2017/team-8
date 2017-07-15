<!DOCTYPE html>
<html>
<body>

<?php
include("connect.php");
//$xml=simplexml_load_file("note.xml") or die("Error: Cannot create object");
$name=$_GET['name'];
$email=$_GET['email'];
$contact=$_GET['contact'];
$pass=$_GET['pass'];
$query="INSERT INTO recipient(name,email,password,contact,blood_request_flag) values('".$name."','".$email."','".$pass."','".$contact."','N')";
$strsql=mysqli_query($db,$query);
?> 

</body>
</html>