https://medium.com/@amritlalsahu5/visitor-design-pattern-364c712f46ca

When to use the Visitor Design Pattern:
Use the Visitor when you need to perform distinct and unrelated operation on all elements of a complex object structure.
The classes defining the object structure rarely change, however you often want to define the new operation over the structure. Therefore, new operation can be added to the visitor hierarchy by not polluting the existing design.
Element object has to accept the visitor object so that visitor object handles the operation on the element object.