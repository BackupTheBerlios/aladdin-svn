<?php
define('IN_PHPBB', true);
//$phpbb_root_path = (defined('PHPBB_ROOT_PATH')) ? PHPBB_ROOT_PATH : './';
$phpbb_root_path = (defined('PHPBB_ROOT_PATH')) ? PHPBB_ROOT_PATH : 'D:/xampplite/xampplite/htdocs/aladdin/phpBB3/';
$phpEx = substr(strrchr(__FILE__, '.'), 1);
include($phpbb_root_path . 'common.' . $phpEx);
include($phpbb_root_path . 'includes/functions_display.' . $phpEx);
include($phpbb_root_path . 'includes/functions_user.' . $phpEx);

if (trim($_REQUEST['action']) == "password") {

echo "<pre>";
var_dump ($_REQUEST);

	if (!isset($_REQUEST["username"]) || empty($_REQUEST["username"]) || !isset($_REQUEST["password"]) || empty($_REQUEST["password"])) {
		echo 0; 
		echo "\noops...";
		exit;
	}
	
	$username = trim ($_REQUEST["username"]);
	$password = md5 (trim ($_REQUEST["password"]));
	
	$sql = "UPDATE {$table_prefix}users SET password = '" . $password . "' WHERE username like '" . mysql_escape_string ($user["username"]) . "'";
	echo $sql;
	$db->sql_query ($sql);
	exit;
}

if (!isset($_REQUEST["username"]) || empty($_REQUEST["username"]) || !isset($_REQUEST["password"]) || empty($_REQUEST["password"]) || !isset($_REQUEST["type"]) || empty($_REQUEST["type"])) {
	echo 0; 
	exit;
}

$user = array ();
$user["username"] = trim ($_REQUEST["username"]);
$user["username_clean"] = trim ($_REQUEST["username"]);
$user["user_password"] = md5(trim ($_REQUEST["password"]));
$user["user_type"] = 0; // intval($_REQUEST["type"]);
$user["group_id"] = 2;// intval($_REQUEST["type"]);
$user['user_email'] = "aladdin@fokus.fraunhofer.de";

$sql = "SELECT COUNT(*) as cnt FROM {$table_prefix}users WHERE username like '" . mysql_escape_string ($user["username"]) . "'";
$db->sql_query ($sql);
$data = $db->sql_fetchrow();

if ($data["cnt"] == 1) {
	echo 0;
	return;
}

if (isset($_REQUEST["none"]) && $_REQUEST["none"] == 1) {
	echo 1;
	return;
}

$user_id = user_add($user);

if ($user_id == false) echo 0;
else echo $user_id;

?>

