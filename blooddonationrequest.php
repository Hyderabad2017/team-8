<?php
include("connect.php");
$blood_group="b+ve";
$query="UPDATE recipient set blood_request_flag='Y', blood_group="+$blood_group;
$strsql=mysqli_query($db,$query);
$results=mysqli_fetch_array($strsql);
if(count($results)>=1){
    $d_name-$results['username'];
    $blood_group=$results['blood_group'];
    $email_id=$results['email_id'];
    $contact=$results['contact'];
    $password=$results['password'];
    $dob=$results['dob'];
    $wt=$results['wt'];
    $ht=$results['ht'];
    
}
?>