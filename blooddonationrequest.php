<?php
include("connect.php");
$blood_group="b+ve";
$query="UPDATE recipient set blood_group_flag='Y', blood_group='$blood_group' where name='AaroriBloodBank'";
$strsql=mysqli_query($db,$query);
?>