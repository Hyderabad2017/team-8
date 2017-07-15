<!DOCTYPE html>
<html>
<body>

<?php
include("connect.php");
$xml=simplexml_load_file("note.xml") or die("Error: Cannot create object");
$d_name=$_GET['d_name'];
$blood_group=$_GET['blood_group'];
$email_id=$_GET['email_id'];
$contact=$_GET['contact'];
$pass=$_GET['pass'];
$dob=$_GET['dob'];
$wt=$_GET['wt'];
$ht=$_GET['ht'];
$query="INSERT INTO donor(d_name,blood_group,email_id,contact,password,dob,ht,wt) values('".$d_name."','".$blood_group."','".$email_id."','".$contact."','".$pass."','".$dob."','".$wt."','".$ht."')";
$strsql=mysqli_query($db,$query);
?> 

</body>
</html>