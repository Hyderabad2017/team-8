<?php
include("connect.php");
$query="SELECT * FROM recipient where blood_group_flag='Y'";
//$strsql=mysqli_query($db,$query);
$strsql=mysqli_query($db,$query);
while($row=mysqli_fetch_assoc($strsql)){
    $name=$row['name'];
    $blood_group=$row['blood_group'];
    $email=$row['email'];
    $contact=$row['contact'];
    echo "<xml><Recipient><name>'".$name."'</name><blood_group>'".$blood_group."'</blood_group><email>'".$email."'</email><contact>'".$contact."'</contact></Recipient>";
    
}
?>