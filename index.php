<!DOCTYPE html>
<html>
<body>

<?php
include("connect.php");
$xml=simplexml_load_file("note.xml") or die("Error: Cannot create object");
$d_name=$xml->to;
$blood_group=$xml->from;
$email_id=$xml->heading;
$contact=$xml->body;
$pass=$xml->to;
$dob=$xml->from;
$wt=$xml->heading;
$ht=$xml->body;
$query="INSERT INTO donor(d_name,blood_group,email_id,contact,password,dob,ht,wt) values('".$d_name."','".$blood_group."','".$email_id."','".$contact."','".$pass."','".$dob."','".$wt."','".$ht."')"


?> 

</body>
</html>