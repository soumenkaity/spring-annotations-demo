# Task 3

From the <a href="" target="_blank">`constructor-injection`</a> branch of <a href="" target="_blank">`spring-xml-demo`</a> repo create a
<a href="" target="_blank">`autowire-xml`</a> branch.

For the <a href="" target="_blank">`Movie`</a> bean, delete the constructor based object injection in the bean definition file
(<a href="" target="_blank">`beans.xml`</a>) that injects an <a href="" target="_blank">`Actor`</a> bean.

Use autowire <a href="" target="_blank">`byName`</a> in the <a href="" target="_blank">`Movie`</a> bean to inject an <a href="" target="_blank">`Actor`</a> bean.

Run the application.

Create another <a href="" target="_blank">`Movie`</a> bean and try autowire <a href="" target="_blank">`byType`</a>.

Run the application and note the exception thrown.

Fix the <a href="" target="_blank">`Movie`</a> bean by removing autowire <a href="" target="_blank">`byType`</a> and using constructor injection instead.

Push the code to <a href="" target="_blank">`autowire-xml`</a> branch.