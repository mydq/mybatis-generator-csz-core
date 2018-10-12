package test;

import org.mybatis.generator.api.ShellRunner;

/**
 * 
 */

/**
 * @author csz
 *
 */
public class DaoGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{

		String mysql_config=DaoGenerator.class.getResource("/generatorMybatis-mysql.xml").getPath();
		System.out.println(mysql_config);
		ShellRunner.main(new String[]{"-configfile", mysql_config, "-overwrite"});
	}

}
