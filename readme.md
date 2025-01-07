### MapStruct beans injection error
Idea reports error "Could not autowire. There is more than one bean..." if:
- the project is built (i.e. the implementation is generated)
- the injection by name can't be performed
https://youtrack.jetbrains.com/issue/IDEA-364665