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
$location=$_GET['location'];
$query="INSERT INTO recipient(name,email,password,contact,blood_request_flag,location) values('".$name."','".$email."','".$pass."','".$contact."','N','".$location."')";
$strsql=mysqli_query($db,$query);
echo "created a new recipient";
?> 

</body>
</html>