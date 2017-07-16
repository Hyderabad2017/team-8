<?php
include("connect.php");
$query="SELECT donname,doncontact,donemail,blood_group FROM confirmdonors ";
$strsql=mysqli_query($db,$query);
while($row=mysqli_fetch_assoc($strsql)){
    $name=$row['donname'];
    $blood_group=$row['blood_group'];
//    $email=$row['donemail'];
    $contact=$row['doncontact'];
    echo "<xml><Recipient><name>'".$name."'</name><blood_group>'".$blood_group."'</blood_group><contact>'".$contact."'</contact></Recipient>";
    
}
?>