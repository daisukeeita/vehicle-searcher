# VEHICLE SEARCHER
A simulation for searching a vehicle. 
It gives the details of the vehicle if it is officially registered to the
database.

## TECH STACK
- Language: Java 25

## DEPENDENCIES
- Jackson Databind
- Junit5
- DotENV

## PROJECT STATUS AND PROGRESS
| Task | Status | Notes |
|:--: | :--: | :--: |
| Core Feature | Progress | Created an initial server. |
| User Authentication | To be decided | Currently seeing the pros of having user authentication for this application |
| API Documentation | To Do | Planned for the next version |
| README Content | Progress | Need to update tasks and progress |

### PROGRESS

- Created DTO for requesting a vehicle detail from the third-party API.
- Created DTO for sending a filtered vehicle detail to the client.
- Created object to capture raw data from the response of the third-party API.
- Added Jackson Annotations to capture raw key name from third-part API.
- Implemented the HttpClient.
- Tested the created objects.
- Implemented Jackson for converting received JSON data.
- Created the initial server.
- Initially handled the query of GET method.

### To-Do
- Manipulate the QUERY string of GET method.
- Create a server that accepts request and sends the result 
    - success and failed results
- Control the threading pool of the server.
- Convert sending the request from synchronous to asynchronous state.
- Create an exception class and handle the messages it'll throw.
