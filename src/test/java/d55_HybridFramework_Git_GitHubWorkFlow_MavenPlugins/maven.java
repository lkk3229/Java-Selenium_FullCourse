package d55_HybridFramework_Git_GitHubWorkFlow_MavenPlugins;

public class maven {

	
}

/*
pom.xml
====================
dependencies ---> download required dependency jar for project
plugins ---> to compile and run the project

1. maven compiler plugin
2. maven surefire plugin

===> Maven Plugins
==================================================================

Pre-requisites for Git
-----------------------------
1. Git installation
2. Create an account with GitHub

git pull repoUrl   ==> used for getting updated code from git to our local

=============================================================================
<build>
   <pluginManagement>
   
   		<plugins>
   		  <plugin>
   			 <groupId>org.apache.maven.plugins</groupId>
   			 <artifactId>maven-compiler-plugin</artifactId>
   			 <version>3.11.0</version>
   		  </plugin>
   		  
   		  <plugin>
   			 <groupId>org.apache.maven.plugins</groupId>
   			 <artifactId>maven-surefire-plugin-plugin</artifactId>
   			 <version>3.2.2</version>
   			 <configuration>
   			 	<suiteXmlFiles>
   			 		<suiteXmlFile>master.xml</suiteXmlFile>
   			 	</suiteXmlFiles>
   			 </configuration>
   		  </plugin>
   
        </plugins>
   
   </pluginManagement>
  
  
  </build>
*/