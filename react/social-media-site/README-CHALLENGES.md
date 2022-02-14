README

Homework - React Social Media App

My first challenge was knowing how much content needed to be reviewed before having a solid enough base for react to start the project. On day one I watched the content and immediated began building out the app. After a few days I had to restart because I didn't have the solid base to understand what a parent component and child component are. 

My second issue came from my design. I was ambitious and focused entirely on how pretty I wanted the app to be. Initially, I wanted to make a lesbian social media site. This was why I used the color scheme, but I not-so-quickly realized the dummy-api was not going to give me the type of content I would have wanted. I decided to give up on the styling for triangles creating a hexagon. This was a hard thing to let go, so when I finally got the hexagon-triangles to work I was so motivated. 

I did decide to not do my initial mockup of my profile view and that was purely due to time constraints. I also decided to not do the previous and next post as fake buttons or code the functionality because of time constraints. If I had more time I would have also added a comments button to the bottom right triangle on the newsfeed that woudl have an accordion style comment section. 

I had issues with dummyapi. My api calls all worked but would produce data leaks, timeouts, and pure frustration. I then had to add functions that would check the data from the api twice, just in case the first time returned as an empty array. 

The rest of my challenges came from breaking components down correctly and trying to focus on the difference between "a comment" versus "a list of comments". The structuring of the react app honestly made sense to me at first and was almost intuitive until the app grew and then I felt like a stranger to my own code. I fixed this by drawing many versions on paper with arrows showing how the components interact with eachother. 

Resources: 
Sources for styling
- https://css-tricks.com/almanac/selectors/n/nth-child/#:~:text=The%20%3Anth%2Dchild%20selector%20allows,order%2C%20according%20to%20a%20formula.&text=It%20is%20defined%20in%20the,with%20parent%20and%20sibling%20elements.

- https://jsfiddle.net/webtiki/bZxn9/

Sources for API
- https://blog.logrocket.com/how-when-to-force-react-component-re-render/

- https://dummyapi.io/

Mockup of design
- https://www.figma.com/file/S5HQ2UZRSe2KjIcp6IkRaO/MockUp-for-Social-Media-app?node-id=0%3A1