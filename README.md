# Task 3

From the <a href="" target="_blank">`constructor-injection`</a> branch of <a href="" target="_blank">`spring-xml-demo`</a> repo create a
<a href="" target="_blank">`autowire-xml`</a> branch.

For the <a href="" target="_blank">`Movie`</a> bean, delete the constructor based object injection in the bean definition file
(<a href="" target="_blank">`beans.xml`</a>) that injects an <a href="" target="_blank">`Actor`</a> bean.

Use autowire byName in the Movie bean to inject an Actor bean.

Run the application.

Create another Movie bean and try autowire byType.

Run the application and note the exception thrown.

Fix the Movie bean by removing autowire byType and using constructor injection instead.

Push the code to <a href="" target="_blank">`autowire-xml`</a> branch.