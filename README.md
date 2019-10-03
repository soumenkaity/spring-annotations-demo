# Task 5

From the <a href="" target="_blank">`aware-interface`</a> branch of s<a href="" target="_blank">`spring-xml-demo`</a> repo create a <a href="" target="_blank">`bean-lifecycle`</a>
branch.

Add a <a href="" target="_blank">`BeanLifeCycleDemoBean`</a> class in <a href="" target="_blank">`com.stackroute.demo`</a> that implements
<a href="" target="_blank">`InitializingBean`</a> and <a href="" target="_blank">`DisposableBean`</a>.

Override the required methods to print out messages.

Define <a href="" target="_blank">`BeanLifeCycleDemoBean`</a> as a bean in <a href="" target="_blank">`beans.xml`</a>.

Run the application and observe the result.

Add two methods <a href="" target="_blank">`customInit()`</a> and <a href="" target="_blank">`customDestroy()`</a> to the <a href="" target="_blank">`BeanLifeCycleDemoBean`</a>
class and print out custom messages.

In the <a href="" target="_blank">`BeanLifeCycleDemoBean`</a> bean definition, in <a href="" target="_blank">`beans.xml`</a>, set the <a href="" target="_blank">`customInit()`</a>
and <a href="" target="_blank">`customDestroy`</a> methods to be called.

Run the application.

Push the code to <a href="" target="_blank">`bean-lifecycle`</a> branch.