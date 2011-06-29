package com.aladdin.sc.config;

/**
 * Class with the configuration values
 * @author Andrey Baboshin
 *
 */
public class Configuration {
	/**
	 * Path to hibernate config file
	 */
	public static String hibernateCfg = "/hibernate-aladdin-sc.cfg.xml";
	/**
	 * Path to forum sc.php
	 */
	public static String forumSC = "http://dafnis.atosorigin.es/aladdin/phpBB3/includes/sc.php";
	/**
	 * List of trusted IP
	 */
	public static String trustedIP[] = {"193.174.152.114", "127.0.0.1"};
	
	private Configuration () {
	}
}
