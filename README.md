# Task 2

From the master branch of <a href="" target="_blank">`spring-xml-demo`</a> spring-xml-demo repo create a <a href="" target="_blank">`constructor-injection`</a>
branch.

Add constructor to the Actor class to initialize with <a href="" target="_blank">`name`</a> and <a href="" target="_blank">`gender`</a>, and <a href="" target="_blank">`age`</a>

Create three beans of type Actor in the bean definition file.

Use constructor-based injection in the bean definition file (<a href="" target="_blank">`beans.xml`</a>) to inject property values in
each of the three beans via name, index, and type respectively.

For the <a href="" target="_blank">`Movie`</a> bean, use constructor based object injection in the bean definition file
(<a href="" target="_blank">`beans.xml`</a>) to inject an <a href="" target="_blank">`Actor`</a> bean.

In the <a href="" target="_blank">`Main`</a> class, look up <a href="" target="_blank">`Movie`</a> bean using <a href="" target="_blank">`ApplicationContext`</a> and print out Author
information.

Use the same <a href="" target="_blank">`ApplicationContext`</a> to again look up the same <a href="" target="_blank">`Movie`</a> bean.

Print out the equality result of the two <a href="" target="_blank">`Movie`</a> beans.

<a href="" target="_blank">`System.out.println(beanA==beanB)`</a>;

Change the scope of the <a href="" target="_blank">`Movie`</a> bean in <a href="" target="_blank">`beans.xml`</a> to <a href="" target="_blank">`prototype`</a> and run the application again.

Note the output.

Replace <a href="" target="_blank">`id`</a> of the <a href="" target="_blank">`Movie`</a> bean with <a href="" target="_blank">`name`</a> having two values, like this:

<a href="" target="_blank">`<bean name=”MovieA, MovieB” ........>`</a>

Update the code in Main to get the Movie bean by its two different name.

Push the code to <a href="" target="_blank">`constructor-injection`</a> branch.