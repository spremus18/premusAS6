<?php
        $op = $_POST["op"];
        if($op == uploadScheduleInfo) {
            $val = $_POST[$val];
            $cmd = "java -classpath /var/www/cgi-bin:/var/www/cgi-bin/mysql-connector-java-5.1.23-bin.jar datasel.server $op $val";
        }
        else if($op == getSchedule) {
           $skill = $_POST[$skill];
           $day = $_POST[$day];
           $hour = $_POST[$hour];
           $cmd = "java -classpath /var/www/cgi-bin:/var/www/cgi-bin/mysql-connector-java-5.1.23-bin.jar datasel.server $op $val";
	}
	//print($cmd);
	$str = shell_exec($cmd);
	print($str);
?>
