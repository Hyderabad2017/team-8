<?php
include("connect.php");
$recname=$_GET['recname'];
$reccontact=$_GET['reccontact'];
$recemail=$_GET['recemail'];
$donname=$_GET['donname'];
$doncontact=$_GET['doncontact'];
$donemail=$_GET['donemail'];
$blood_group=$_GET['blood_group'];
$query="INSERT INTO confirmdonors values('".$recname."','".$reccontact."','".$recemail."','".$donname."','".$doncontact."','".$donemail."','".$blood_group."')";
$strsql=mysqli_query($db,$query);
?>