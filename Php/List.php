<?php
$con = mysqli_connect("localhost","came1230","Healthking1!","came1230");
$result = mysqli_query($con, "SELECT * FROM USER;");
$response = array();

while ($row = mysqli_fetch_array($result))
{
	array_push($response, array("userID" =>$row[0], "userPassword" =>$row[1], "userName"=>$row[2], "userAge"=>$row[3]));
}

echo json_encode(array("response" => $response));
mysqli_close($con);

?>