# Task 1

Create a Maven project and add required dependency of <a href="" target="_blank">`spring-context 5.1.4.RELEASE`</a>

Create a <a href="" target="_blank">`Main`</a> class in package <a href="" target="_blank">`com.stackroute`</a> and two Spring Beans – <a href="" target="_blank">`Movie`</a>, and <a href="" target="_blank">`Actor`</a> in
package <a href="" target="_blank">`com.stackroute.domain`</a>.

<a href="" target="_blank">`Actor`</a> has two <a href="" target="_blank">`String`</a> properties, <a href="" target="_blank">`name`</a> and <a href="" target="_blank">`gender`</a>, and an <a href="" target="_blank">`age`</a> property of type <a href="" target="_blank">`int`</a>.

An <a href="" target="_blank">`Actor`</a> can be initialized with the three properties via the corresponding setter methods. Use
property based injection in the bean definition file (beans.xml)

An <a href="" target="_blank">`Movie`</a> *“has a”* An <a href="" target="_blank">`Actor`</a>  that can be initialized via the corresponding setter method. Use property
based object injection in the bean definition file (beans.xml)

The <a href="" target="_blank">`Main`</a> class looks up <a href="" target="_blank">`Movie`</a> bean via three ways to print out actor information:

1. Using <a href="" target="_blank">`XmlBeanFactory`</a>
2. Using Spring 3.2 <a href="" target="_blank">`BeanDefinitionRegistry`</a> and <a href="" target="_blank">`BeanDefinitionReader`</a>
3. Using <a href="" target="_blank">`ApplicationContext`</a>

Create a <a href="" target="_blank">`spring-xml-demo`</a> repo and push the code to master branch.

