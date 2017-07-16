<!DOCTYPE html>
<html>
<body>

<?php
include("connect.php");
//$xml=simplexml_load_file("note.xml") or die("Error: Cannot create object");
$d_name=$_GET['un'];
$blood_group=$_GET['bg'];
$email_id=$_GET['em'];
$contact=$_GET['ph'];
$pass=$_GET['pwd'];
$dob=$_GET['dob'];
$wt=$_GET['wt'];
$ht=$_GET['ht'];
$query="INSERT INTO donor(d_name,blood_group,email_id,contact,password,dob,ht,wt) values('".$d_name."','".$blood_group."','".$email_id."','".$contact."','".$pass."','".$dob."','".$ht."','".$wt."')";
$strsql=mysqli_query($db,$query);
echo "created a new user";
?> 

</body>
</html>